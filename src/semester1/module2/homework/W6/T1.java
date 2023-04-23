package semester1.module2.homework.W6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class T1 {
    public interface Playable {
        List<String> play();

        List<String> playWith(Playable playable);
    }

    public static abstract class Instrument implements Playable {
        String sound;
        int times;

        public Instrument(String sound, int times) {
            this.sound = sound;
            this.times = times;
        }

        @Override
        public List<String> play() {
            List<String> list = new ArrayList<>();
            list.add((sound + " ").repeat(times).strip());
            return list;
        }

        @Override
        public List<String> playWith(Playable playable) {
            List<String> list = new ArrayList<>();

            list.addAll(play());
            list.addAll(playable.play());

            return list;
        }
    }

    public static class Guitar extends Instrument {
        Guitar() {
            super("�����", 2);
        }
    }

    public static class Drum extends Instrument {
        Drum() {
            super("���", 3);
        }
    }

    public static class Orchestra implements Playable {
        List<Instrument> instruments = new ArrayList<>();

        public List<Instrument> getInstruments() {
            return instruments;
        }

        public Orchestra(Instrument... instruments) {
            this.instruments.addAll(List.of(instruments));
        }

        @Override
        public List<String> play() {
            List<String> list = new ArrayList<>();
            for (Instrument i : instruments) {
                list.add(i.play().get(0));
            }
            return list;
        }

        @Override
        public List<String> playWith(Playable playable) {
            List<String> list = new ArrayList<>();
            list.addAll(play());
            list.addAll(playable.play());
            return list;
        }
    }

    public static void main(String[] args) {
        var guitar = new Guitar();
        var drum = new Drum();
        print("Guitar: ������ ���������", true);
        print("Drum:   ������� ��������", true);
        print("Guitar: play Guitar ������ ���� " + GUITAR_R, Objects.equals(guitar.play().get(0), GUITAR_R));
        print("Drum:   play Drum ������ ���� " + DRUM_R, Objects.equals(drum.play().get(0), DRUM_R));
        print("Guitar: playWith Drum ������ ������", Objects.equals(guitar.playWith(drum).get(0), GUITAR_R));
        print("Guitar: playWith Drum ��������� �������", Objects.equals(guitar.playWith(drum).get(1), DRUM_R));
        print("Drum:   playWith Guitar ������ �������", Objects.equals(drum.playWith(guitar).get(0), DRUM_R));
        print("Drum:   playWith Guitar ��������� ������", Objects.equals(drum.playWith(guitar).get(1), GUITAR_R));

        var emptyOrchestra = new Orchestra();
        var orchestra = new Orchestra(new Guitar(), new Drum(), new Guitar(), new Drum());
        print("EmptyOrchestra: ������ ������� ��������", true);
        print("EmptyOrchestra: ����������� ������ ���� ������ �������", emptyOrchestra.getInstruments() != null);
        print("Orchestra: ������� ��������", true);
        print("Orchestra: � �������� ������ ���� 4 �����������", orchestra.getInstruments().size() == 4);
        print("Orchestra: ������ ������� 4 �����������", orchestra.play().size() == 4);
        print("Orchestra: ������ ������ ������", Objects.equals(orchestra.play().get(0), GUITAR_R));
        print("Orchestra: ������� ������ ������", Objects.equals(orchestra.play().get(1), DRUM_R));
        print("Orchestra: ������ ������ ������", Objects.equals(orchestra.play().get(2), GUITAR_R));
        print("Orchestra: ������� ������ ���������", Objects.equals(orchestra.play().get(3), DRUM_R));
        print("Orchestra: ������ ������� 5 ������������", orchestra.playWith(new Guitar()).size() == 5);
        print("Orchestra: ������ ������ ���������", Objects.equals(orchestra.playWith(new Guitar()).get(4), GUITAR_R));
    }

    /* ����������� ������ - ���� ������ ������ �� ���� */

    private static void print(String condition, Boolean act) {
        Function<String, String> yellow = str -> "\u001B[33m" + str + "\u001B[0m";
        System.out.print("TEST CASE " + yellow.apply(constLen(condition, 55)));
        if (act) System.out.print("+");
        else System.out.print("-");
        System.out.println();
    }

    private static String constLen(String str, int len) {
        StringBuilder sb = new StringBuilder(str);
        while (len-- - str.length() > 0) sb.append(" ");
        return sb.toString();
    }

    private static final String GUITAR_R = "����� �����";
    private static final String DRUM_R = "��� ��� ���";
}
