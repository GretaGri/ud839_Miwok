package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer player;
    private int currentWordMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a string ArrayList with ten words numbers from 1 to 10 with english and miwok translations.
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one","lutti",R.drawable.number_one, R.raw.number_one));
        words.add(new Word("two","otiiko",R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three","tolookosu",R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six","temmokka",R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven","kenekaku",R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight","kawinta",R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine","wo'e",R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten","na'aacha",R.drawable.number_ten, R.raw.number_ten));

        //Create an WordAdapter adapter.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        //Find the ListView so we can set Adapter to it.
        ListView listView = findViewById(R.id.list);
        //Set adapter to ListView.
        listView.setAdapter(adapter);

        //Play media file of the word item which is clicked.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                currentWordMedia = words.get(position).getMediaResourceId();
                player = MediaPlayer.create(NumbersActivity.this, currentWordMedia);
                player.start();
                Word word = words.get(position);
                Log.v ("NumbersActivity", "Current word: " + word);
            }
        });
        }

    }
