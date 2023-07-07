package semester1.module3.classwork.W6_Repeat.Interface;

public class Test {
    public static void main(String[] args) {
        MyFuncInter inter;
        inter = str -> {
            if (str.equals("Hi")) {
                return "God";
            } else return "sh@t";
        };

        System.out.println(inter.say("f"));

    }
}
