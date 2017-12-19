package com.example.jardine.topgames;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent intent = getIntent();
        Game game = (Game) intent.getSerializableExtra("game");


        TextView title = findViewById(R.id.game_title);
        title.setText(game.getName());

        TextView ranking = findViewById(R.id.game_ranking);
        ranking.setText(game.getRanking().toString());

        TextView developer = findViewById(R.id.game_developer);
        developer.setText(game.getDeveloper());;

        TextView description = findViewById(R.id.game_description);
        description.setText(game.getDescription());
    }
}
