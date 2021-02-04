package com.example.androidappdemo.Activity;

import android.os.Bundle;
import android.util.Log;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.androidappdemo.Fragment.ChatFragment;
import com.example.androidappdemo.Fragment.TabFragment;
import com.example.androidappdemo.Fragment.TitleFragment;
import com.example.androidappdemo.R;

public class FragmentMainActivity extends AppCompatActivity implements TabFragment.OnTabFragmentListener {
    private static final String TAG = "FragmentMainActivity";


    private static final int TAG_FRAGMENT_SWITCH_MESSAGE  = 0;
    private static final int TAG_FRAGMENT_SWITCH_CONTACT  = 1;
    private static final int TAG_FRAGMENT_SWITCH_DISCOVER = 2;
    private static final int TAG_FRAGMENT_SWITCH_SETTINGS = 3;

    private FragmentManager mFrgmMgr;
    private FragmentTransaction mTrans;

    private TitleFragment mTitleFrag;
    private TabFragment mTabFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
//        mFrgmMgr = getSupportFragmentManager();
//        mTrans = mFrgmMgr.beginTransaction();
//
//        mTitleFrag = TitleFragment.newInstance(null,null);
//        mTrans.add(R.id.title_container, mTitleFrag,"Title");
//
//        mTabFrag = TabFragment.newInstance(null,null);
//        mTrans.add(R.id.tab_container, mTabFrag,"Tab");
//        mTrans.commit();
        getSupportFragmentManager().beginTransaction().add(R.id.title_container, TitleFragment.newInstance(null,null), "title").commit();
        getSupportFragmentManager().beginTransaction().add(R.id.tab_container, TabFragment.newInstance(null,null), "tab").commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, ChatFragment.newInstance(1), "chat").commit();

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

    }

    @Override
    public void onTabSwitch(int tab) {
        Log.d(TAG,"onTabSwitch" + tab);
        switch (tab) {
            case TAG_FRAGMENT_SWITCH_MESSAGE:
                Log.d(TAG,"TAG_FRAGMENT_SWITCH_MESSAGE");
                break;
            case TAG_FRAGMENT_SWITCH_CONTACT:
                Log.d(TAG,"TAG_FRAGMENT_SWITCH_CONTACT");
                break;
            case TAG_FRAGMENT_SWITCH_DISCOVER:
                Log.d(TAG,"TAG_FRAGMENT_SWITCH_DISCOVER");
                break;
            case TAG_FRAGMENT_SWITCH_SETTINGS:
                Log.d(TAG,"TAG_FRAGMENT_SWITCH_SETTINGS");
                break;
            default:
                break;
        }
    }
}