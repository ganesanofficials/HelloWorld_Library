package com.example.helloworld;

import android.content.Context;
import android.widget.Toast;

public class HelloWorld {

    public HelloWorld(Context context){
        Toast.makeText(context, "Hello World", Toast.LENGTH_LONG).show();
    }
}
