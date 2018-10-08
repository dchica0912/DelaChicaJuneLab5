package com.delachica.june;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4itf", "onCreate has executed...");

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

    public void btn2(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void processNational(View v){
        Intent i = null, chooser = null;
        if(v.getId()== R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.586986,120.981247"));
            chooser = Intent.createChooser(i, "Select your map app");
            startActivity(i);
        }
    }

    public void startService(View v){
        Intent i = new Intent(this,myService.class);
        startService(i);
    }

}
