package com.example.noufalobaidi_midterm1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class Activity2 extends AppCompatActivity {
    String strgName;
    int birthDate;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button bttndate = (Button) findViewById(R.id.button3);
        Button bttn1 = (Button) findViewById(R.id.button4);
        Button bttn2 = (Button) findViewById(R.id.button5);
        Button bttndone = (Button) findViewById(R.id.button6);
        TextView rslt = (TextView) findViewById(R.id.textView4);


        EditText name = (EditText) findViewById(R.id.editTextTextPersonName);

        RadioButton radButtonMale = (RadioButton) findViewById(R.id.radioButton);
        RadioButton radButtonFemale = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton radButtonStudent = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton radButtonInstructor = (RadioButton) findViewById(R.id.radioButton4);

        bttndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(Activity2.this, d, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        bttndone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strgName=name.getText().toString();


                if(radButtonFemale.isChecked())
                    gender="Mrs.";
                else if (radButtonMale.isChecked())
                    gender="Mr.";

                birthDate= fmtDate.format(c.getTime().toString());

                Calendar c = Calendar.getInstance();
                DateFormat fmtDate = DateFormat.getDateInstance();
                DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        c.set(Calendar.YEAR, year);
                        c.set(Calendar.MONTH, month);
                        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                        rslt.setText("Your reservation is: " + fmtDate.format(c.getTime().toString()));


                rslt.setText("Hi "+gender+" "+strgName+" you are "+birthDate+" years old");

                    }
                };
            }
        });
        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this,MainActivity.class));
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this,Activity3.class));
            }
        });



    }
}