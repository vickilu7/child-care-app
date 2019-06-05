package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import java.util.Random;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String language = "French";

    String[] irishArray = new String[]{"Madra","Coinín","Féileacáin"};
    String[] englishArray = new String[]{"Dog","Rabbit","Butterfly"};
    String[] frenchArray = new String[]{"Chien","Lapin","Papillon"};

    int arrayIndex = 0;

    TextView wordView = null;

    public void setWord(){
        wordView = (TextView) findViewById(R.id.wordView);

        Random r = new Random();
        int num = r.nextInt(3 - 0);

        arrayIndex = num;

        String wordToUse = "";

        if (language.equals("Irish")){
            wordToUse = irishArray[num];
        }else if (language.equals("English")){
            wordToUse = englishArray[num];
        } else{
            wordToUse = frenchArray[num];
        }

        wordView.setText(wordToUse);
    }

    public void onGoClick(View v){
        setWord();
    }

    public void onIrishClick(View v){
        Button btn = (Button) findViewById(R.id.buttonIrish);
        language = "Irish";
        wordView.setText(irishArray[arrayIndex]);
    }

    public void onEnglishClick(View v){
        Button btn = (Button) findViewById(R.id.buttonIrish);
        language = "English";
        wordView.setText(englishArray[arrayIndex]);
    }

    public void onFrenchClick(View v){
        Button btn = (Button) findViewById(R.id.buttonIrish);
        language = "French";
        wordView.setText(frenchArray[arrayIndex]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setWord();

        String myName = "Odysseus change";
        System.out.println("My name: " + myName);

        int result = addFourNumbers(57,34,213,2131);
        System.out.println("Result of our method: " + result);


    }

    public int addFourNumbers(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public void changeMainViewToBlue(){
        getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);
    }
}
