package com.example.aiub.listviewcustomadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String [] playerNames;
    private  int pImages[]={R.drawable.musfiq,R.drawable.tamim,R.drawable.masrafi,R.drawable.taskin,
            R.drawable.rubel,R.drawable.mustafiz,R.drawable.imrul};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listViewId);

       playerNames=getResources().getStringArray(R.array.player_name);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String player_list=playerNames[position];
            }
        });
        CustomAdapter adapter=new CustomAdapter(this,playerNames,pImages);
        listView.setAdapter(adapter);


    }

}
