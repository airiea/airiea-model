package com.airiea.model.resource;

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
public class Knowledge {
    @JsonProperty("knowledge_id")
    String knowledgeId;

    @JsonProperty("entity_id")
    String entityId;

    @JsonProperty("agent_name")
    String agentName;

    String content;

    @JsonProperty("created_date")
    Date createdDate;

    @JsonProperty("updated_date")
    Date updatedDate;
}
