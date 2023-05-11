package sg.edu.rp.c346.id22023219.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);

        //
        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Hour = tp.getHour();
                String Mins = "";
                if (tp.getMinute() < 10){
                    Mins = "0" + tp.getMinute();
                }
                else{
                    Mins = "" + tp.getMinute();
                }
                String stringResponse = "Time is " + Hour + ":" + Mins;
                tvDisplay.setText(stringResponse);
            }
        });
        //Here is the date Display
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int Year = dp.getYear();
            int Month = dp.getMonth();
            int Day = dp.getDayOfMonth();
            String stringResponse = "Date is " + Day + "/" + Month + "/" + Year;
            tvDisplay.setText(stringResponse);

            }
        });

    }
}