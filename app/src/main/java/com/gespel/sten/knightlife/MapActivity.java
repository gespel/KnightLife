package com.gespel.sten.knightlife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        Button yourButton = (Button) findViewById(R.id.backButton);
        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MapActivity.this, MainActivity.class));
            }
        });
        TextView posXlabel = (TextView) findViewById(R.id.posXout);
        TextView posYlabel = (TextView) findViewById(R.id.posYout);

        Player p = new Player();
        posXlabel.setText(new Integer(p.getPosX()));
        posYlabel.setText(p.getPosY());

    }


}
