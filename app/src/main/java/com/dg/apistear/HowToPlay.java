package com.dg.apistear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HowToPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);
        String idGame= getIntent().getStringExtra("id");
        TextView tx = (TextView) findViewById(R.id.textViewHTP);
        TextView tittle = (TextView) findViewById(R.id.textViewTitleHTP);

        switch (idGame){
            case "1":
                tx.setText(R.string.copareyReglas);
                tittle.setText(R.string.copa_del_rey);
                break;
            case "2": break;
            case "3": break;
            default: break;
        }

    }
}
