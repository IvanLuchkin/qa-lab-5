package entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.ZonedDateTime;
import lombok.Data;
import serialization.ZonedDateTimeDeserializer;
import serialization.ZonedDateTimeSerializer;

@Data
public class Page {
    private Long id;
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    private ZonedDateTime createdAt;
    private String name;
    private String pageUrl;
}
