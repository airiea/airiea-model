package com.airiea.model.operation;

import com.airiea.model.enums.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatAgentRequest {
    @JsonProperty("agent_name")
    String agentName;

    @JsonProperty("model")
    Model model;

    @JsonProperty("response_delimiter")
    String responseDelimiter;

    Double temperature;

    @JsonProperty("max_tokens")
    Integer maxTokens;

    @JsonProperty("prompt")
    String prompt;

    @JsonProperty("knowledge_ids")
    List<String> knowledgeIds;
}
