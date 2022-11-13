package HomeWork.L4;

public class T2_CountryXYZ {
    public static void main(String[] args) {
        int civil = 10_000_000;
        int percent = 1000;
        int years = 10;

        int burn = civil / percent * 14;
        int death = civil / percent * 8;

        for (int i = 0; i <= years; i++) {
            civil += burn - death;
        }

        System.out.println(civil);
    }
}
