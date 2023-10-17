package com.airiea.model.event;

import com.airiea.model.enums.TaskInputSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompleteTaskEvent {
    @JsonProperty("knowledge_id")
    String knowledgeId;

    @JsonProperty("task_id")
    String taskId;

    @JsonProperty("task_input_source")
    TaskInputSource taskInputSource;
}
