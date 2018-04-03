package com.example.kaushal.spinner;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create a spinner
        final Spinner mSpinner=findViewById(R.id.mSpinner);
        //create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,
                R.array.Avengers,android.R.layout.simple_spinner_item);
        //specify the layout to use when list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        //Apply the adapter to the spinner
        mSpinner.setAdapter(adapter);
        //add click listener
        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              String x=mSpinner.getSelectedItem().toString();
                Toast t=Toast.makeText(MainActivity.this,x,Toast.LENGTH_SHORT);
                t.show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
