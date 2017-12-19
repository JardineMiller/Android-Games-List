package com.example.jardine.topgames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopGamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games_list);

        TopGames topGames = new TopGames();
        ArrayList<Game> list = topGames.getGames();

        TopGamesAdapter gameAdapter = new TopGamesAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.games_list_view);
        listView.setAdapter(gameAdapter);
    }

    public void getGame(View listItem) {
        Game game = (Game) listItem.getTag();
        Log.d("Game title: ", game.getName());
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("game", game);
        startActivity(intent);
    }
}
