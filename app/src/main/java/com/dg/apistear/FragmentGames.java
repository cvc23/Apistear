package com.dg.apistear;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cvc23 on 27/06/2017.
 */

public class FragmentGames extends Fragment {

    Integer image= 0;
    String name="";
    String [] players;
    String id="";
    public FragmentGames(){}

    @SuppressLint("ValidFragment")
    public FragmentGames(Integer image, String name, String [] players, String id){
        this.image=image;
        this.name=name;
        this.players= players;
        this.id= id;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_gms, null);
        TextView tx= (TextView) view.findViewById(R.id.textViewGame);
        ImageButton imageButton= (ImageButton) view.findViewById(R.id.imageGame);
        Button btn = (Button) view.findViewById(R.id.buttonHTP);
        tx.setText(name);
        imageButton.setImageResource(image);
        imageButton.setScaleType(ImageView.ScaleType.FIT_XY);



        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                switch(id){
                    case "1" :
                        //King's Cup
                        intent=new Intent(getActivity(), KingsCupGame.class);
                        break;
                    case "2":
                        //Challenges
                        intent=new Intent(getActivity(), Menu.class);
                        break;
                    default:
                        break;
                }
                intent.putExtra("ar",players );
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HowToPlay.class);
                intent.putExtra("id",id );
                startActivity(intent);
            }
        });

        return view;
    }


}
