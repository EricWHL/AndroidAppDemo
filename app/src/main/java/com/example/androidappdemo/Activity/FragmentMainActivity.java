package com.example.androidappdemo.Activity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.androidappdemo.Fragment.TitleFragment;
import com.example.androidappdemo.R;

public class FragmentMainActivity extends AppCompatActivity {
    private static final String TAG = "FragmentMainActivity";

    private FragmentManager mFrgmMgr;
    private FragmentTransaction mTrans;

    private TitleFragment mTitleFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        mFrgmMgr = getSupportFragmentManager();
        mTrans = mFrgmMgr.beginTransaction();

        mTitleFrag = TitleFragment.newInstance("hello","word");
        mTrans.add(R.id.fragment_container, mTitleFrag);
        mTrans.commit();
    }
}