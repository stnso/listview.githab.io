package com.example.goodlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] strings = {
            "ﾐｷ自走用",
            "ﾐｷ自走用低床",
            "ﾐｷ介助用",
            "ｶﾜﾑﾗ自走",
            "ｶﾜﾑﾗ自走",

            "電動昇降椅子ﾘｯｸﾙ",
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                strings);
        ((ListView) findViewById(R.id.listView)).setAdapter(adapter);

    }
