package title;

import javafx.application.Application;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        
        Application.launch(UserTitle.class,
                "--title=title");

    }

}
