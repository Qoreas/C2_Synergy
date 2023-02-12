package semester_2.homework.P1_9.HW2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class LoginValidationException extends Exception {

    /**
     * �������:
     * 1. �������� ��������� ����� LoginValidationException, ����������� ��� �� Exception
     * 2. ���������� �������� "������" � ������ validateLogin �� ��������� ��������:
     * - ������ ��������� ������ ��������� �����, ����� � ���� �������������
     * - ������ ��������� ��� ������� ���� ���������, ���� ������� ����� � ������ �������������
     * - ������������ ������ ������- 20 ��������
     * - ���� ����� �� ������������� ����������� - ��������� LoginValidationException
     * - ����� ������������ ���������� ���������
     * 3. ���������� �������� ������ � ������ isLoginValid �� ��������� ��������
     * - ����� ������ �������� ����� validateLogin
     * - ���� ����� validateLogin �� �������� ������ - ������� true
     * - ���� ����� validateLogin �������� ������ - ������� false
     */

    public static List<String> loginList = Arrays.asList(
            "Minecraft_12",                                     // true
            "Player_3433",                                      // true
            "Dok_a111",                                         // true
            "Java",                                             // false
            "1122233",                                          // false
            "Play__",                                           // false
            "_Sun2_",                                           // true
            "____",                                             // false
            "Winx!",                                            // false
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa12_",            // false
            "WOWOWOOWOWOWOOWOWOWOWOWOW",                        // false
            "Correct_22"                                        // true
    );

    public static List<Boolean> checkLoginResults = Arrays.asList(
            true, true, true, false, false, false, true, false, false, false, false, true
    );

    public static void main(String[] args) {
        System.out.println("\nTests for validateLogin");
        AntiCheat.run();
        for (int i = 0; i < loginList.size(); i++) {
            try {
                validateLogin(loginList.get(i));
                printTestCase(i, checkLoginResults.get(i), true, 20);
            } catch (Exception e) {
                printTestCase(i, checkLoginResults.get(i), false, 20);
            }
        }

        System.out.println("\nTests for isLoginValid");
        AntiCheat.run();
        for (int i = 0; i < loginList.size(); i++)
            printTestCase(i + loginList.size(),
                    checkLoginResults.get(i),
                    isLoginValid(loginList.get(i)),
                    20);
    }

    public static void validateLogin(String login) throws LoginValidationException {
        boolean checkUnderSpace = login.contains("_");
        boolean checkLatinNums = login.matches("^[a-zA-Z0-9_]{1,20}$");
        if (!(checkLatinNums && checkUnderSpace)) {
            throw new LoginValidationException();
        }
    }

    public static Boolean isLoginValid(String login) {
        try {
            validateLogin(login);
        } catch (LoginValidationException ex) {
            return false;
        }
        return true;
    }

    public static class AntiCheat {
        public static void run() {
            StringBuilder sb = new StringBuilder("");
            List<String> antiCheatList = new ArrayList<>();
            antiCheatList.addAll(loginList);
            antiCheatList.addAll(checkLoginResults.stream().map(Object::toString).toList());
            antiCheatList.add(sb.toString());
            calcHash(antiCheatList);
        }


        public static String bytesToHex(byte[] bytes) {
            char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
            char[] hexChars = new char[bytes.length * 2];
            for (int j = 0; j < bytes.length; j++) {
                int v = bytes[j] & 0xFF;
                hexChars[j * 2] = HEX_ARRAY[v >>> 4];
                hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
            }
            return new String(hexChars);
        }

        public static void calcHash(List<String> list) {
            String total = String.join("", list);
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(total.getBytes());
                byte[] digest = md.digest();
                System.out.println("AntiCheatCheck: " + bytesToHex(digest));
            } catch (NoSuchAlgorithmException ignored) {
            }
        }
    }

    public static String constLen(String str, int len) {
        StringBuilder sb = new StringBuilder(str);
        while (len-- - str.length() > 0) sb.append(" ");
        return sb.toString();
    }

    public static void printTestCase(int n, Boolean exp, Boolean act, int minLen) {
        Function<String, String> green = str -> "\u001B[34m" + str + "\u001B[0m";
        Function<String, String> yellow = str -> "\u001B[33m" + str + "\u001B[0m";
        System.out.print("TEST CASE " + constLen(String.valueOf(n), 4));
        System.out.print("��������: " + yellow.apply(constLen(exp.toString(), minLen)) + " ����������: " + green.apply(constLen(act.toString(), minLen) + " "));
        if (Objects.equals(exp, act)) System.out.print("?");
        else System.out.print("?");
        System.out.println();
    }
}