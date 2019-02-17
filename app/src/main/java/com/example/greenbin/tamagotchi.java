package com.example.greenbin;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.solver.widgets.Rectangle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class tamagotchi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamagotchi);

        ImageView trash = findViewById(R.id.trash);
        trash.setVisibility(View.VISIBLE);



        //Copy-pasta button mapings:
//        final ButtonBarLayout buttonT = findViewById(R.id.tomo);
//        buttonT.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Code here executes on main thread after user presses button
//                gotoTomo(v);
//            }
//        });

        final ButtonBarLayout buttonG = findViewById(R.id.gps);
        buttonG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                gotoGps(v);
            }
        });

        //Copy-pasta button mapings:
        final ButtonBarLayout buttonS = findViewById(R.id.scan);
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

        final ButtonBarLayout buttonSh = findViewById(R.id.shop);
        buttonSh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                gotoShop(v);
            }
        });

    }

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
