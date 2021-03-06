package com.example.lovetto;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lovetto.utility.datiTemporanei;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class activity_dettagli_incubata extends AppCompatActivity {
    private Intent intent;
    private Context context;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettagli_incubata);

        // Nascondo la actionbar
        getSupportActionBar().hide();

        context=this;
        bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
    }

    public void mostraControlloRemoto(View view) {
        intent = new Intent(this, activity_controllo_remoto.class);
        startActivity(intent);
    }

    public void mostraTimeline(View view) {
        intent = new Intent(this, activity_timeline.class);
        startActivity(intent);
    }

    public void mostraSperatura(View view) {
        intent = new Intent(this, activity_speratura.class);
        startActivity(intent);
    }

    public void mostraModificaDettagliIncubata(View view) {
        intent = new Intent(this, activity_modifica_dettagli_incubata.class);
        startActivity(intent);
    }

    public void mostraCalendario(View view) {
        intent = new Intent(this, activity_calendario.class);
        startActivity(intent);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod = new BottomNavigationView.OnNavigationItemSelectedListener() {
        public boolean onNavigationItemSelected (@NonNull MenuItem item){
            switch (item.getItemId()) {
                case R.id.home:
                    boolean creata = datiTemporanei.getIncubataCreata();
                    Intent intent1;
                    if (creata) {
                        intent1 = new Intent(context, activity_oggi.class);
                    } else{
                        intent1 = new Intent(context, MainActivity.class);
                    }
                    startActivity(intent1);
                case R.id.listaIncubata:
                    Intent intent2 = new Intent(context, activity_list.class);
                    startActivity(intent2);
                    break;
                case R.id.vendite:
                    Intent intent3 = new Intent(context, activity_vendita.class);
                    startActivity(intent3);
                    break;
                case R.id.tutorial:
                    Intent intent4 = new Intent(context, activity_tutorial.class);
                    startActivity(intent4);
                    break;

            }
            return false;
        }
    };


}
