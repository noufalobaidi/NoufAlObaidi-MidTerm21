package com.example.noufalobaidi_midterm1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Activity3 extends ListActivity {

    String[] items={"item 1","Option 2","item 3","item 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Button bttn1 = (Button) findViewById(R.id.button7);
        Button bttn2 = (Button) findViewById(R.id.button8);


        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_3, R.id.txtViewList, items));

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity3.this,MainActivity.class));
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity3.this,Activity3.class));
            }
        });
    }

    protected void onListItemClick(ListView l, View view, int position, long id ) {
        super.onListItemClick(l, view, position, id);
        switch (position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu/")));
                break;
            case 1:
                startActivity(new Intent(Activity3.this, img.class));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu/")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu/")));
        }

    }

    }
