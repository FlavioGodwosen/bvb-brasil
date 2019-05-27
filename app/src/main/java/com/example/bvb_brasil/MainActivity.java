package com.example.bvb_brasil;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        TextView Jogos = (TextView) findViewById(R.id.text);
        ListView Lista = (ListView) findViewById(R.id.lista);

        ArrayList<String> eventos = preencherdados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, eventos);
        Lista.setAdapter(arrayAdapter);

    }

    private ArrayList<String> preencherdados() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Borussia x Schalke");
        dados.add("Friburg x Borussia");
        dados.add("Borussia x Bayern");
        dados.add("Borussia x Werder Bremen");
        dados.add("Borussia x B. Monchengladbah");
        return dados;


    }
}
