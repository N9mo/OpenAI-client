package com.example.openaiclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Choice {

    private Integer index;
    private String text;
    @JsonProperty("finish_reason")
    private String finishReason;
}
