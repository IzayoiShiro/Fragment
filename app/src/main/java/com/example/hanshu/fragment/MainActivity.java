package com.example.hanshu.fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button left, right, middle;
    FragmentManager fm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        left = (Button) findViewById(R.id.left);
        middle = (Button) findViewById(R.id.b_middle);
        right = (Button) findViewById(R.id.right);


        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_Fragment b_fragment = new B_Fragment();
                fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.add(R.id.fragment, b_fragment);
                fragmentTransaction.commit();
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_Fragment2 b_fragment2 = new B_Fragment2();
                fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.add(R.id.fragment, b_fragment2);
                fragmentTransaction.commit();

            }
        });
        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_Fragment1 b_fragment1 = new B_Fragment1();
                fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.add(R.id.fragment, b_fragment1);
                fragmentTransaction.commit();
            }
        });

    }
}
