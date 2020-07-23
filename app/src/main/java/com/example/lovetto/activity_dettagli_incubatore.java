package com.example.lovetto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_dettagli_incubatore extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettagli_incubatore);
    }

    public void tornaCreaIncubata(View view) {
        intent = new Intent(this, activity_crea_incubata.class);
        startActivity(intent);
    }
}
