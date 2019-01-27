package com.mina.humbtydumbty2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] playersNames= getResources().getStringArray(R.array.playersnames);
        String[] playerNumbers=getResources().getStringArray(R.array.playernumbers);
        int[] images={
                R.drawable.ronaldo,
                R.drawable.marcelo,
                R.drawable.modric,
                R.drawable.ramos,
                R.drawable.kroos,
                R.drawable.navas,
                R.drawable.casemiro,
                R.drawable.carvajal,
                R.drawable.varan,
                R.drawable.bale,
                R.drawable.benzema,
                R.drawable.lucas,
                R.drawable.vinuces
        };

        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        PlayerCustomAdapter playerCustomAdapter = new PlayerCustomAdapter(this,playerArrayList);
        ListView listView = findViewById(R.id.ListView);

        listView.setAdapter(playerCustomAdapter);
        for (int i =0 ;i<playersNames.length;i++)
        {
            Player player = new Player(playersNames[i], playerNumbers[i],images[i]);
            playerCustomAdapter.add(player);
        }
    }
}
