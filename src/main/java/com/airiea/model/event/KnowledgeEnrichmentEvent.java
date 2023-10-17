package com.airiea.model.event;

import com.airiea.model.enums.UpdateType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KnowledgeEnrichmentEvent {
    @JsonProperty("knowledge_id")
    String knowledgeId;

    @JsonProperty("entity_id")
    String entityId;

    @JsonProperty("agent_name")
    String agentName;

    @JsonProperty("update_type")
    UpdateType updateType;

    @JsonProperty("update_delimiter")
    String updateDelimiter;

    String content;
}
