import java.security.KeyStore;

public class PasswordChecker
{
    // Hardcoded Password, could put an input scanner as an option

    static String password = "Software@1";

    // Assignments

    static int len;
    static {
        len = password.length();
    }
    static boolean lCase;
    static boolean uCase;
    static boolean pLength;
    static boolean authentic = false;
    static boolean Num;
    static int incrNum;
    public static void main (String[] args) {

        // Check for Lower case letters

        if (password.equals(password.toUpperCase())) {
            System.out.println("Must contain lower case letter.");
            lCase = false;
        } else
            lCase = true;

        //Check for Upper case letters

        if (password.equals(password.toLowerCase())) {
            System.out.println("Must contain Upper case letter.");
            uCase = false;
        } else
            uCase = true;

        //Check for Password Lengths

        if (len <= 8) {
            System.out.println("Password must be at least 8 characters");
            pLength = false;
        } else
            pLength = true;

        // Check for Numbers

        Num = false;
        incrNum = 0;
        for (;incrNum <= 9; incrNum++) {
            if (password.contains(String.valueOf(incrNum))) {
                Num = true;
                break;
            }
        }
        if (!Num)
        {
            System.out.println("Must contain number.");
        }



        if (lCase) {
            if (uCase) {
                if (pLength) {
                    if (Num) {
                        System.out.println("Acceptable");
                        authentic = true;
                        } else
                        System.out.println("Password Unacceptable");
                    } else
                    System.out.println("Password Unacceptable");
                } else
                    System.out.println("Password Unacceptable");
            } else
                System.out.println("Password Unacceptable");
        if (authentic == false)
        {
            System.out.println("Your Password does not meet necessary criteria, try again");
        }
    }
}