package com.example.administrator.fragmentsdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.fragmentsdemo.R;

/**
 * Created by Administrator on 2017/12/12.
 */

public class Fragment_1 extends Fragment {
    public Fragment_1() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_1,null);
        Button button=(Button)view.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"fragment_1",Toast.LENGTH_SHORT).show();
            }
        });
        //return inflater.inflate(R.layout.fragment_1, container, false);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
