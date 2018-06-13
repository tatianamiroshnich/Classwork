package lesson14;

/**
 * Created by student on 13.06.2018.
 */
public class User3 {
    private static String login = "login1", password = "password1";

    public static void initializeData(String login, String password) {
        User3.login = login;
        User3.password = password;
    }

    public static class Query {
        public void printToLog() {
            System.out.printf("Пользователь %s с паролем " +
                    "%s отправил запрос.\n", login, password);
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public String toString() {
        return "User3{}";
    }

    public static void main(String[] args) {
        User3.Query query = new User3.Query();
        query.printToLog();
    }
}
