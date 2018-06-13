package lesson14;

/**
 * Created by student on 13.06.2018.
 */
public class User2 {
    private String login,password;

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createQuery(){
        class Query{
            public void printToLog(){
                System.out.printf("Пользователь %s с паролем " +
                        "%s отправил запрос.\n",login,password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User2)) return false;

        User2 user2 = (User2) o;

        if (login != null ? !login.equals(user2.login) : user2.login != null) return false;
        return password != null ? password.equals(user2.password) : user2.password == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User2{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User2 user = new User2("login1","password1");
        user.createQuery();
    }
}
