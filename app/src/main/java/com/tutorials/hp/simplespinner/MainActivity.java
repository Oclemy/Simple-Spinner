package com.tutorials.hp.simplespinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> languages=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SPINNER
        Spinner sp= (Spinner) findViewById(R.id.sp);

        //FILL DATA
        fillData();

        //ADAPTR
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,languages);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, languages.get(i), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    //FILL DATA
    private void fillData()
    {
        languages.clear();

        //FILL
        languages.add("Java");
        languages.add("C#");
        languages.add("VB.NET");
        languages.add("PHP");
        languages.add("Python");
        languages.add("Ruby");
        languages.add("C");
        languages.add("C++");
        languages.add("Fortran");
        languages.add("Cobol");
        languages.add("Perl");
        languages.add("Prolog");
    }
}
