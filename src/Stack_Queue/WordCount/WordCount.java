package Stack_Queue.WordCount;

import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {

        String text = "Lê Anh Tuấn Lê Anh";

        Map<String, Integer> map = new TreeMap<>();

        String[] words = text.toLowerCase().split("\\s+");

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Số lần xuất hiện của từng từ:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
