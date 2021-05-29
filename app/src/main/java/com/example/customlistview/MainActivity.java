package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate: Started");
        ListView mlistView=(ListView) findViewById(R.id.listView);

        Person john=new Person("John","12-20-1998","Male");
        Person steve=new Person("steve","12-20-1998","Male");
        Person stacy=new Person("stacy","12-20-1998","Male");
        Person matt=new Person("matt","12-20-1998","Male");
        Person matt1=new Person("matt1","12-20-1998","Male");
        Person steven=new Person("steven","12-20-1998","Male");
        Person johny=new Person("Johny","12-20-1998","Male");

        ArrayList<Person> peopleList=new ArrayList<>();
        peopleList.add(john);
        peopleList.add(steve);
        peopleList.add(stacy);
        peopleList.add(matt);
        peopleList.add(matt1);
        peopleList.add(steven);
        peopleList.add(johny);

        PersonListAdapter adapter=new PersonListAdapter(this,R.layout.adapter_view_layout,peopleList);
        mlistView.setAdapter(adapter);
    }
}
