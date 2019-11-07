package com.example.bibliotecadecores;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.jar.Attributes;

public class HomeLibrary extends LinearLayout {

    public HomeLibrary (Context context){
        super(context);
    }

    public HomeLibrary (Context context, Attributes attrs){
        super(context, (AttributeSet) attrs);
    }
}


