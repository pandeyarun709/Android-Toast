package com.example.arunpandey.toastandlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "State" , "OnCreate()");

        Toast t = Toast.makeText(this,"OnCreate()",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "State" , "OnStart()");

        Toast t = Toast.makeText(this,"OnStart()",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("State", "OnResume()");

        Toast t = Toast.makeText(this,"OnResume()",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("State", "OnPause()");

        Toast t = Toast.makeText(this,"OnPause()",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("State", "OnStop()");

        Toast t =  Toast.makeText(this,"OnStop()",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("State", "OnDestroy()");

        Toast t = Toast.makeText(this,"OnDestroy()",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("State", "OnRestart()");

        Toast t =  Toast.makeText(this,"OnRestart()",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }
}
