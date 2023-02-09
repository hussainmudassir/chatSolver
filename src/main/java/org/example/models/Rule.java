package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rule {

    private String title;

    private String description;

    public Rule() {
    }

    public Rule(String title, String description) {
        this.title = title;
        this.description = description;
    }
    @JsonProperty
    public String getTitle() {
        return title;
    }
    @JsonProperty
    public String getDescription() {
        return description;
    }


}
