package com.dg.apistear;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class GamesSlider extends AppCompatActivity {

    String [] players;
    ViewPager vp;
    CustomSwipe cs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_slider);


        vp= (ViewPager) findViewById(R.id.viewPager);
        ArrayList<Fragment> fragments= new ArrayList<>();
        FragmentGames fm = new FragmentGames(R.mipmap.ic_launcher , "kings Cup", players, "1");
        fragments.add(fm);
        FragmentGames fm2 = new FragmentGames(R.mipmap.ic_launcher , "Retos", players, "2");
        fragments.add(fm2);

        vp.setAdapter(new AdaptadorF(getSupportFragmentManager(),fragments));

    }
}
