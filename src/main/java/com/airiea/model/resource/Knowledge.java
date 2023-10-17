package com.airiea.model.resource;

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
public class Knowledge {
    @JsonProperty("entity_id")
    String entityId;

    @JsonProperty("agent_id")
    String agentId;

    String content;

    List<Double> embedding;

    @JsonProperty("created_date")
    Date createdDate;

    @JsonProperty("updated_date")
    Date updatedDate;
}
