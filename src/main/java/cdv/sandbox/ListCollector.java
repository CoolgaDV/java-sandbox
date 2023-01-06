package cdv.sandbox;

import java.util.List;
import java.util.stream.Stream;

public class ListCollector {

    public static void main(String[] args) {
        // Created list is immutable (in contradiction to .collect(Collectors.toList()))
        List<String> list = Stream.of("first", "second").toList();
        System.out.println(list.getClass());
    }

}
