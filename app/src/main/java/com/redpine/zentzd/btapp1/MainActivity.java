package com.redpine.zentzd.btapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import java.util.*;
import java.util.ArrayList;
import android.view.View;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> text_opts = new ArrayList<>(Arrays.asList("Let's", "Go", "Pats!!"));
    private int cur_idx = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onActivateButtonClick(View view) {
        //Button activateButton = (Button) findViewById(R.id.button);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText((CharSequence) text_opts.get(cur_idx));
        cur_idx = ++cur_idx % text_opts.size();
    }
}
