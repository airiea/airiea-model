package com.airiea.model.event;

import com.airiea.model.enums.TaskInputSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Example SNS Message
 {
 "entity_id":"customer2",
 "task_input": "purchase book The Art Of War, leave 5-star review on the book The Art Of War"
 }
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskInputEvent {
    @JsonProperty("entity_id")
    String entityId;

    @JsonProperty("task_input_source")
    TaskInputSource taskInputSource;

    @JsonProperty("task_input_string")
    String taskInputString;

    @JsonProperty("task_id")
    String taskId;

    @JsonProperty("knowledge_id")
    String knowledgeId;
}