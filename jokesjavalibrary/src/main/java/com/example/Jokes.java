package com.example;

import java.util.Random;

public class Jokes {

    private String[] jokes = {"Joke 1!", "Joke 2!", "Joke 3!", "Joke 4!", "Joke 5!", "Joke 6!"};

    public String getJokes() {
        Random rand = new Random();
        return jokes[rand.nextInt(jokes.length)];
    }
}
