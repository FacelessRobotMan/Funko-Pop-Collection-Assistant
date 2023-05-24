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
        out.println("-------- Welcome To The Funko Pop Collection Assistant! --------");
        out.println("----------------------------------------------------------------");
        String choice;
        do {
            out.println("------------------------- MAIN MENU ----------------------------");
            out.println("--- [V]iewer mode --- See [R]ecently viewed Pops --- [Q]uit --- >");
            choice = scanner.nextLine().trim().toUpperCase();
            switch (choice) {
                case "V" -> ViewerMode.runViewerMode();
                case "R" -> RecentlyViewed.runRecentlyViewed();
                case "Q" -> out.println("Goodbye");
                default -> out.println(("Invalid Choice"));
            }
        } while (!choice.equals("Q"));

    }

    public static void main(String[] args) throws FileNotFoundException {
        CollectionAssistant assistant = new CollectionAssistant();
        assistant.runCollectionAssistant();


    }

}
