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

        final ButtonBarLayout button = findViewById(R.id.gps);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                next_page(v);
            }
        });

        final ButtonBarLayout button2 = findViewById(R.id.scan);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                next_page2(v);
            }
        });

    }

    public void next_page(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void next_page2(View v) {
        Intent intent = new Intent(this, SimpleScannerActivity.class);
        startActivity(intent);
    }

}
