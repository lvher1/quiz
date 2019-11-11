package com.example.quiz_coding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StartScreenActivity extends AppCompatActivity {
    Button Standard_btn;
    Button Creative_btn;
    Button Battle_btn;
    Button Board_btn;
    Button Bookmark_btn;
    Button Setting_btn;
    public static final int sub = 1001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);


        
        Standard_btn =findViewById(R.id.Standard_btn);
        Creative_btn =findViewById(R.id.Create_btn);
        Battle_btn = findViewById(R.id.Battle_btn);
        Board_btn =findViewById(R.id.Board_btn);
        Bookmark_btn =findViewById(R.id.Bookmark_btn);
        Setting_btn = findViewById(R.id.Setting_btn);

        Standard_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(StartScreenActivity.this,StandardActivity.class);
                startActivity(intent1);
            }
        });
        Creative_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(StartScreenActivity.this,CreativeActivity.class);
                startActivity(intent2);
            }
        });
        Battle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(StartScreenActivity.this,BattleActivity.class);
                startActivity(intent3);
            }
        });
        Board_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(StartScreenActivity.this,BoardActivity.class);
                startActivity(intent4);
            }
        });
        Bookmark_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(StartScreenActivity.this,BookmarkActivity.class);
                startActivity(intent5);
            }
        });
        Setting_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(StartScreenActivity.this,SettingActicity.class);
                startActivity(intent6);
            }
        });
    }
}
