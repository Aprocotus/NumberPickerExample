package com.aprocotus.example.www.numberpickerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//These are the widgets used in this example
import android.widget.Toast;

//This is the main widget focused in this example
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Here we define ns(number select) and find the NumberPicker id
        //which is defined as Number_Wheel
        //You can change the id name to whatever you wish
        NumberPicker ns = findViewById(R.id.Number_Wheel);

        //This will set the values on the NumberPicker
        //This example uses 0 to 50
        ns.setMinValue(0);
        ns.setMaxValue(50);

        //This will call the code below when selecting a number
        //This also occurs when the number changes
        ns.setOnValueChangedListener(onValueChangeListener);
    }

    //This will find the widget device being the NumberPicker
    NumberPicker.OnValueChangeListener onValueChangeListener =
        new NumberPicker.OnValueChangeListener(){
            @Override
            //This will occur when selecting a number i.e. 12
            public void onValueChange(NumberPicker ns, int i, int j){
                Toast.makeText(MainActivity.this, "Number selected: "+ ns.getValue(), Toast.LENGTH_SHORT).show();
                //Using 12 for an example, a Toast message will appear when selecting a number
                //When a number is selected it will say "Number selected: 12"
                //The ns.getValue retrieves the current number from the number picker
                //This is very basic so it will show each number individually
                //every time you go through a number
        }
    };
}
