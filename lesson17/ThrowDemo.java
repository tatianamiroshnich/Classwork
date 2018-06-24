package lesson17;

/**
 * Created by student on 6/24/2018.
 */
public class ThrowDemo {
    public static void main(String[] args) {
        String login, password, confirmPassword;
        System.out.println(verify("Fox", "250198", "250198"));
        System.out.println(verify("Dog", "1111", "1111"));
        System.out.println(verify("Login", "111111111111111111111", "111111111111111111111"));
    }

    public static boolean verify(String login, String password, String confirmPassword) {
        try {

            if (login.length() > 20) {
                throw new WrongLoginExeption("Login more than 20. ");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordExeption("Password is not correct. ");
            }

        } catch (WrongLoginExeption | WrongPasswordExeption e) {
            System.out.print(e.getMessage());
            return false;
        }finally {
            System.out.println("\n"+login + " " + password + " " + confirmPassword);
        }
        return true;
    }
}
