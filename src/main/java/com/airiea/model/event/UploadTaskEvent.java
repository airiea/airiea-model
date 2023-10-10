package com.airiea.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UploadTaskEvent {
    @JsonProperty("entity_id")
    String entityId;

    @JsonProperty("agent_name")
    String agentName;

    @JsonProperty("task_count")
    Integer taskCount;

    @JsonProperty("task_id")
    String taskId;

    @JsonProperty("knowledge_id")
    String knowledgeId;

    @JsonProperty("task_input")
    String taskInput;

    @JsonProperty("timeout_time")
    Long timeoutTime;
}