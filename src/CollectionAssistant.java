import java.util.HashMap;
import java.util.Scanner;
import static java.lang.System.*;





public class CollectionAssistant {
    String username;
    HashMap<String, String> wishlist;
    HashMap<String, String> myCollection;
    Scanner scanner;

    public CollectionAssistant() { //initialize a new instance of public class CollectionAssistant
        username = "guest";
        wishlist = new HashMap<>();
        myCollection = new HashMap<>();
        scanner = new Scanner(in);
    }



}
