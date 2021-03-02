package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.cpp, R.drawable.csharp, R.drawable.js, R.drawable.kotlin, R.drawable.python,
            R.drawable.ruby, R.drawable.swift, R.drawable.java, R.drawable.typescript,R.drawable.vscode};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = getResources().getStringArray(R.array.Programming_languages);
        s2 = getResources().getStringArray(R.array.description);

        recyclerView = findViewById(R.id.recyclerView);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter((myAdapter));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}