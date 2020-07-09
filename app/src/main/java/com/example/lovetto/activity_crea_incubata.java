package com.example.lovetto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_crea_incubata extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crea_incubata);
    }


    public void lanciaDettagliIncubatore(View view) {
        intent = new Intent(this, activity_dettagli_incubatore.class);
        startActivity(intent);
    }
}
