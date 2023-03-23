package com.example.openaiclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpenAIResponse {

    private String id;
    private String object;
    private String model;
    private LocalDate created;
    private List<Choice> choices;
}
