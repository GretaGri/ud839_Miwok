package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
//Create a string ArrayList with ten phrases with english and miwok translations.
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Where are you going?","minto wuksus"));
        words.add(new Word("What is your name?","tinnә oyaase'nә"));
        words.add(new Word("My name is...","oyaaset..."));
        words.add(new Word("How are you feeling?","michәksәs?"));
        words.add(new Word("I’m feeling good.","kuchi achit"));
        words.add(new Word("Are you coming?","әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        words.add(new Word("I’m coming.","әәnәm"));
        words.add(new Word("Let’s go.","yoowutis"));
        words.add(new Word("Come here.","әnni'nem"));


        //Create an WordAdapter adapter.
        WordAdapter adapter = new WordAdapter(this, words);
        //Find the ListView so we can set Adapter to it.
        ListView listView = findViewById(R.id.list);
        //Set adapter to ListView.
        listView.setAdapter(adapter);

    }

}