package com.example.lovetto;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanciaDettagliIncubata(View view) {
        intent = new Intent(this, activity_dettagli_incubata.class);
        startActivity(intent);
    }

    public void lanciaCreaIncubata(View view) {
        intent = new Intent(this, activity_crea_incubata.class);
        startActivity(intent);
    }

    public void lanciaListaTutorial(MenuItem item) {
        intent = new Intent(this, activity_tutorial.class);
        startActivity(intent);
    }
}
