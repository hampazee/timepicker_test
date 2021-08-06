package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DateFormat;
import java.util.Locale;
import java.util.zip.DataFormatException;

public class MainActivity extends AppCompatActivity {

    int hour,minute,hour1,minute1;
    Button timepickbutton01,timepickbutton02;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timepickbutton01 = findViewById(R.id.select_begin_time01);
        timepickbutton02 = findViewById(R.id.select_begin_time02);
//        textView = (TextView) findViewById(R.id.time_layout);

    }


    public void picktime(View view) {
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selecthour, int selectminute) {
                hour = selecthour;
                minute = selectminute;
                timepickbutton01.setText(String.format(Locale.getDefault(),"%02d : %02d",hour,minute));
            }
        };
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,onTimeSetListener,hour,minute,true);

        timePickerDialog.setTitle("select time");
        timePickerDialog.show();
    }

    public void picktime01(View view) {
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selecthour, int selectminute) {
                hour1 = selecthour;
                minute1 = selectminute;
                timepickbutton02.setText(String.format(Locale.getDefault(),"%02d : %02d",hour1,minute1));

            }
        };
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,onTimeSetListener,hour1,minute1,true);

        timePickerDialog.setTitle("select time");
        timePickerDialog.show();

    }


}
