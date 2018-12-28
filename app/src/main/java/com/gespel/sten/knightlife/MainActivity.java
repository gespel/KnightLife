package com.gespel.sten.knightlife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Player p = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button yourButton = (Button) findViewById(R.id.button);
        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, CharacterActivity.class));
            }
        });
        Button yourButton2 = (Button) findViewById(R.id.add);
        yourButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                p.addExp(100);
            }
        });
        Button mapButton = (Button) findViewById(R.id.mapbutton);
        mapButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, MapActivity.class));
            }
        });
    }

}
