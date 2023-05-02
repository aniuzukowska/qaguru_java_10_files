package Json;
import java.util.List;

public class Meetings {
    private String day;
    private List<String> time;

    public String getDay() {
        return this.day;
    }

    public List<String> getTime() {
        return this.time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }
}
