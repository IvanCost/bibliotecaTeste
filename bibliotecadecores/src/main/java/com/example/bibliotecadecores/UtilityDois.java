package com.example.bibliotecadecores;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class UtilityDois extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utility_dois);
    }

    public static int color = 0;

    public void setColor (@ColorInt int colorID){
        color = colorID;
    }
}
