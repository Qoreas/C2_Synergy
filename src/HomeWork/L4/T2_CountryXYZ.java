package HomeWork.L4;

public class T2_CountryXYZ {
    public static void main(String[] args) {
        int civil = 10_000_000;
        int burn = 140_000; // per 10m
        int death = 80_000; // per 10m
        int years = 10;

        for (int i = 0; i <= years; i++) {
            civil += burn - death;
        }

        System.out.println(civil);
    }
}
