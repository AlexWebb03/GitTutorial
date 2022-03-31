import java.util.HashMap;

public class VideoTags {
    private static final String[] video1 = new String[] {
        "dog", "skateboard", "street", "funny"
    };
    private static final String[] video2 = new String[] {
        "butterfly", "flowers", "slow motion"
    };
    private static final String[] video3 = new String[] {
        "wolf", "slow motion"
    };
    private static final String[] video4 = new String[] {
        "beach", "vintage", "people"
    };
    private static final String[] video5 = new String[] {
        "tractor", "field", "drone"
    };
    private static final String[] video6 = new String[] {
        "man", "laptop", "watch"
    };
    private static final String[] video7 = new String[] {
        "coffee", "brew"
    };
    private static final String[] video8 = new String[] {
        "highland cow", "snow"
    };
    private static final String[] video9 = new String[] {
        "dough", "cooking"
    };
    private static final String[] video10 = new String[] {
        "couple", "city", "view", "tourism"
    };
    private static final String[] video11 = new String[] {
        "temple", "woman"
    };
    private static final String[] video12 = new String[] {
        "santa", "glasses", "wink"
    };

    public static final HashMap<String, String[]> tags;

    static {
        tags = new HashMap<>(12, 1);
        tags.put("video1.mp4", video1);
        tags.put("video2.mp4", video2);
        tags.put("video3.mp4", video3);
        tags.put("video4.mp4", video4);
        tags.put("video5.mp4", video5);
        tags.put("video6.mp4", video6);
        tags.put("video7.mp4", video7);
        tags.put("video8.mp4", video8);
        tags.put("video9.mp4", video9);
        tags.put("video10.mp4", video10);
        tags.put("video11.mp4", video11);
        tags.put("video12.mp4", video12);
    }
}
