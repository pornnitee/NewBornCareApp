package com.example.starius.newborncare;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by STARIUS on 3/24/2018.
 */

public class detailMenu1_4 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailmenu1_4);
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
