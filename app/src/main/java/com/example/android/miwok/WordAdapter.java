package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Greta Grigutė on 2018-03-07.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    //Resource ID for the background color for this list of words
    private int mColorResourceId;

    /**Create a new {@link WordAdapter} object.
      *
      * @param context is the current context (i.e. Activity) that the adapter is being created in.
      * @param objects is the list of {@link Word}s to be displayed.
      * @param colorResourceId is the resource ID for the background color for this list of words.
    */
    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects, int colorResourceId) {
        super(context,0, objects);
        mColorResourceId = colorResourceId;
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
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        //Find button play in the list_item.xml layout with the ID play_button
        ImageView play = listItemView.findViewById(R.id.play_button);
        //Set Image button background color to main background color.
        play.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
