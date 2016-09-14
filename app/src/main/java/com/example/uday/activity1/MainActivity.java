package com.example.uday.activity1;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


import com.example.uday.activity1.Fragments.Fragment1;
import com.example.uday.activity1.Fragments.Fragment2;

/**
 * Created by uday on 7/27/2016.
 */
public class MainActivity extends AppCompatActivity {
    private Button B1, B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);



        B1.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                FragmentManager F = getSupportFragmentManager();
                FragmentTransaction T = F.beginTransaction();
                Fragment1 a= new Fragment1();
                T.replace(R.id.RL, a);
                T.commit();

            }
        });
        B2.setOnClickListener(new View.OnClickListener() {

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                FragmentManager F = getSupportFragmentManager();
                FragmentTransaction T = F.beginTransaction();
                Fragment2 a= new Fragment2();
                T.replace(R.id.RL, a);
                T.commit();



            }
        });
    }



}


