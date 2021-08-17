public class PasswordChecker
{
    static String password = "marmite";
    static int len = password.length();
    public static void main (String[] args)
    {
        if (password.equals(password.toUpperCase()))
        {
            System.out.println("Must contain lower case letter.");
        }
        if (password.equals(password.toLowerCase()))
        {
            System.out.println("Must contain Upper case letter.");
        }
        if (len <= 8)
        {
            System.out.println("Password must be at least 8 characters");
        }
        else
        {
            System.out.println("Acceptable");
        }
    }
}


