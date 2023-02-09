package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class OpenAI {

    @NotEmpty
    @JsonProperty
    private String secretKey;

    public String getSecretKey() {
        return secretKey;
    }

}
