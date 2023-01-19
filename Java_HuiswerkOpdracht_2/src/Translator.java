import java.util.HashMap;
import java.util.Map;

public class Translator {
    // Instance variable (Hashmap).
    // Waarom moet je hier static voor zetten?
    static Map<Integer, String> numericAlpha = new HashMap<>();

    // Constructor. De for-loop voegt een nieuwe entry toe aan de HashMap met de waardes numeric en alphabetic
    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    // Methode
    // Waarom gebruik je hier get?
    public static String translate(Integer number) {
        return numericAlpha.get(number);
    }
}
