import java.util.Collection;
import java.util.HashMap;
import static java.lang.System.*;

public class RecentlyViewed {
    public static HashMap<String, FunkoPop> recentlyViewedMap = new HashMap<>();
    public static void runRecentlyViewed() {
        if (recentlyViewedMap.isEmpty()) out.println("You haven't viewed any Pops yet.");
        else {
            Collection<FunkoPop> values = recentlyViewedMap.values();
            for (FunkoPop value : values) {
                out.println("Title: " + value.getTitle() + " ----- Series: " + value.getSeries());
             }
        }
    }
}
