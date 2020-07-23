package com.example.lovetto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

    public void inserisciIncubata(View view){
        intent= new Intent(this, activity_list.class);
        startActivity(intent);
        Toast.makeText(this, "Incubata creata!", Toast.LENGTH_LONG).show();
    }
}
