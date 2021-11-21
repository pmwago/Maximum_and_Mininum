package com.example.cat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText num1,num2,num3,answ;
private Button max,min;
int minimum,maximum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //a) binding of all widgets
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        answ=findViewById(R.id.answ);
        max=findViewById(R.id.max);
        min=findViewById(R.id.min);

//        e) objects for the class Student which are used to populate sample values for the EditTexts
//        Student student1=new Student("peter","male",1424);
//        Student student2=new Student("mwago","male",1444);
//        Student student3=new Student("francis","male",1404);
//
//        num1.setText(String.valueOf(student1.getIdNo()));
//        num2.setText(String.valueOf(student2.getIdNo()));
//        num3.setText(String.valueOf(student3.getIdNo()));

        max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               answ.setText(String.valueOf(calculateMax(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()),Integer.parseInt(num3.getText().toString()))));
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answ.setText(String.valueOf(calculateMin(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()),Integer.parseInt(num3.getText().toString()))));
            }
        });
    }
    //b) a method that receives three values as parameters and calculates the minimum of the three values
    public int calculateMin(int x,int y,int z){
        minimum=Math.min(x,Math.min(y,z));
        return minimum;
    }
    public int calculateMax(int x,int y,int z){
        maximum=Math.max(x,Math.max(y,z));
        return maximum;
    }
}
//c)Intent intent=new Intent(getApplicationContext,secondActivity.class);
// startActivity(intent);