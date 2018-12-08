# NumberPickerExample

This is a very basic example on using NumberPicker.

# Introduction

NumberPicker is a widget option in Android studio that allows the user to select a number with a defined range. The widget has two flavours which depends on the theme that is presented to the user. R.style.theme or R.style.theme_holo and theme_holo_light. The difference is the way each theme handles the changes in the number selection. For theme_holo (theme_holo_light is the basically the same format as theme_holo), when a user flings on the picker up or down, this allows for multiple increments or decrements. Tapping to increase of decrease is the other special feature for this theme. For R.style.theme, long button presses will change the number value quickly. The only thing in common is that the user can tap on the number and input a number that is within the set range such as 1 to 10. 

# History

This widget was added to android studio at API level 11. The library path is as follows: 
java.lang.Object/android.view.View/android.view.ViewGroup/android.widget.LinearLayout/android.widget.NumberPicker

# Major Methods
NumberPickers can be used in the **XML** files and **Java** code. 
For **XML**

```XML
<NumberPicker
android:id="@+id/numberPicker" 
android:layout_width="wrap_content"   
android:layout_height="wrap_content"/>
```

For **Java**

```Java
NumberPicker(Context context);
```

These are basic methods to get NumberPicker for the app

To setup the NumberPicker, define it in your main activity:

```Java
NumberPicker example = findViewById(R.id.youridforNumberPicker);
```

To make a defined range for the number picker, use the following code in Java:

```Java
example.getMinValue(); //Default is 0
example.getMaxValue(); //Default is 100
```

To retrieve it from **XML** do the following:
Insert this method into your activity...

```Java
private void processAttributeSet(AttributeSet attrs) {
        this.setMinValue(attrs.getAttributeIntValue(null, "min", 0));
        this.setMaxValue(attrs.getAttributeIntValue(null, "max", 0));
    }
 ```
 
 This will allow you to call max and min from **XML**
 
```XML
<!--Be sure to add this under NumberPicker in the XML file-->
max = "75"
min = "1"
```

# Example Code

The code provided used the following methods:

`
<NumberPicker
android:id="@+id/numberPicker" 
android:layout_width="wrap_content"   
android:layout_height="wrap_content"/>
`

- This method was used since it was the most basic way to call up the Number Picker into the application.
- The code shows an expand version of the **XML**

`NumberPicker ns = findViewById(R.id.Number_Wheel);`
- This method helped define and find the NumberPicker in the **XML** file to refernce it in the **Java** code

`ns.getMinValue(0);  ns.getMaxValue(50);`
- This method is used to tell the NumberPicker that 0 is the min and 50 is the max

# API Reference
[Use this link for more information](https://developer.android.com/reference/android/widget/NumberPicker#onDraw(android.graphics.Canvas))
