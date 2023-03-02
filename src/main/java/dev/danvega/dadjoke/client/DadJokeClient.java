package dev.danvega.dadjoke.client;

import dev.danvega.dadjoke.model.DadJokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface DadJokeClient {

    @GetExchange("/")
    DadJokeResponse random();
}
