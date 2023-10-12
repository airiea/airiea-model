package com.airiea.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ModelObject {
    OPEN_AI_EMBEDDING("embedding"),
    OPEN_AI_CHAT_COMPLETION("chat.completion"),
    OPEN_AI_COMPLETION("completion"),
    KNOWLEDGE_CONTENT_INCREMENTAL_UPDATE("knowledge.content.incremental.update"),
    KNOWLEDGE_CONTENT_COMPLETE_UPDATE("knowledge.content.incremental.update"),
    KNOWLEDGE_VECTORS_COMPLETE_UPDATE("knowledge.vectors.incremental.update");
    private final String name;

    @JsonValue
    public String getName() {
        return name;
    }

    public static ModelObject fromString(String name) {
        for (ModelObject modelObject : ModelObject.values()) {
            if (modelObject.getName().equals(name)) {
                return modelObject;
            }
        }
        throw new IllegalArgumentException("No enum found with name: " + name);
    }
}
