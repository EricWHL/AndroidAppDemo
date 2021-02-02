package com.example.androidappdemo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.androidappdemo.R;

public class MainActivity extends AppCompatActivity {
    final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void onClick(View v) {
        Log.d(TAG,"onClick");
        switch(v.getId()) {
            case R.id.RecycleView:
                Log.d(TAG,"RecycleView button clicked");
                break;
            case R.id.LinearLayout:
                Log.d(TAG,"LinearLayout button clicked");
                break;
            case R.id.RelativeLayout:
                Log.d(TAG,"RelativeLayout button clicked");
                break;
            case R.id.AbsoluteLayout:
                Log.d(TAG,"AbsoluteLayout button clicked");
                break;
            case R.id.FrameLayout:
                Log.d(TAG,"FrameLayout button clicked");
                break;
            case R.id.TableLayout:
                Log.d(TAG,"TableLayout button clicked");
                break;

            default:
                break;
        }
    }
}