package com.airiea.model.resource;

import com.airiea.model.enums.ErrorCode;
import com.airiea.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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

    @JsonProperty("task_input")
    String taskInput;

    @JsonProperty("task_output")
    String taskOutput;

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
