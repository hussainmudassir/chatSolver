package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.example.models.OpenAI;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class AppConfiguration extends Configuration {
    @NotEmpty
    private String appName;

    @NotNull
    private OpenAI openAI;
    @JsonProperty
    public String getAppName() {
        return appName;
    }
    @JsonProperty
    public void setAppName(String appName) {
        this.appName = appName;
    }
    @JsonProperty
    public OpenAI getOpenAI() {
        return openAI;
    }
    @JsonProperty
    public void setOpenAI(OpenAI openAI) {
        this.openAI = openAI;
    }
}
