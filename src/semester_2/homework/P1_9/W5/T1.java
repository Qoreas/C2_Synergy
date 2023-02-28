package semester_2.homework.P1_9.W5;

import java.util.HashMap;
import java.util.Map;

public class T1 {
    public static class PersonDead extends Exception {
        public PersonDead(String message) {
            super(message);
        }
    }

    public static class Person {
        private String name;
        private Integer health;
        private Integer protection;

        protected Person(String name, Integer protection, Integer health) {
            this.name = name;
            this.protection = protection;
            this.health = health;
        }

        public Person(String name) {
            this.name = name;
            health = 50;
            protection = 0;
        }

        public Integer getProtection() {
            return protection;
        }

        public Integer getHealth() {
            return health;
        }

        public String announce() {
            return "Person " + name + " has the characteristics: "
                    + health + " health and " + protection + " protection";
        }

        public void takeDamage(Integer damage) throws Exception {
            if (damage < 0) throw new Exception(damage.toString());

            health = health - (damage - protection);

            if (health < 0) health = 0;
            if (health == 0) throw new PersonDead(name);
        }

        public Integer facePunch() {
            return 1;
        }
    }

    public static class Mage extends Person {

        public Mage(String name) {
            super(name, 15, 100);
        }

        @Override
        public String announce() {
            return "Mage " + super.announce();
        }

        @Override
        public void takeDamage(Integer damage) throws Exception {
            Integer result = getHealth() - (damage - getProtection() - getHealth() % 10);
            super.takeDamage(result);
        }

        public Integer fireBall() {
            return 45;
        }
    }

    public static class Archer extends Person {

        public Archer(String name) {
            super(name, 12, 120);
        }

        @Override
        public String announce() {
            return "Archer " + super.announce();
        }

        @Override
        public void takeDamage(Integer damage) throws Exception {
            int result = getHealth() - (damage - getProtection() + getHealth() % 10);
            super.takeDamage(result);
        }

        public Integer shootBow() {
            return 40 + getHealth() % 10;
        }
    }

    /*
   ��� ����� main - ����� play ��� �� ��������� �����.
   ������ �� ����� � ������, ��� ��� �������� ��� ��� �� ��������� ���� �������.
   ��������� ������ � ����� ���������� ������� - ��� ������ ��� ���������� �� ����� �� �����.
   ���� ���������� �� �����������, ���� �� ��� �� ��������, ����� �� ����������.
   */
    public static void main(String[] args) throws Exception {
        ANSIColor color = new ANSIColor();
        boolean firstCheck;
        boolean secondCheck;
        boolean thirdCheck = false;

        Person person = new Person(PERSON_NAME);
        System.out.println(color.type("green", "Tests for Person"));
        test("Person: ����� 50 �������� � 0 ������", person.getHealth() == 50 && person.getProtection() == 0);
        test("Person: announce() �������� ���", person.announce().contains(PERSON_NAME));
        test("Person: announce() �������� ��������", person.announce().contains(PERSON_HEALTH.toString()));
        test("Person: announce() �������� ������", person.announce().contains(PERSON_PROTECTION.toString()));
        test("Person: facePunch() ������� 1 ����", person.facePunch() == 1);
        try {
            person.takeDamage(DAMAGE1);
            test("Person: takeDamage() ���� ����������� ���������", person.getHealth() == 20);
            person.takeDamage(DAMAGE1);
        } catch (PersonDead e) {
            test("Person: takeDamage() �������� �� ���������� ������ ����", person.getHealth() == 0);
            test("Person: ����� PersonDead()", true);
        }

        Mage mage = new Mage(MAGE_NAME);
        System.out.println(color.type("green", "Tests for Mage"));
        test("Mage: ����������� �� Person", mage instanceof Person);
        test("Mage: ����� 100 �������� � 15 ������", mage.getHealth() == 100 && mage.getProtection() == 15);
        test("Mage: announce() �������� ���", mage.announce().contains(MAGE_NAME));
        test("Mage: announce() �������� ��������", mage.announce().contains(MAGE_HEALTH.toString()));
        test("Mage: announce() �������� ������", mage.announce().contains(MAGE_HEALTH.toString()));
        test("Mage: fireBall() ������� 45 �����", mage.fireBall() == 45);
        mage.takeDamage(DAMAGE1);
        firstCheck = mage.getHealth() == 85;
        mage.takeDamage(DAMAGE1);
        secondCheck = mage.getHealth() == 75;
        test("Mage: takeDamage() ��������� �� �������", firstCheck && secondCheck);
        try {
            mage.takeDamage(DAMAGE2);
        } catch (PersonDead e) {
            thirdCheck = true;
        }
        test("Mage: ����� ���������� PersonDead()", thirdCheck);

        thirdCheck = false;
        Archer archer = new Archer(ARCHER_NAME);
        System.out.println(color.type("green", "Tests for Archer"));
        test("Archer: ����������� �� Person", archer instanceof Person);
        test("Archer: ����� 120 �������� � 12 ������", archer.getHealth() == 120 && archer.getProtection() == 12);
        test("Archer: announce() �������� ���", archer.announce().contains(ARCHER_NAME));
        test("Archer: announce() �������� ��������", archer.announce().contains(ARCHER_HEALTH.toString()));
        test("Archer: announce() �������� ������", archer.announce().contains(ARCHER_PROTECTION.toString()));
        test("Archer: shootBow() ��������� �� �������", archer.shootBow() == 40 + archer.getHealth() % 10);
        archer.takeDamage(DAMAGE1);
        firstCheck = archer.getHealth() == 102;
        archer.takeDamage(DAMAGE1);
        test("Archer: shootBow() ��������� �� �������", archer.shootBow() == 40 + archer.getHealth() % 10);
        secondCheck = archer.getHealth() == 82;
        try {
            archer.takeDamage(DAMAGE2);
        } catch (PersonDead e) {
            thirdCheck = true;
        }
        test("Archer: takeDamage() ��������� �� �������", firstCheck && secondCheck);
        test("Archer: ����� PersonDead()", thirdCheck);
    }

    /* ����������� ������ - ���� ������ ������ �� ���� */

    private static void test(String expression, Boolean condition) {
        ANSIColor color = new ANSIColor();
        System.out.print("TEST CASE " + color.type("yellow+bold", normalOutput(expression, 60)));
        if (condition)
            System.out.println("+");
        else
            System.out.println("-");
    }

    private static String normalOutput(String str, int len) {
        StringBuilder sb = new StringBuilder(str);
        while ((len--) - str.length() > 0)
            sb.append(" ");
        return sb.toString();
    }

    private final static String PERSON_NAME = "NamePerson";
    private final static String MAGE_NAME = "NameMage";
    private final static String ARCHER_NAME = "NameArcher";
    private final static Integer PERSON_HEALTH = 50;
    private final static Integer PERSON_PROTECTION = 0;
    private final static Integer MAGE_HEALTH = 100;
    private final static Integer MAGE_PROTECTION = 15;
    private final static Integer ARCHER_HEALTH = 120;
    private final static Integer ARCHER_PROTECTION = 12;
    private final static Integer DAMAGE1 = 30;
    private final static Integer DAMAGE2 = 1000;

    private static class ANSIColor {
        public Map<String, String> ansiColors = new HashMap<>();

        {
            ansiColors.put("reset", "\u001B[0m");
            ansiColors.put("black", "\u001B[30m");
            ansiColors.put("red", "\u001B[31m");
            ansiColors.put("green", "\u001B[32m");
            ansiColors.put("light_yellow", "\u001B[93m");
            ansiColors.put("yellow", "\u001B[33m");
            ansiColors.put("yellow_background", "\u001B[43m");
            ansiColors.put("blue", "\u001B[34m");
            ansiColors.put("purple", "\u001B[35m");
            ansiColors.put("cyan", "\u001B[36m");
            ansiColors.put("white", "\u001B[37m");
            ansiColors.put("bold", "\u001B[1m");
            ansiColors.put("stop_bold", "\u001B[21m");
            ansiColors.put("underground", "\u001B[4m");
            ansiColors.put("stop_underground", "\u001B[24m");
            ansiColors.put("blink", "\u001B[5m");
        }

        public String type(String color, String message) {
            String[] colors = color.split("\\+");
            StringBuilder sb = new StringBuilder();
            for (String colorr : colors) {
                if (ansiColors.get(colorr.toLowerCase()) == null)
                    throw new RuntimeException("Unknown ANSI color: " + colorr);
                sb.append(ansiColors.get(colorr.toLowerCase()));
            }
            return sb.toString() + message + ansiColors.get("reset");
        }
    }
}