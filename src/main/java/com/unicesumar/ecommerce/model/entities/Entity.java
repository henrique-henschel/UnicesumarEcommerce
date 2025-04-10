package com.unicesumar.ecommerce.model.entities;

import java.util.Objects;
import java.util.UUID;

public abstract class Entity {
    private final UUID uuid;

    protected Entity() {
        this.uuid = UUID.randomUUID();
    }

    protected Entity(UUID uuid) {
        this.uuid = Objects.requireNonNull(uuid, "ERRO! O ID não pode ser nulo.");
    }

    public UUID getId() {
        return uuid;
    }
}
