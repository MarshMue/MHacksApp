package com.mueller.marshall.mhacksapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {

    public class JavaStringArrayTest {
        private String[] mconsonants = new String[20];

        void populateStringArray() {
            mconsonants[0] = "b";
            mconsonants[1] = "c";
            mconsonants[2] = "d";
            mconsonants[3] = "f";
            mconsonants[4] = "g";
            mconsonants[5] = "h";
            mconsonants[6] = "j";
            mconsonants[7] = "k";
            mconsonants[8] = "l";
            mconsonants[9] = "m";
            mconsonants[10] = "n";
            mconsonants[11] = "o";
            mconsonants[12] = "q";
            mconsonants[13] = "r";
            mconsonants[14] = "s";
            mconsonants[15] = "t";
            mconsonants[16] = "v";
            mconsonants[17] = "w";
            mconsonants[18] = "x";
            mconsonants[19] = "z";
        }
        private String getRandCons() {
            return mconsonants[(int) (Math.random() * 20)];
        }
    }

        public class JavaStringArrayTestTwo {
            private String[] mvowels = new String[6];

            void populateStringArray() {
                mvowels[0] = "a";
                mvowels[1] = "e";
                mvowels[2] = "i";
                mvowels[3] = "o";
                mvowels[4] = "u";
                mvowels[5] = "y";
            }
            public String getRandVow() {
                return mvowels[(int) (Math.random() * 6)];
            }
        }

        private TextView mGeneratedName;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            private void generateName() {
                String name = new String();
                int index = (int) Math.random() * 10;
                if (index = 1){
                    name = JavaStringArrayTest.getRand
                }
            }
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

