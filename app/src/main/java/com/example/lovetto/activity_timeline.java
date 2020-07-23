package com.example.lovetto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_timeline extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
    }

    public void tornaDettagliIncubata(View view){
        intent= new Intent(this, activity_dettagli_incubata.class);
        startActivity(intent);
    }
}
