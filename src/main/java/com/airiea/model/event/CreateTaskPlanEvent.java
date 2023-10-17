package com.airiea.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Example SNS Message
 {
 "task_id":"luyifan-customer_action_classification",
 "entity_ids": ["customer1", "customer2", "customer3"]
 }
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTaskPlanEvent {
    @JsonProperty("entity_ids")
    List<String> entityIds;

    @JsonProperty("agent_name_one")
    String agentNameOne;

    @JsonProperty("agent_name_two")
    String agentNameTwo;

    @JsonProperty("agent_name_three")
    String agentNameThree;

    @JsonProperty("agent_name_four")
    String agentNameFour;

    @JsonProperty("agent_name_five")
    String agentNameFive;
}