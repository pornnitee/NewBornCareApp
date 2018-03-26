package com.example.starius.newborncare;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by STARIUS on 3/24/2018.
 */

public class Menu3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);


        String[] str = { "การปฎิบัติตนของมารดาหลังคลอด", "อาการผิดปกติ", "การแจ้งเกิด","การตรวจหลังคลอด" };


        ListView listView1 = (ListView)findViewById(R.id.listview);

        listView1.setAdapter(new ArrayAdapter(this
                , android.R.layout.simple_list_item_1, str));

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0
                    , View arg1, int arg2, long arg3) {
                Intent intent;
                switch(arg2) {
                    case 0 :
                        intent = new Intent(getApplicationContext()
                                , detailMenu3_1.class);
                        startActivity(intent);
                        break;
                    case 1 :
                        intent = new Intent(getApplicationContext()
                                , detailMenu3_2.class);
                        startActivity(intent);
                        break;
                    case 2 :
                        intent = new Intent(getApplicationContext()
                                , detailMenu3_3.class);
                        startActivity(intent);
                        break;
                    case 3 :
                        intent = new Intent(getApplicationContext()
                                , detailMenu3_4.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
