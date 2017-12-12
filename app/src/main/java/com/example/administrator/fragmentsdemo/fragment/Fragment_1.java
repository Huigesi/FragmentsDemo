package com.example.administrator.fragmentsdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.fragmentsdemo.R;

/**
 * Created by Administrator on 2017/12/12.
 */

public class Fragment_1 extends Fragment{
    public Fragment_1() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_1,null);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
