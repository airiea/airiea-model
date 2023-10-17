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
    @JsonProperty("task_id")
    String taskId;

    @JsonProperty("knowledge_id")
    String knowledgeId;

    @JsonProperty("timeout_time")
    Long timeoutTime;
}