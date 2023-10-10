package com.airiea.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Example SNS Message
{
    "task_id":"luyifan-customer_action_classification",
    "task_name":"customer_action_classification",
    "ownership":"luyifan",
    "background":"You work for an audio book company customer relationship management team. You will be provided with text of a customer interaction with our company service.",
    "goal":"Your goal is to abstract customer action context from the provided text.",
    "requirement":"Provide your output in json format with the action_name as key and action_context as value. action_context need to cover all relevant information of the corresponding customer action. Example output: {\"action_name1\": \"action_context1\"},{\"action_name2\": \"action_context2\"}. If provided text is not related to customer action, provide empty string as the output.",
    "prompt_format":"Provide your output for customer interaction: %s",
    "background_knowledge":"{\"action_name\": \"action_context\"}",
    "temperature":0.2,
    "model":"gpt-3.5-turbo",
    "update_type":"incremental_update",
    "update_delimiter":",",
    "owned_by":"openai",
    "object":"chat.completion",
    "max_tokens":2000
}
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateAgentEvent {
    @JsonProperty("agent_name")
    String agentName;

    @JsonProperty("agent_role")
    String agentRole;

    @JsonProperty("agent_goal")
    String agentGoal;

    @JsonProperty("ability_name")
    String abilityName;

    @JsonProperty("updatedDate")
    Date updatedDate;

    @JsonProperty("created_date")
    Date createdDate;
}
