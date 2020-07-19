package com.example.lovetto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_tutorial extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        // Nascondo la actionbar
        getSupportActionBar().hide();
    }

    public void lanciaDettaglioTutorial(View v) {
        intent = new Intent(this, activity_tutorial.class);
        startActivity(intent);
    }
}
