package com.example.emman.mobapdemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Game_Activity extends AppCompatActivity {

    Ball V;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_);

        v = new Ball(this);
        setContentView(v);

    }
}
