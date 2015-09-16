package com.example.m6.listviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods={"Bacon","Ham","Tuna","Candy","MeatBall","Potato"};
        // now me uda ewa list items bawata convert karanna oni
        //ekata neeed Adapter (to convert Text String --> List Items)
        ListAdapter ishkAdapter = new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1,foods);
        ListView ishkListView = (ListView)findViewById(R.id.ishkListView);
        ishkListView.setAdapter(ishkAdapter);

        ishkListView.setOnItemClickListener(
          new AdapterView.OnItemClickListener(){
                @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                    String food= String.valueOf(parent.getItemAtPosition(position));
                    Toast.makeText(MainActivity.this,food,Toast.LENGTH_LONG).show();
                }
          }

        );

    }

}
