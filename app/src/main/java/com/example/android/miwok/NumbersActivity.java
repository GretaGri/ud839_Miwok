package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create a string ArrayList with ten words numbers from 1 to 10.
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

LinearLayout rootView = findViewById(R.id.rootView);

//place new textViews in numbers activity using while loop to avoid repetition.
        int index = 0;
        while (index<10){
        TextView wordView = new TextView(this);
        wordView.setText(words.get(index));
        rootView.addView(wordView);
        index++;}

    }
}
