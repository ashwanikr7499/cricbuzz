package com.example.win10.cricbuzz;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.win10.cricbuzz.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





        setContentView(R.layout.activity_main);
    }
    int Ascore=0;
    int Bscore=0;
    public void Aplus1(View view) {
        Ascore=Ascore+1;
        displayScore(Ascore);
    }
    public void Aplus2(View view) {
        Ascore=Ascore+2;
        displayScore(Ascore);
    }
    public void Aplus3(View view) {
        Ascore=Ascore+3;
        displayScore(Ascore);
    }
    public void Aplus4(View view) {
        Ascore=Ascore+4;
        displayScore(Ascore);
    }
    public void Aplus6(View view) {
        Ascore=Ascore+6;
        displayScore(Ascore);
    }
    public void AplusW(View view) {

        displayScore(-1);
    }
    private void displayScore(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.Ascore_text_view);
        quantityTextView.setText("" + number);
    }

    public void Bplus1(View view) {
        Bscore=Bscore+1;
        displayBScore(Bscore);
    }
    public void Bplus2(View view) {
        Bscore=Bscore+2;
        displayBScore(Bscore);
    }
    public void Bplus3(View view) {
        Bscore=Bscore+3;
        displayBScore(Bscore);
    }
    public void Bplus4(View view) {
        Bscore=Bscore+4;
        displayBScore(Bscore);
    }
    public void Bplus6(View view) {
        Bscore=Bscore+6;
        displayBScore(Bscore);
    }
    public void BplusW(View view) {

        displayBScore(-1);
    }
    public void Reset(View view)
    {
        Ascore=0;
        Bscore=0;
        displayBScore(Bscore);
        displayScore(Ascore);
    }
    private void displayBScore(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.Bscore_text_view);
        quantityTextView.setText("" + number);
    }

}

