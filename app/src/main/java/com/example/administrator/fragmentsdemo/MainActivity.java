package com.example.administrator.fragmentsdemo;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.fragmentsdemo.fragment.Fragment_1;
import com.example.administrator.fragmentsdemo.fragment.Fragment_2;
import com.example.administrator.fragmentsdemo.fragment.Fragment_3;
import com.example.administrator.fragmentsdemo.fragment.Fragment_4;
import com.example.administrator.fragmentsdemo.fragment.Fragment_5;


public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();

        //_____-----fragment_remove
        /*button_remove=(Button)findViewById(R.id.btn_remove);
        button_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager=getFragmentManager();
                fragmentTransaction=fragmentManager.beginTransaction();
                //Fragment_1 fragment_1=new Fragment_1();
                fragment=fragmentManager.findFragmentById(R.id.fragment_1);
                String tag = null;
                fragmentTransaction.addToBackStack(tag);
                fragmentTransaction.remove(fragment);
                fragmentTransaction.commit();
            }
        });*/
    }

    private void setListener() {
        fragmentManager=getFragmentManager();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //_____-----fragment_add
               /* Fragment_1 fragment_1=new Fragment_1();
                fragmentTransaction.add(R.id.right,fragment_1);
                fragmentTransaction.commit();*/
                Fragment_1 fragment_1=new Fragment_1();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.right,fragment_1,"fragment_1");
                fragmentTransaction.addToBackStack("fragment_1");//添加到回退栈
                fragmentTransaction.commit();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_2 fragment_2=new Fragment_2();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.right,fragment_2,"fragment_2");
                fragmentTransaction.addToBackStack("fragment_2");//添加到回退栈
                fragmentTransaction.commit();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_3 fragment_3=new Fragment_3();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.right,fragment_3,"fragment_3");
                fragmentTransaction.addToBackStack("fragment_3");
                fragmentTransaction.commit();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_4 fragment_4=new Fragment_4();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.right,fragment_4,"fragment_4");
                fragmentTransaction.addToBackStack("fragment_4");
                fragmentTransaction.commit();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_5 fragment_5=new Fragment_5();
                fragmentTransaction=fragmentManager.beginTransaction();//每点一次就要实例化一次
                fragmentTransaction.replace(R.id.right,fragment_5,"fragment_5");
                fragmentTransaction.addToBackStack("fragment_5");
                fragmentTransaction.commit();//不然commit的东西会重复

            }
        });

    }

    private void initView() {
        button1=(Button)findViewById(R.id.btn_show1);
        button2=(Button)findViewById(R.id.btn_show2);
        button3=(Button)findViewById(R.id.btn_show3);
        button4=(Button)findViewById(R.id.btn_show4);
        button5=(Button)findViewById(R.id.btn_show5);
    }
}
