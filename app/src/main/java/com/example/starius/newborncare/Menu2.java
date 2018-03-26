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

public class Menu2 extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);


        String[] str = { "เมื่อแม่ไปทำงาน.. จะให้นมลูกได้อย่างไร?", "การป้อนนมลูกด้วยถ้วย", "วิธีป้อนนมจากถ้วย" };


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
                                , detailMenu2_1.class);
                        startActivity(intent);
                        break;
                    case 1 :
                        intent = new Intent(getApplicationContext()
                                , detailMenu2_2.class);
                        startActivity(intent);
                        break;
                    case 2 :
                        intent = new Intent(getApplicationContext()
                                , detailMenu2_3.class);
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
