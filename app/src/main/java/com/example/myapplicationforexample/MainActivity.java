package com.example.myapplicationforexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

// THIS HERE
import android.util.Log;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupUI();
    }
    private void setupUI(){
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
    }
    // Creates a local variable for identifying the class where the log statements come from.
    private final static String LOG_TAG = MainActivity.class.getSimpleName();

    /**
     * This method is called when the on screen button is pressed.
     *
     * @param view
     */
     public void buttonPressed(View view){
         // An 'info' log statement.
         Log.i(LOG_TAG, "buttonPressed(View) Called");

         // the 'String' we wished to be displayed.
         String stringValue = "Hello World!";

         // change the text of the TextView on the screen
         mTextView.setText(stringValue);
         // A 'verbose' log statement.
         Log.v(LOG_TAG, " text changed to:" + stringValue);

         //A 'debug' log statement
         Log.d(LOG_TAG, "buttonPressed(View) finished");
     }
}