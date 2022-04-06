package dto.employee.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public enum Gender {
    @JsonProperty("male") MALE,
    @JsonProperty("female") FEMALE
}