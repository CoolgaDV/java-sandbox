package cdv.sandbox;

import java.util.stream.IntStream;

public class SwitchExpression {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5)
                .mapToObj(SwitchExpression::convert)
                .forEach(System.out::println);
    }

    private static String convert(int value) {
        return switch (value) {
            // Mixing ":" and "->" in the same switch is prohibited
            case 1 -> "one";
            case 2 -> {
                System.out.println("...");
                // Return statement is not allowed
                yield "couple";
            }
            // Several options are possible for the same branch
            case 3, 4 -> "few";
            // Default branch is needed
            default -> String.valueOf(value);
        };
    }

}
