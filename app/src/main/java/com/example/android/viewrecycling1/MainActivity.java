package com.example.android.viewrecycling1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Book> booksItems = new ArrayList<Book>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        booksItems.add(new Book("Android for dummies!!", R.drawable.book_1));
        booksItems.add(new Book("Programming android", R.drawable.book_2));
        booksItems.add(new Book("Android Games", R.drawable.book_3));
        booksItems.add(new Book("Hellow android", R.drawable.book_4));
        booksItems.add(new Book("Android Threading!!", R.drawable.book_5));

        BookAdapter items = new BookAdapter(this, booksItems);
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(items);
    }
}