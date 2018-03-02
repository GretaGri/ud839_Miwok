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

        // Find the root view so we can add child views to it.
        LinearLayout rootView = findViewById(R.id.rootView);

        // Create a variable to keep track of the current index position.
        int index = 0;

        // Place new textViews in numbers activity using while loop to avoid repetition.
        // Keep looping as long as the current index position is less than the length of the list.
        while (index < words.size()) {
            TextView wordView = new TextView(this); //Create a new TextView
            wordView.setText(words.get(index)); //Set the text to be the word at the current index
            rootView.addView(wordView); //Add this TextView as the another child to the root view of this layout
            index++; //Increment the index variable by 1
        }

    }
}
