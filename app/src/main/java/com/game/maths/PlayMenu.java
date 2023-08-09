package com.game.maths;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class PlayMenu extends AppCompatActivity  {

    String name;
    TextView nameTV;
    int difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_menu);
        Button easyBT = findViewById(R.id.easyBT);
        Button mediumBT = findViewById(R.id.mediumBT);
        Button hardBT = findViewById(R.id.hardBT);
//        easyBT.setOnClickListener(this);
//        mediumBT.setOnClickListener(this);
//        hardBT.setOnClickListener(this);
        getData();
        setName();

        easyBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                difficulty = 2;
                Intent intent = new Intent(PlayMenu.this,PlayGround.class);
                intent.putExtra("difficulty",difficulty);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });


        mediumBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                difficulty = 4;
                Intent intent = new Intent(PlayMenu.this,PlayGround.class);
                intent.putExtra("difficulty",difficulty);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

        hardBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                difficulty = 6;
                Intent intent = new Intent(PlayMenu.this,PlayGround.class);
                intent.putExtra("difficulty",difficulty);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
    }



    private void setName() {
        nameTV = findViewById(R.id.nameTV);
        nameTV.setText(name);
    }

    public void getData() {
        Intent i = getIntent();
        name = i.getStringExtra("name");
    }
//
//    @Override
//    public void onClick(View v) {
//        int id = v.getId();
//        switch(id) {
//            case R.id.easyBT:
//                difficulty = 2;
//                break;
//            case R.id.mediumBT:
//                difficulty = 4;
//                break;
//            case R.id.hardBT:
//                difficulty = 6;
//                break;
//        }
//        Intent intent = new Intent(PlayMenu.this,PlayGround.class);
//        intent.putExtra("difficulty",difficulty);
//        intent.putExtra("name",name);
//        startActivity(intent);
//    }

}
