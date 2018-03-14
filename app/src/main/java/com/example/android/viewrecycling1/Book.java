package com.example.android.viewrecycling1;

/**
 * Created by khadijah on 3/13/2018.
 */
public class Book {
    //Each Book Properties
    private String mBookName;
    private Integer mImageID;

    //Constructor
    public Book(String name, int imageID)
    {
        mBookName = name;
        mImageID = imageID;
    }
    //getter to retrieve  book properties.
    public String getBookName(){return mBookName;}
    public Integer getImageID(){return mImageID;}
}