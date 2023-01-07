package cdv.sandbox;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.RecordComponent;
import java.util.Arrays;
import java.util.List;

public class Records {

    public static void main(String[] args) throws Exception {

        // Each record is a subclass of java.lang.Record and
        // there is no way to extend java.lang.Record explicitly
        Record record = new KeyValue("key", "value");
        System.out.println(record);

        // Record components can be introspected via reflection
        List<String> componentNames =
                Arrays.stream(record.getClass().getRecordComponents())
                        .map(RecordComponent::getName)
                        .toList();
        System.out.println(componentNames);

        System.out.println(new EmptyRecord());

        // Jackson supports records
        System.out.println(new ObjectMapper().readValue(
                """
                {
                    "Key": "Key",
                    "Value": "Value"
                }
                """,
                KeyValue.class));
    }

    // It is possible to create records without fields
    public record EmptyRecord() {}

    public record KeyValue(
            // Annotations applies for the following elements (according to bytecode):
            // - fields
            // - constructor parameters
            // - access methods
            @JsonProperty("Key") String key,
            @JsonProperty("Value") String value
    ) {

        // Constructor parameters and assignment operators are created by the compiler
        public KeyValue {
            if (key == null || value == null) {
                throw new IllegalArgumentException();
            }
        }

    }

}
