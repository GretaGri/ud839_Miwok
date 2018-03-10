package com.example.android.miwok;

import android.content.Context;

/**
 * Created by Greta Grigutė on 2018-03-07.
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {
    //String value default translation for the word
    private String mDefaultTranslation;

    //String value miwok translation for the word
    private String mMiwokTranslation;

    //Integer value for resource id of image corresponding the word
    private int mImageResourceId;

    /**
     * Constructs a new Word object with initial values for Default translation, Miwok translation and image resource.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     *                           
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Gets the miwok string value in the Word.
     *
     * @return current miwok translation in the Word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Gets the default string value in the Word.
     *
     * @return current default translation in the Word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Gets the image resource id in the Word.
     *
     * @return current image corresponding with the Word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}