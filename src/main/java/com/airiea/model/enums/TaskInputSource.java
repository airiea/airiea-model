package com.airiea.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskInputSource {
    task_text_output,
    task_embedding_output,
    knowledge_entry_content,
    knowledge_entry_embedding,
    external_input_string;

    @JsonValue
    public String getName() {
        return this.name();
    }
}
