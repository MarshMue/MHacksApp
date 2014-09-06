package com.mueller.marshall.mhacksapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    //CONSTANTS
    private final int NUM_OF_NAME_ALGS = 1;

    public static class JavaStringArrayTest {
        private static String[] mConsonants = new String[] {
            "b",
            "c",
            "d",
            "f",
            "g",
            "h",
            "j",
            "k",
            "l",
            "m",
            "n",
            "o",
            "q",
            "r",
            "s",
            "t",
            "v",
            "w",
            "x",
            "z"};
        private static String getRandCons() {
            return mConsonants[(int) (Math.random() * 20)];
        }
        //define vowels
        private static String[] mvowels = new String[] {
                "a",
                "e",
                "i",
                "o",
                "u",
                "y"};
            private static String getRandVow() {
                return mvowels[(int) (Math.random() * 6)];
            }
        }

    private void generateName() { //this is where the name gets created
        mGeneratedName = (TextView) findViewById(R.id.randName);
        String name = new String();
        //int index = (int) Math.random() * NUM_OF_NAME_ALGS; // this is for the future when
        //if (index = 1){                       // more options of name generation are ready
        //index number correlates to which name algorithm is used
        name = JavaStringArrayTest.getRandCons() +JavaStringArrayTest.getRandVow();
        mGeneratedName.setText(name); //set the name to the TextView
        //  }
    }
        private TextView mGeneratedName;
        private Button mGenerateButton;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mGenerateButton = (Button)findViewById(R.id.buttonGenerate);
            mGenerateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    generateName();
                }
            });

    }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();
            if (id == R.id.action_settings) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }

