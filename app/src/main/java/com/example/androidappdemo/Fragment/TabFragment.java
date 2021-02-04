package com.example.androidappdemo.Fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.androidappdemo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TabFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabFragment extends Fragment {

    private static final int SWITCH_MESSAGE  = 0;
    private static final int SWITCH_CONTACT  = 1;
    private static final int SWITCH_DISCOVER = 2;
    private static final int SWITCH_SETTINGS = 3;

    private ImageButton mMsgBtn;
    private ImageButton mConBtn;
    private ImageButton mDisBtn;
    private ImageButton mSetBtn;

    private OnTabFragmentListener mListener;
    private Activity mActivity;

    View mView;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TabFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TabFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TabFragment newInstance(String param1, String param2) {
        TabFragment fragment = new TabFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnTabFragmentListener) {
            mListener = (OnTabFragmentListener) context;
            mActivity = (Activity) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnTabFragmentListener");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_tab, container, false);
        mMsgBtn = (ImageButton) mView.findViewById(R.id.id_message_btn);
        mConBtn = (ImageButton) mView.findViewById(R.id.id_contact_btn);
        mDisBtn = (ImageButton) mView.findViewById(R.id.id_discover_btn);
        mSetBtn = (ImageButton) mView.findViewById(R.id.id_settings_btn);
        mMsgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onTabSwitch(SWITCH_MESSAGE);
            }
        });
        mConBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onTabSwitch(SWITCH_CONTACT);
            }
        });
        mDisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onTabSwitch(SWITCH_DISCOVER);
            }
        });
        mSetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onTabSwitch(SWITCH_SETTINGS);
            }
        });
        return mView;
    }

    public interface OnTabFragmentListener {
        void onTabSwitch(int tab);
    }

}