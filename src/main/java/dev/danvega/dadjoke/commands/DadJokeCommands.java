package dev.danvega.dadjoke.commands;

import dev.danvega.dadjoke.client.DadJokeClient;
import dev.danvega.dadjoke.model.DadJokeResponse;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class DadJokeCommands {

    private final DadJokeClient dadJokeClient;

    public DadJokeCommands(DadJokeClient dadJokeClient) {
        this.dadJokeClient = dadJokeClient;
    }

    @ShellMethod(key = "random",value = "I will return a random dad joke!")
    public String getRandomDadJoke() {
        DadJokeResponse random = dadJokeClient.random();
        return random.joke();
    }

}
