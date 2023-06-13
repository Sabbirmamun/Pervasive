package com.example.basicpervasive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    Button firstfragment,secondfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        firstfragment = (Button) findViewById(R.id.btnfr1);
        secondfragment = (Button) findViewById(R.id.btnfr2);

        firstfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replace(new Fragment1());

            }

        });

        secondfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replace(new Fragment2());

            }
        });
    }

    private void replace(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameid,fragment);
        fragmentTransaction.commit();

    }
}
