package cdv.sandbox;

public class TextBlocks {

    public static void main(String[] args) {
        // Text blocks are strings, no need to escape double quotes.
        // According to bytecode it is just a string constant.
        String json = """
                {
                    "key": "value"
                }
                """;
        System.out.println(json);
    }

}
