package com.airiea.model.resource;

import com.airiea.model.enums.Model;
import com.airiea.model.enums.ModelObject;
import com.airiea.model.enums.UpdateType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"abilityName"})
public class Ability {
    @JsonProperty("ability_name")
    String abilityName;

    @JsonProperty("model")
    Model model;

    @JsonProperty("model_object")
    ModelObject modelObject;

    @JsonProperty("max_tokens")
    Integer maxTokens;

    Double temperature;

    //Your task is to devise up to 5 highly effective goals and an appropriate role-based name (_GPT) for an autonomous agent,
    //ensuring that the goals are optimally aligned with the successful completion of its assigned task.
    String description;

    //The user will provide the task, you will provide only the output in the exact format specified below with no explanation or conversation.
    @JsonProperty("response_requirement")
    String responseRequirement;

    @JsonProperty("knowledge_base_agent_name")
    String knowledgeBaseAgentName;

    @JsonProperty("example_input")
    String exampleInput;

    @JsonProperty("example_output")
    String exampleOutput;

    @JsonProperty("input_format")
    String inputFormat;

    @JsonProperty("update_type")
    UpdateType updateType;

    @JsonProperty("update_delimiter")
    String updateDelimiter;
}
