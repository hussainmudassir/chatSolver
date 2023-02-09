package org.example.services;

import com.google.common.base.Function;
import org.example.AppConfiguration;
import org.example.models.OpenAI;

import javax.annotation.Nullable;
import javax.inject.Inject;

public class ChatGPT implements Function<OpenAI, String> {
    private final AppConfiguration appConfiguration;

    @Inject
    public ChatGPT(AppConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
    }

    @Nullable
    @Override
    public String apply(@Nullable OpenAI input) {
        return input.getSecretKey();
    }
}
