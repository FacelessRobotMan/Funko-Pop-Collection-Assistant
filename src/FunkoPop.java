import java.util.List;

public class FunkoPop {
    private String handle;
    private String title;
    private String imageName;
    private List<String> series;

    public FunkoPop(String handle, String title, String imageName, List<String> series) { // declare a new instance of FunkoPop
        this.handle = handle;
        this.title = title;
        this.imageName = imageName;
        this.series = series;
    }

    public String getHandle() {
        return handle;
    }

    public String getTitle() {
        return title;
    }

    public String getImageName() {
        return imageName;
    }

    public List<String> getSeries() {
        return series;
    }
}
