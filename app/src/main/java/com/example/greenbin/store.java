package com.example.greenbin;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.zxing.Result;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class store extends AppCompatActivity {

    int[] hats = {R.drawable.tophat};
    String[] hatNames = {"tophat"};
    int[] hatPrice = {5};
    String[] pants = new String[2];
    private ListView storeItems;
    private AdapterView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        
        //Copy-pasta button mapings:
        final ButtonBarLayout buttonT = findViewById(R.id.tomo);
        buttonT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                gotoTomo(v);
            }
        });

        final ButtonBarLayout buttonG = findViewById(R.id.gps);
        buttonG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                gotoGps(v);
            }
        });

        //Copy-pasta button mapings:
        final ButtonBarLayout buttonS = findViewById(R.id.shop); //Stupid fix.
        buttonS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                gotoScanner(v);
            }
        });

        final ButtonBarLayout buttonL = findViewById(R.id.leader);
        buttonL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                gotoLeader(v);
            }
        });

//        final ButtonBarLayout buttonSh = findViewById(R.id.shop);
//        buttonSh.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Code here executes on main thread after user presses button
//                gotoShop(v);
//            }
//        });

        List<HashMap<String, String>> myList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < hats.length; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("hat_names", hatNames[i]);
            //hm.put("hat_price", Integer.toString(hatPrice[i]));
            hm.put("hat_image", Integer.toString(hats[i]));
            myList.add(hm);
        }
        String[] from = {"hat_image", "hat_names"};
        //int[] to = {R.id.listview_image, R.id.listview_item_title};
        //SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), myList, R.layout.listview_activity, from, to);
        //ListView androidListView = (ListView) findViewById(R.id.storeItems);
        //androidListView.setAdapter(simpleAdapter);



        //storeItems = (ListView) findViewById(R.id.storeItems);
        //storeItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //    @Override
        //    public void onItemClick(AdapterView<?> parent, View view,
        //                            int position, long id) {
        //        Toast.makeText(getApplicationContext(),
        //                "Click ListItem Number " + position, Toast.LENGTH_LONG)
        //                .show();
        //    }
        //});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.store_options, menu);
        return true;
    }

    /*@Override
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
    }*/


    //Copy-pasta Gotos
    public void gotoGps(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void gotoScanner(View v) {
        Intent intent = new Intent(this, SimpleScannerActivity.class);
        startActivity(intent);
    }

    public void gotoTomo(View v) {
        Intent intent = new Intent(this, tamagotchi.class);
        startActivity(intent);
    }

    public void gotoShop(View v) {
        Intent intent = new Intent(this, store.class);
        startActivity(intent);
    }

    public void gotoLeader(View v) {
        Intent intent = new Intent(this, Leadersboard.class);
        startActivity(intent);
    }

}
