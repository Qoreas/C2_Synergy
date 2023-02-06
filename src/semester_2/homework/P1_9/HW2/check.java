package semester_2.homework.P1_9.HW2;

public class check {
    private static boolean checkCharCase(String login) {
        boolean isHave = false;
        for (int i = 0; i < login.length(); i++) {
            String lower = login.toLowerCase().substring(i);
            String upper = login.toUpperCase().substring(i);
            if (login.contains(lower) || login.contains(upper)) {
                isHave = true;
                break;
            }
        }
        return isHave;
    }
    // доработать
    public static void validateLogin(String login) {
        boolean onlyLatin = login.matches("^[a-zA-Z0-9]+$");
        boolean checkUnderscore = login.contains("_");
        boolean checkLength = login.length() < 20;
        boolean checkCase = checkCharCase(login);
        if (onlyLatin && checkUnderscore && checkLength && checkCase) {
            System.out.println("all good");
        } else {
            System.out.println("bad");
        }
    }
}
