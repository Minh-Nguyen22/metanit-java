package input_output.console;

import java.io.Console;

public class Program {

    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String login = console.readLine("Login:");
            char[] password = console.readPassword("Password");

            console.printf("Login: %s \n", login);
            console.printf("Password: %s \n", password);

        }
    }
}
