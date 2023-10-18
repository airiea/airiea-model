package com.airiea.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    uploading,
    uploaded,
    pending,
    processing,
    processed,
    completing,
    completed,
    error;

    @JsonValue
    public String getName() {
        return this.name();
    }

    @JsonCreator
    public static Status forName(String name) {
        for (Status value : Status.values()) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid name: " + name);
    }
}
