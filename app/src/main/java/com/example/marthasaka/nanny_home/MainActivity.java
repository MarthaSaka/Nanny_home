package com.example.marthasaka.nanny_home;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }/*
    private String getColoredSpanned(String text, String color) {
        String input = "<font color=" + color + ">" + text + "</font>";
        return input;
    }
    TextView textView3 = (TextView)findViewById(R.id.textView3);
    String firstSentence = getColoredSpanned("First time here?", "");
    String secondSentence = getColoredSpanned("Create account","#ff69b4");
    textView3.setText(Html.fromHtml(firstSentence+" "+secondSentence));*/
}

