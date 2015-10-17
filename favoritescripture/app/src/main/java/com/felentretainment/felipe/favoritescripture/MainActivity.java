package com.felentretainment.felipe.favoritescripture;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public final static String BOOK_NAME = "com.felentretainment.felipe.favoritescripture.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void shareScripture(View view){
        //Intent to create a new activity
        Intent intent = new Intent (this, shareScripture.class);

        //Create three edit texts with book chapter:verse
        EditText book = (EditText)findViewById(R.id.text_book);
        EditText chapter = (EditText)findViewById(R.id.text_chapter);
        EditText verse = (EditText)findViewById(R.id.text_verse);

        //add them in the extra of the intent
        String chapter_string = chapter.getText().toString();

        String verse_string = verse.getText().toString();

        String scripture_string = book.getText().toString()
                + chapter_string + ":" + verse_string;
        intent.putExtra("SCRIPTURE_NAME", scripture_string);



        startActivity(intent);
    }
}
