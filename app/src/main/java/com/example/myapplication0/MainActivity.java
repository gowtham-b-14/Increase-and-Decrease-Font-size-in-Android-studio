package com.example.myapplication0;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    float font_size;
    int cnt = 1;
    TextView textView;
    Button fontButton;
    Button colorButton;

    public void onFontChange(View view){

        textView.setTextSize(font_size);
        font_size += 2;
        if(font_size == 50) {
            font_size = 30;
        }

    }

    public void onColorChange(View view){

        switch (cnt){
            case 1:
                textView.setTextColor(Color.RED);
                break;
            case 2:
                textView.setTextColor(Color.GREEN);
                break;
            case 3:
                textView.setTextColor(Color.BLUE);
                break;
            case 4:
                textView.setTextColor(Color.MAGENTA);
                break;
            case 5:
                textView.setTextColor(Color.YELLOW);
                break;
            case 6:
                textView.setTextColor(Color.GRAY);
                break;
        }
        cnt++;
        if(cnt == 7){
            cnt = 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        fontButton = (Button)findViewById(R.id.sizeButton);
        colorButton = (Button)findViewById(R.id.colorButton);
        font_size = textView.getTextSize();
    }
}