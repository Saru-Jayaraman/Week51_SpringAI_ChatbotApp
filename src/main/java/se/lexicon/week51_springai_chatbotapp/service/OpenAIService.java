package se.lexicon.week51_springai_chatbotapp.service;

import reactor.core.publisher.Flux;

public interface OpenAIService {
    String chat(String question);

    Flux<String> reactiveChat(String question);
}