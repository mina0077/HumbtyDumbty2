package com.mina.humbtydumbty2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayerCustomAdapter extends ArrayAdapter<Player> {
        public PlayerCustomAdapter(Context context , ArrayList<Player> players)
        {
            super(context,0,players);
        }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            Player player =getItem(position);
            if(convertView == null)
            {
                convertView=LayoutInflater.from(getContext()).inflate(R.layout.player_template,parent,false);
            }
            TextView playerName= convertView.findViewById(R.id.playername);
            TextView playerNumber =convertView.findViewById(R.id.playernumber);
            ImageView playerImage=  convertView.findViewById(R.id.playerimage);

            playerName.setText(player.playerName);
            playerNumber.setText(player.playerNumber);
            playerImage.setImageResource(player.playerImage);



        return convertView;
    }
}
