package com.example.administrator.fragmentsdemo.fragment;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.fragmentsdemo.R;

public class Fragment_3 extends Fragment {
    public Fragment_3() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_3,null);
        Button button=(Button)view.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"文件管理",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
