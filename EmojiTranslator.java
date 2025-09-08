import java.util.*;

public class EmojiTranslator {
    private static final Map<String, String> emojiMap = new HashMap<>();

    static {
        emojiMap.put("love", "❤️");
        emojiMap.put("pizza", "🍕");
        emojiMap.put("dog", "🐶");
        emojiMap.put("cat", "🐱");
        emojiMap.put("happy", "😊");
        emojiMap.put("sad", "😢");
        emojiMap.put("sun", "☀️");
        emojiMap.put("moon", "🌙");
        emojiMap.put("star", "⭐");
        emojiMap.put("car", "🚗");
        emojiMap.put("music", "🎶");
        emojiMap.put("computer", "💻");
        emojiMap.put("book", "📖");
        emojiMap.put("fire", "🔥");
        emojiMap.put("rain", "🌧️");
    }

    public static String translate(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (emojiMap.containsKey(word)) {
                result.append(emojiMap.get(word)).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("✨ Emoji Translator ✨");
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String output = translate(input);
        System.out.println("🔹 Translated: " + output);
        sc.close();
    }
}
