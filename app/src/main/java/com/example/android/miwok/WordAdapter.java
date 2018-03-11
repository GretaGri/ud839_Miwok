package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Greta Grigutė on 2018-03-07.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID list_item_miwok
        TextView miwokTextView = listItemView.findViewById(R.id.list_item_miwok);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID list_item_default
        TextView defaultTextView = listItemView.findViewById(R.id.list_item_default);
        // Get the default translation from the current Word object and
        // set this text on the default TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView image = listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current Word object and set the image to image
        // Check if an image is provided for this word or not
         if (currentWord.hasImage()) {
         // If an image is available, display the provided image based on the resource ID
         image.setImageResource(currentWord.getImageResourceId());
        // Make sure the view is visible
         image.setVisibility(View.VISIBLE);
         } else {
         // Otherwise hide the ImageView (set visibility to GONE)
         image.setVisibility(View.GONE);
         }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
