package com.example.greenbin;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class tamagotchi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamagotchi);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


//    // i get the reference to the button from the XML
//    Button button = (Button)findViewById(R.id.button);
//    // now i set the listener
//    button.setOnClickListener(new View.OnClickListener()
//    {
//        @Override
    public void toMap() {
        // Here you should add the code you want to execute when the button is clicked
        // In our case we want to open the activity
        Intent intent = new Intent(this, MapsActivity.class);
        // It will open the activity
        startActivity(intent);
        // ... and stop.
//        }
//    });
    }
}
