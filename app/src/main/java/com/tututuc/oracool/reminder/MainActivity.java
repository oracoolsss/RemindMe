package com.tututuc.oracool.reminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a,b,c = 2;
        b = getda(c);
    }

    public int getda(int n) {
        return(n*n*n);
    }
}
