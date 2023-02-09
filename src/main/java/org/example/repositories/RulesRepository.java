package org.example.repositories;

import org.example.models.Rule;

import java.util.Optional;

public interface RulesRepository {
    Optional<Rule> random();
}
