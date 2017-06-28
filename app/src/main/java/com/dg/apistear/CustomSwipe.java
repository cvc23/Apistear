package com.dg.apistear;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by cvc23 on 27/06/2017.
 */

public class CustomSwipe extends PagerAdapter {
    ArrayList<String> paths= new ArrayList<>();
    Activity activity;
    private LayoutInflater layoutInflater;
    TextView tx;
    ArrayList<String> names= new ArrayList<>();

    CustomSwipe(Activity activity, ArrayList<String> paths, ArrayList<String> names){
        this.activity= activity;
        this.paths=paths;
        this.names=names;

    }

    @Override
    public int getCount() {
        //return number of images
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vw= layoutInflater.inflate(R.layout.swipe_image,container, false);

        ImageView imgV;
        imgV = (ImageView) vw.findViewById(R.id.swipe_img);
        tx= (TextView) vw.findViewById(R.id.swipe_Name);
        DisplayMetrics dis= new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dis);
        int height= dis.widthPixels;
        int width= dis.widthPixels;
        imgV.setMinimumHeight(height);
        imgV.setMinimumWidth(width);
        tx.setText(names.get(position));


        try{
            Picasso.with(activity.getApplicationContext())
                    .load(paths.get(position))
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(imgV);


        }catch (Exception ex){

        }

        container.addView(vw);

        return vw;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}

