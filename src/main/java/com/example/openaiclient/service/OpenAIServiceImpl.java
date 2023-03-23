package com.example.openaiclient.service;

import com.example.openaiclient.model.BotRequest;
import com.example.openaiclient.model.OpenAIRequest;
import com.example.openaiclient.model.OpenAIResponse;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Data
@Service
@ConfigurationProperties(prefix = "openai")
public class OpenAIServiceImpl implements OpenAIService {
    String host;
    String chat;
    String completion;
    String edits;
    String transcriptions;
    String translations;
    String fineTunes;
    String embeddings;
    String moderations;
    String apiKey;
    Integer maxToken;
    Double temperature;
    Double topP;

    private static RestTemplate restTemplate = new RestTemplate();

    @Override
    public OpenAIResponse getChat(BotRequest botRequest) {
        return null;
    }

    @Override
    public OpenAIResponse getText(BotRequest botRequest) {
        OpenAIRequest openAIRequest = new OpenAIRequest(
                "text-davinci-003",
                botRequest.getMessage(),
                temperature,
                maxToken,
                topP);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/json; charset=UTF-8"));
        headers.add("Authorization", "Bearer " + apiKey);
        HttpEntity httpEntity =  new HttpEntity<>(openAIRequest, headers);

        ResponseEntity<OpenAIResponse> responseEntity = restTemplate.postForEntity(
                host + completion,
                httpEntity,
                OpenAIResponse.class);

        return responseEntity.getBody();
    }

    @Override
    public OpenAIResponse getEdit(BotRequest botRequest) {
        return null;
    }

    @Override
    public OpenAIResponse getTranscription(BotRequest botRequest) {
        return null;
    }

    @Override
    public OpenAIResponse getTranslation(BotRequest botRequest) {
        return null;
    }

    @Override
    public OpenAIResponse getFineTune(BotRequest botRequest) {
        return null;
    }

    @Override
    public OpenAIResponse getEmbeding(BotRequest botRequest) {
        return null;
    }

    @Override
    public OpenAIResponse getModeration(BotRequest botRequest) {
        return null;
    }

//    public HttpEntity<OpenAIRequest> buildHttpEntity(OpenAIRequest chatRequest) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.parseMediaType("application/json; charset=UTF-8"));
//        headers.add("Authorization", "Bearer " + apikey);
//
//        return new HttpEntity<>(chatRequest, headers);
//    }
//
//    public OpenAIResponse getResponse(HttpEntity<OpenAIRequest> requestHttpEntity) {
//        ResponseEntity<OpenAIResponse> responseEntity = restTemplate.postForEntity(
//                host + completion,
//                requestHttpEntity,
//                OpenAIResponse.class);
//
//        return responseEntity.getBody();
//    }
}
