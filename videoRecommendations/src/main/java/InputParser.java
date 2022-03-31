import java.util.List;

public interface InputParser {
    String readFileIntoString(String filePath);
    void parseUsersAndHistory(String input);
    List<String> getUserHistory(String user);
}
