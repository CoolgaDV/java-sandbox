package cdv.sandbox;

public class StringFormatting {

    public static void main(String[] args) {
        // String.format(..) uses the same syntax
        String formatted = "some %s %d".formatted("value", 42);
        System.out.println(formatted);
    }

}
