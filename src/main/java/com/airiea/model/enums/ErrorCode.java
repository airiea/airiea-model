package com.airiea.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    timeout,
    openai_error,
    client_error,
    service_error;

    @JsonValue
    public String getName() {
        return this.name();
    }

    @JsonCreator
    public static ErrorCode forName(String name) {
        for (ErrorCode value : ErrorCode.values()) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid name: " + name);
    }
}
