package com.gespel.sten.knightlife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CharacterActivity extends AppCompatActivity {
        TextView level;
        TextView exp;
        TextView gold;
        TextView fame;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.character);
            Button yourButton = (Button) findViewById(R.id.backButton);
            yourButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    startActivity(new Intent(CharacterActivity.this, MainActivity.class));
                }
            });

            Player p = new Player();

            level = (TextView) findViewById(R.id.levelOut);
            level.setText(new Integer(p.getLevel()).toString());
            exp = (TextView) findViewById(R.id.expOut);
            exp.setText(new Integer(p.getExp()).toString());
            gold = (TextView) findViewById(R.id.goldOut);
            gold.setText(new Integer(p.getGold()).toString());
            fame = (TextView) findViewById(R.id.fameOut);
            fame.setText(new Integer(p.getRuhm()).toString());



        }



}
