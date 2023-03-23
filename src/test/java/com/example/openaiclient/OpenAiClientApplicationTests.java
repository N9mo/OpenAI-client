package com.example.openaiclient;

import com.example.openaiclient.model.BotRequest;
import com.example.openaiclient.model.OpenAIResponse;
import com.example.openaiclient.service.OpenAIServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OpenAiClientApplicationTests {

    @Autowired
    OpenAIServiceImpl openAIService;

    @Test
    void getText() {
        OpenAIResponse response = openAIService.getText(new BotRequest("when singularity become"));

        System.out.println(response.getChoices());
    }
}
