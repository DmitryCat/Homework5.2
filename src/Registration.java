public class Registration {
    private static final String LEGAL_CHARACTERS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_";

    public static void registration(String login, String password, String confirmPassword) {
        registrationLogin(login);
        registrationPassword(password, confirmPassword);
    }
    private static void registrationLogin(String login) {
        for (int i = 0; i < login.length(); i++) {
            if (LEGAL_CHARACTERS.indexOf(login.charAt(i)) == -1) {
                throw new WrongLoginException("В логине недопустимые символы");
            }
        }
        if (login.length() > 20) {
            throw new WrongLoginException("Логин превышает допустимое количество символов");
        }
    }

    private static void registrationPassword(String password, String confirmPassword) {
        for (int i = 0; i < password.length(); i++) {
            if (LEGAL_CHARACTERS.indexOf(password.charAt(i)) == -1) {
                throw new WrongLoginException("В логине недопустимые символы");
            }
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Логин превышает допустимое количество символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }
    }
}

