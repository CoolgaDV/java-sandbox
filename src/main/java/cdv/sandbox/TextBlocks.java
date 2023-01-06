package cdv.sandbox;

public class TextBlocks {

    public static void main(String[] args) {
        // Text blocks are strings
        // No need to escape double quotes
        String json = """
                {
                    "key": "value"
                }
                """;
        System.out.println(json);
    }

}
