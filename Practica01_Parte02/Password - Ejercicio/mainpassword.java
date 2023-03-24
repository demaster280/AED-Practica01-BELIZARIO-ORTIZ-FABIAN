
package passwordvalidator;

import java.util.Scanner;

public class MainPasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una contrasena: ");
        String password = scanner.nextLine();
        PasswordValidator validator = new PasswordValidator(password);
        if (validator.isValid()) {
            System.out.println("Contraseña valida.");
        } else {
            System.out.println("Contraseña no valida.");
        }
    }
}
