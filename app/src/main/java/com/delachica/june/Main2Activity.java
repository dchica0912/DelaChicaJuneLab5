package com.delachica.june;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itf", "onStart has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itf", "onResume has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itf", "onPause has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itf", "onRestart has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf", "onDestroy has executed");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf", "onStop has executed");
    }

    public void btn1(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId()== R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.610400,120.991916"));
            chooser = Intent.createChooser(i, "Select your map app");
            startActivity(i);
        }
    }



}
