package passwordvalidator;
public class PasswordValidator {
    private String password;
    public PasswordValidator(String password) {
        this.password = password;
    }
    public boolean isValid() {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasNumber;
    }
}
