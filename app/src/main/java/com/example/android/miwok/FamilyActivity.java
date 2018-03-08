package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Create a string ArrayList with ten words - family members - with english and miwok translations.
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("father","әpә"));
        words.add(new Word("mother","әṭa"));
        words.add(new Word("son","angsi"));
        words.add(new Word("daughter","tune"));
        words.add(new Word("older brother","taachi"));
        words.add(new Word("younger brother","chalitti"));
        words.add(new Word("older sister","teṭe"));
        words.add(new Word("younger sister","kolliti"));
        words.add(new Word("grandmother","ama"));
        words.add(new Word("grandfather","paapa"));


        //Create an WordAdapter adapter.
        WordAdapter adapter = new WordAdapter(this, words);
        //Find the ListView so we can set Adapter to it.
        ListView listView = findViewById(R.id.list);
        //Set adapter to ListView.
        listView.setAdapter(adapter);

    }

}