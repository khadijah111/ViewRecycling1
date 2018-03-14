package com.example.android.viewrecycling1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by khadijah on 3/13/2018.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Activity context, ArrayList<Book> book) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, book);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Book object located at this position in the list
        Book currentBook = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID book_name
        TextView bookNameTextView = (TextView) listItemView.findViewById(R.id.book_name);

        // Get the Book name from the current Book object and
        // set this text on the TextView
        bookNameTextView.setText(currentBook.getBookName());

        // Find the TextView in the list_item.xml layout with the ID book_image
        ImageView imageTextView = (ImageView) listItemView.findViewById(R.id.book_image);

        // Get the book image from the current Book object and
        // set this text on the ImageView
        imageTextView.setImageResource(currentBook.getImageID());

        // Return the whole list item layout (containing 1 TextViews  and 1 imageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}