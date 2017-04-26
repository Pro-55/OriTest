package com.pro.oritest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
        ActionBar ab= getSupportActionBar();
    }

    public void startEdit(View view) {
        Intent I = new Intent(this, EditAccount.class);
        startActivity(I);
    }
}
