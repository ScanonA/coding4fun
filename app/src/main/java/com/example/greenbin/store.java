package com.example.greenbin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class store extends AppCompatActivity {

    String[] hats = new String[4];
    String[] pants = new String[2];
    private ListView storeItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        storeItems = (ListView) findViewById(R.id.storeItems);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.store_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Change the map type based on the user's selection.
        ImageView image;
        View v;
        switch (item.getItemId()) {
            case R.id.hats:
                v = new ImageView(getBaseContext());
                for (int i = 0; i < hats.length; i++){
                    int resID = getResources().getIdentifier(hats[i], "drawable", getPackageName());
                    image = new ImageView(v.getContext());
                    image.setImageResource(resID);
                    storeItems.addView(image);
                }
                return true;
            case R.id.pants:
                v = new ImageView(getBaseContext());
                for (int i = 0; i < hats.length; i++){
                    int resID = getResources().getIdentifier(hats[i] , "drawable", getPackageName());
                    image = new ImageView(v.getContext());
                    image.setImageResource(resID);
                    storeItems.addView(image);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
