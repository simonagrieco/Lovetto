package com.example.lovetto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_dettagli_incubata extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettagli_incubata);
    }

    public void mostraControlloRemoto(View view) {
        intent = new Intent(this, activity_controllo_remoto.class);
        startActivity(intent);
    }
}
