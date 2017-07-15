package testArray;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gleb on 06.07.17.
 */
public class StringArray {

    private String text;

    public StringArray(String text) {
        this.text = text;
    }

    public Map<String, Integer> wordsCount() {
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!hashMap.containsKey(words[i])) {
                hashMap.put(words[i], 1);
            } else {
                hashMap.replace(words[i], hashMap.get(words[i]) + 1);
            }
        }
        return hashMap;
    }


    public static void main(String[] args) {

        String text = "Fast access to MySQL software Downloads" +
                "Download technical White Papers and Presentations" +
                "Post messages in the MySQL Discussion Forums" +
                "Report and track bugs in the MySQL bug system" +
                "Comment in the MySQL Documentation";

        System.out.println(new StringArray(text).wordsCount());
    }


}
