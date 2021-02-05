package com.example.androidappdemo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidappdemo.R;
import com.example.androidappdemo.Utils.MessageEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {
    final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
        setTitle("Main View");
        EventBus.getDefault().register(this);
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
        EventBus.getDefault().removeAllStickyEvents();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void messageRecevied(MessageEvent msg) {
        Log.d(TAG,"messageRecevied " + "id:" + msg.getEventId() + " message:" + msg.getMessage());
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
            case R.id.BRVAH:
                Log.d(TAG,"BRVAH button clicked");
                Intent b_intent = new Intent(MainActivity.this,BrvahActivity.class);
                startActivity(b_intent);
                break;
            case R.id.Fragment:
                Log.d(TAG,"Fragment button clicked");
                Intent fr_intent = new Intent(MainActivity.this, FragmentMainActivity.class);
                startActivity(fr_intent);
                break;
            default:
                break;
        }

    }
}