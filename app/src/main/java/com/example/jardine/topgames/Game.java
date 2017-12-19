package com.example.jardine.topgames;

import java.io.Serializable;

/**
 * Created by jardine on 19/12/2017.
 */

public class Game implements Serializable {
    private String name;
    private Integer ranking;
    private String developer;
    private String description;

    public Game(String name, Integer ranking, String developer, String description) {
        this.name = name;
        this.ranking = ranking;
        this.developer = developer;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getDescription() {
        return description;
    }
}
