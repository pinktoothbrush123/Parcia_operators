package mcm.edu.ph.parcia_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView display;
        display = findViewById(R.id.displayTxt);

        int birthYears =2003;
        int birthMonth =2;
        int birthday =13;

        int currentYear =2021;
        int currentMonth =1;
        int currentDay =26;

        int ageInYears,ageInMonths,ageInDays;

        if(birthMonth > currentMonth){
                currentMonth +=12;
                currentYear -= 1;
        }
        if(birthday > currentDay){
            currentDay +=30;
            currentMonth -= 1;
        }

        ageInYears = currentYear - birthYears;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthday;

        display.setText("My precise age is \n"+
                String.valueOf(ageInYears)+
                " Years \n"+
                String.valueOf(ageInMonths)+
                " Months \n"+
                String.valueOf(ageInDays)+
                " Days ");

    }
}