package com.example.greenbin;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.zxing.Result;

import static android.support.constraint.Constraints.TAG;


public class SimpleScannerActivity extends AppCompatActivity {
    private CodeScanner mCodeScanner;

    String[] HardCodedValueBase = {"06793401", "06942508", "060383758783"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Get permissions

        while (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(SimpleScannerActivity.this, new String[] {Manifest.permission.CAMERA}, 42);
            try { Thread.sleep(100); } catch(Exception e) {}
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        CodeScannerView scannerView = findViewById(R.id.scanner_view);
        mCodeScanner = new CodeScanner(this, scannerView);

        final Activity activity = SimpleScannerActivity.this;
        mCodeScanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull final Result result) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        handleResult(result.getText());
                    }
                });
            }
        });
        scannerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCodeScanner.startPreview();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mCodeScanner.startPreview();
    }

    @Override
    protected void onPause() {
        mCodeScanner.releaseResources();
        super.onPause();
    }

    protected void handleResult(String Text_){
        boolean found = false;
        for ( String s : HardCodedValueBase ) {
            if (Text_.equals(s)) {
                //TODO: Increment score/points by 5
                Toast.makeText(SimpleScannerActivity.this, "5 Points for: " + Text_, Toast.LENGTH_SHORT).show();
                found = true;
            }
        }
        if (! found){
            Toast.makeText(SimpleScannerActivity.this, Text_, Toast.LENGTH_SHORT).show();
        }
    }
}