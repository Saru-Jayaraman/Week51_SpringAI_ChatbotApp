package se.lexicon.week51_springai_chatbotapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import se.lexicon.week51_springai_chatbotapp.service.OpenAIService;

@RestController
public class OpenAIChatController {
    OpenAIService openAIService;

    @Autowired
    public OpenAIChatController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String question) {
        return openAIService.chat(question);
    }

    @GetMapping("/reactiveChat")
    public Flux<String> reactiveChat(@RequestParam String question) {
        return openAIService.reactiveChat(question);
    }
}