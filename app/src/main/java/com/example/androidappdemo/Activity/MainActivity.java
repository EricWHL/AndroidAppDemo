package com.example.androidappdemo.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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
        Log.d(TAG,"onCreate");
        setTitle("Main View");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    public void onClick(View v) {
        Log.d(TAG,"onClick");
        switch(v.getId()) {
            case R.id.RecycleView:
                Log.d(TAG,"RecycleView button clicked");
                Intent r_intent = new Intent(MainActivity.this, RecycleViewActivity.class);
                startActivity(r_intent);
                break;
            case R.id.LinearLayout:
                Log.d(TAG,"LinearLayout button clicked");
                Intent l_intent = new Intent(MainActivity.this,EditorActivity.class);
                startActivity(l_intent);
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