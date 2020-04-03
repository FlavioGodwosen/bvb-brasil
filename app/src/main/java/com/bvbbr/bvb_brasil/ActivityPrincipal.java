package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

import static android.content.ContentValues.TAG;

public class ActivityPrincipal extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");

         myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", Objects.requireNonNull(error).toException());
            }


        });


        Button Bundesliga = this.findViewById(R.id.Bundesliga);
        Button SuperCopa = this.findViewById(R.id.SuperCopa);
        Button Pokal = this.findViewById(R.id.Pokal);
        Button ChampionsL = this.findViewById(R.id.ChampionsL);
        Button Encontros = this.findViewById(R.id.Encontros);

        Bundesliga.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, BotoesActivity.class);
                startActivity(intent);


            }
        });

        ChampionsL.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, ChampionsLActivity.class);
                startActivity(intent);


            }
        });

        SuperCopa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, JogoSuperCupActivity.class);
                startActivity(intent);


            }
        });

        Pokal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, PokalActivity.class);
                startActivity(intent);


            }
        });

        Encontros.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, EncontroActivity.class);
                startActivity(intent);


            }
        });

    }

}


