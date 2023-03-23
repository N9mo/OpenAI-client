package com.example.openaiclient.service;

import com.example.openaiclient.model.BotRequest;
import com.example.openaiclient.model.OpenAIRequest;
import com.example.openaiclient.model.OpenAIResponse;

public interface OpenAIService {

    OpenAIResponse getChat (BotRequest botRequest);

    OpenAIResponse getText(BotRequest botRequest);

    OpenAIResponse getEdit (BotRequest botRequest);

    OpenAIResponse getTranscription (BotRequest botRequest);

    OpenAIResponse getTranslation (BotRequest botRequest);

    OpenAIResponse getFineTune (BotRequest botRequest);

    OpenAIResponse getEmbeding (BotRequest botRequest);

    OpenAIResponse getModeration (BotRequest botRequest);


}
