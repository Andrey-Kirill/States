package com.example.tests_states;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<State> states;
    StateAdapter adapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        states = new ArrayList<>();
        lv = findViewById(R.id.countriesList);
        states.add(new State("name","capital",12));
        adapter = new StateAdapter(getApplicationContext(),R.layout.list_item,states);
        lv.setAdapter(adapter);
    }
}