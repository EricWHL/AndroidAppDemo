package com.example.androidappdemo.Activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androidappdemo.Common.Global;
import com.example.androidappdemo.R;
import com.example.androidappdemo.Utils.MessageEvent;

import org.greenrobot.eventbus.EventBus;

public class EditorActivity extends AppCompatActivity {
    final String TAG = "EditorActivity";

    EditText mText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);
        Log.d(TAG,"onCreate");
        mText = (EditText)findViewById(R.id.Editor);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
        mText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d(TAG,"beforeTextChanged" + charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d(TAG,"onTextChanged" + charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Log.d(TAG,"afterTextChanged" + editable);
            }
        });
    }

    public void onClick(View v) {
        Log.d(TAG,"onClick");
        switch(v.getId()) {
            case R.id.Cut:
                Log.d(TAG,"Cut button clicked");
                EventBus.getDefault().post(new MessageEvent(Global.EventID.EVENT_EDIT_CUT,"Cut contents"));
                break;
            case R.id.Copy:
                Log.d(TAG,"Copy button clicked");
                EventBus.getDefault().post(new MessageEvent(Global.EventID.EVENT_EDIT_COPY,"Copy contents"));
                break;
            case R.id.Undo:
                Log.d(TAG,"Undo button clicked");
                EventBus.getDefault().post(new MessageEvent(Global.EventID.EVENT_EDIT_UNDO,"Undo contents"));
                break;
            case R.id.Redo:
                Log.d(TAG,"Redo button clicked");
                EventBus.getDefault().post(new MessageEvent(Global.EventID.EVENT_EDIT_REDO,"Redo contents"));
                break;

            default:
                break;
        }
    }
}
