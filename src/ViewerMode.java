import java.io.FileNotFoundException;
import java.util.*;
import java.lang.reflect.Type;
import java.io.FileReader;
import java.io.IOException;

// imports used for the Gson library to handle API and Json parsing
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;


public class ViewerMode {
    private HashMap<String, FunkoPop> funkoPopMap;
    private static final String JSON_FILE_PATH = "src/funko_pop_API.json"; // declare constant to store filepath for convenience

    public void loadFunkoPopData() throws FileNotFoundException {
        try (FileReader reader = new FileReader(JSON_FILE_PATH)) {
            Gson gson = new Gson();
            Type mapType = new TypeToken<List<FunkoPop>>() {}.getType();
            List<FunkoPop> funkoPopList = gson.fromJson(reader, mapType);

            // Convert the list into a HashMap with handle as the key
            funkoPopMap = new HashMap<>();
            for (FunkoPop funkoPop : funkoPopList) {
                funkoPopMap.put(funkoPop.getTitle(), funkoPop);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public void displayRandomFunkoPop() {
        // Retrieve a random entry from the HashMap
        FunkoPop randomFunkoPop = getRandomFunkoPop();
        RecentlyViewed.recentlyViewedMap.put(randomFunkoPop.getTitle(), randomFunkoPop); // store Pop in recentlyViewedMap
        // Display the properties of the random FunkoPop object
        System.out.println("Title: " + randomFunkoPop.getTitle());
        System.out.println("Series: " + randomFunkoPop.getSeries());
    }

    private FunkoPop getRandomFunkoPop() {
        // Retrieve a random key from the HashMap
        String[] keys = funkoPopMap.keySet().toArray(new String[0]);
        String randomKey = keys[new Random().nextInt(keys.length)];
        return funkoPopMap.get(randomKey);
    }

    public static void runViewerMode() throws FileNotFoundException {
        ViewerMode viewerMode = new ViewerMode();
        viewerMode.loadFunkoPopData();
        viewerMode.displayRandomFunkoPop();
    }

    public static void addToRecentlyViewed() {

    }
}


