public class Main {
    public static void main(String[] args) {
        String password = "1234";
        String login = "1111";
        String confirmPassword = "2222";
        try {
            Registration.registration(login, password, confirmPassword);
            System.out.println("Все работает");
        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.printStackTrace();
        } System.out.println("Конец");
    }
}