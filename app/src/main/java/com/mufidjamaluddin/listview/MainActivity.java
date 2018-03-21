package com.mufidjamaluddin.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{

    private ListView listView;
    private final String[] values = new String[]{"Candi Cangkuang", "Situ Bagendit", "Talagabodaas", "Cipanas", "Darajat"};
    private final String desc = "merupakan tempat wisata di kabupaten Garut, yang buka setiap hari";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.main_list_view);

        AdapterTempatWisata adapterTempatWisata = new AdapterTempatWisata(MainActivity.this, R.layout.list_view);

        listView.setAdapter(adapterTempatWisata);

        for(String val : values)
        {
            TempatWisata tempatWisata = new TempatWisata(val, val+this.desc);
            adapterTempatWisata.add(tempatWisata);
        }


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                startActivity(intent);

            }
        });


    }

}