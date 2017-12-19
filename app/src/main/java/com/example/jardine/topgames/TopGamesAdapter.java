package com.example.jardine.topgames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jardine on 19/12/2017.
 */

public class TopGamesAdapter extends ArrayAdapter<Game>{

    TopGamesAdapter(Context context, ArrayList<Game> games) {
        super(context, 0, games);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.games_item, parent, false);
        }

        Game currentGame = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.game_ranking);
        ranking.setText(currentGame.getRanking().toString());

        TextView title = listItemView.findViewById(R.id.game_title);
        title.setText(currentGame.getName());

        TextView developer = listItemView.findViewById(R.id.game_developer);
        developer.setText(currentGame.getDeveloper());

        listItemView.setTag(currentGame);

        return listItemView;
    }

}
