package com.airiea.model.resource;

import com.airiea.model.enums.ErrorCode;
import com.airiea.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @JsonProperty("task_id")
    String taskId;

    @JsonProperty("entity_id")
    String entityId;

    @JsonProperty("agent_name")
    String agentName;

    @JsonProperty("task_count")
    Integer taskCount;

    @JsonProperty("text_input")
    String textInput;

    @JsonProperty("text_output")
    String textOutput;

    @JsonProperty("embedding_input")
    List<Double> embeddingInput;

    @JsonProperty("embedding_output")
    List<Double> embeddingOutput;

    Status status;

    @JsonProperty("error_code")
    ErrorCode errorCode;

    @JsonProperty("error_message")
    String errorMessage;

    @JsonProperty("created_date")
    Date createdDate;

    @JsonProperty("updated_date")
    Date updatedDate;
}
