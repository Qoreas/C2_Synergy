package semester1.module3.classwork.W6_Repeat.Ex3_sort_comparable;

public class Wizard implements Comparable<Wizard>{
    int hp;
    int mana;
    String name;

    public Wizard(int hp, int mana, String name) {
        this.hp = hp;
        this.mana = mana;
        this.name = name;
    }

    public int hp() {
        return hp;
    }

    @Override
    public int compareTo(Wizard o) {
        return this.mana - o.mana;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "hp=" + hp +
                ", mana=" + mana +
                ", name='" + name + '\'' +
                '}';
    }
}
