package lesson14;

public class User {
    private String login,password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query{
        public void printToLog(){
            System.out.printf("Пользователь %s с паролем " +
                    "%s отправил запрос.\n",login,password);
        }
    }

    public User() {
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
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user1 = new User("login1","password1");
        user1.createQuery();

        User.Query query1 = user1.new Query();
        query1.printToLog();

        User.Query query2 = new User("login3","password3").new Query();
        query2.printToLog();

    }
}
