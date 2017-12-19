package com.example.jardine.topgames;

import java.util.ArrayList;

/**
 * Created by jardine on 19/12/2017.
 */

public class TopGames {
    private ArrayList<Game> games;

    public TopGames() {
        games = new ArrayList<>();
        games.add(new Game("PUBG", 1, "Bluehole", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Guild Wars 2", 2, "ArenaNet", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Counter Strike: Global Offensive", 3, "Valve", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Half Life", 4, "Valve", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Half Life 2", 5, "Valve", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Half Life 3", 6, "Valve", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Shogun 2: Total War", 7, "Creative Assembly", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Rome 2: Total War", 8, "Creative Assembly", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Warhammer: Total War", 9, "Creative Assembly", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Warhammer 2: Total War", 10, "Creative Assembly", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Attila: Total War", 10, "Creative Assembly", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Elder Scrolls: Skyrim", 11, "Bethesda", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Day of Defeat: Source", 12, "Valve", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
        games.add(new Game("Fallout 4", 13, "Bethesda", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sapien mauris, tincidunt vel est vel, egestas imperdiet lectus. Donec consectetur felis nunc, consequat fermentum turpis elementum euismod."));
    }

    public ArrayList<Game> getGames() {
        return games;
    }
}
