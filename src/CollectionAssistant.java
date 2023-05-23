import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import static java.lang.System.*;

public class CollectionAssistant {
    String username;
    HashMap<String, String> wishlist;
    HashMap<String, String> myCollection;
    Scanner scanner;

    public CollectionAssistant() { //declare a new instance of public class CollectionAssistant
        username = "guest";
        wishlist = new HashMap<>();
        myCollection = new HashMap<>();
        scanner = new Scanner(in);
    }

    public void runCollectionAssistant() throws FileNotFoundException {
        String choice;
        do {
            out.println("[V]iewer mode -or- [Q]uit: ");
            choice = scanner.nextLine().trim().toUpperCase();
            switch (choice) {
                case "V" -> ViewerMode.runViewerMode();
                case "Q" -> out.println("Goodbye");
            }
        } while (!choice.equals("Q"));

    }

    public static void main(String[] args) throws FileNotFoundException {
        CollectionAssistant assistant = new CollectionAssistant();
        assistant.runCollectionAssistant();


    }

}
