package com.example.lovetto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_speratura extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speratura);
    }

    public void tornaDettagliIncubata(View view){
        intent= new Intent(this, activity_dettagli_incubata.class);
        startActivity(intent);
    }

    public void mostraTutorial(View view){
        intent= new Intent(this, activity_tutorial.class);
        startActivity(intent);
    }
}
