package com.dg.apistear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final Button btnGames = (Button) findViewById(R.id.button_game);
        btnGames.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(Menu.this, Players.class);
                startActivity(intent);
            }
        });


    }
}
