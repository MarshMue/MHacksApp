package com.mueller.marshall.mhacksapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    //data
    private final int NUM_OF_NAME_ALGS = 20;
    private int index;
    private TextView mGeneratedName;
    private Button mGenerateButton;

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

    //this is where the name gets created
    private void generateName() { 
        mGeneratedName = (TextView) findViewById(R.id.randName);
        String name = new String();
        switch (index) {
            case 0:
                //index number correlates to which name algorithm is used, including index numbers for debug purposes
                
                //set the name to the TextView
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                    + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandCons()
                    + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons() + " 0";
                break;
            case 1:
                name = JavaStringArrayTest.getRandVow().toUpperCase() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandVow() + " 1";
                break;
            case 2:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandCons() + " 2";
            case 3:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + " 3";
            case 4:
                name = JavaStringArrayTest.getRandVow().toUpperCase() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + " 4";
            case 5:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandVow() + " 5";
            case 6:
                name = JavaStringArrayTest.getRandVow().toUpperCase() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandCons() + " 6";
            case 7:
                name = JavaStringArrayTest.getRandVow().toUpperCase() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandCons() + " 7";
            case 8:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandCons() + " 8";
            case 9:
                name = JavaStringArrayTest.getRandVow().toUpperCase() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + " 9";
            case 10:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons() + " 10";
            case 11:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + " 11";
            case 12:
                name = JavaStringArrayTest.getRandVow().toUpperCase() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons() + " 12";
            case 13:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons() + " 13";
            case 14:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandVow() + " 14";
            case 15:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                        + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandCons()
                        + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons()
                        + JavaStringArrayTest.getRandCons() + " 15";
            case 16:
                name = JavaStringArrayTest.getRandVow().toUpperCase() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandCons() + " 16";
            case 17:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + " 17";
            case 18:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + " 18";
            case 19:
                name = JavaStringArrayTest.getRandCons().toUpperCase() + JavaStringArrayTest.getRandVow()
                     + JavaStringArrayTest.getRandCons() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandCons()
                     + JavaStringArrayTest.getRandVow() + JavaStringArrayTest.getRandVow()
                     +JavaStringArrayTest.getRandCons() + " 19";
        }
        mGeneratedName.setText(name);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGenerateButton = (Button)findViewById(R.id.buttonGenerate);
        mGenerateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateName();
                index = (int) (Math.random() * NUM_OF_NAME_ALGS);
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

