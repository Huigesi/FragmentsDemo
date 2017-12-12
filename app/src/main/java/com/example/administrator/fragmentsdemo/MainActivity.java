package com.example.administrator.fragmentsdemo;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.fragmentsdemo.fragment.Fragment_1;

public class MainActivity extends AppCompatActivity {
    private Button button_add,button_remove;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //_____-----fragment_add
        button_add=(Button)findViewById(R.id.btn_show);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager=getFragmentManager();
                fragmentTransaction=fragmentManager.beginTransaction();
                Fragment_1 fragment_1=new Fragment_1();
                fragmentTransaction.add(R.id.right,fragment_1);
                fragmentTransaction.commit();
            }
        });
        //_____-----fragment_remove




    }
}
