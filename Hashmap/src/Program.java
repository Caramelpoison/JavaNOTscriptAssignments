import java.util.HashMap;

public class Program {
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    public static void printValues(HashMap<String,Book> hashmap){
        for (Book book : hashmap.values()) {
            System.out.println(book.toString());
        }

    }
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book.toString());
            }
        }
    }
}
