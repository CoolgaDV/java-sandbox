package cdv.sandbox;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Records {

    public static void main(String[] args) throws Exception {

        var record = new KeyValue("key", "value");
        System.out.println(record.key() + " " + record.value());
        System.out.println(record);

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

    public record KeyValue(
            @JsonProperty("Key") String key,
            @JsonProperty("Value") String value
    ) { }

}
