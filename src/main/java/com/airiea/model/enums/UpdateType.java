package com.airiea.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UpdateType {
    incremental_update,
    complete_update;

    @JsonValue
    public String getName() {
        return this.name();
    }

    @JsonCreator
    public static UpdateType forName(String name) {
        for (UpdateType value : UpdateType.values()) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid name: " + name);
    }
}
