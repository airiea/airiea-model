package com.airiea.model.event;

import com.airiea.model.enums.ErrorCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorTaskEvent {
    @JsonProperty("knowledge_id")
    String knowledgeId;

    @JsonProperty("task_id")
    String taskId;

    @JsonProperty("error_code")
    ErrorCode errorCode;

    @JsonProperty("error_message")
    String errorMessage;
}