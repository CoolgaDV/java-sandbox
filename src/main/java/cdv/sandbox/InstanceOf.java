package cdv.sandbox;

public class InstanceOf {

    public static void main(String[] args) {
        print(" value ");
        print(41);
    }

    private static void print(Object value) {
        // According to bytecode all the magic is done via compiler
        if (value instanceof String string) {
            System.out.println("string: " + string.trim());
        }
        if (value instanceof Integer integer) {
            System.out.println("integer: " + (integer + 1));
        }
    }

}
