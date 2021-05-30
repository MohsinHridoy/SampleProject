package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    TextView textview2;
    TextView textview3;
    TextView textview4;
    TextView textview5;
    TextView textview6;
    TextView textview7;
    TextView textview8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {       ///here onCreate is override because it has same parameter
        super.onCreate(savedInstanceState);    ////here super used for invoke parent class FragmentActivity.java onCreate method
        setContentView(R.layout.activity_main);

        Polymorphism();
        Encapsulation();
        Inheritance();
        Interface();


    }

    private void Interface(){
        textview8=findViewById(R.id.tvEight);
        class Sample implements InterfaceExample{
            @Override
            public String run() {
                return "Run Fast";
            }
        }

       Sample sample=new Sample();

        textview8.setText(sample.run());



        class abstractSample extends AbstractClassExample{      ///Abstraction
            @Override
            public String Run() {
                return "runn";
            }
        }
    }

    private void Inheritance(){

        textview6 = findViewById(R.id.tvSix);
        textview7 = findViewById(R.id.tvSeven);


        NewProgrammer newProgrammer=new NewProgrammer();
        newProgrammer.advice();
        newProgrammer.code();  //Here NewProgrammer class inherit Programmer class

        textview6.setText(newProgrammer.advice());
        textview7.setText(newProgrammer.code());




    }

    private void Encapsulation() {
        textview5 = findViewById(R.id.tvFive);


        Micheal mi = new Micheal("ss", 12, new Transport("Toyota", "bmw", "jeep"));


        textview5.setText(mi.getTransport().getBmw());  //Encapsulation -private value we can get by public get method
    }

    private void Polymorphism() {
        textview = findViewById(R.id.tvOne);
        textview2 = findViewById(R.id.tvTwo);
        textview3 = findViewById(R.id.tvThree);
        textview4 = findViewById(R.id.tvFour);

        JavaProgrammer javaProgrammer = new JavaProgrammer();    ///javaProgrammer is an object

        textview.setText(Integer.toString(Addition.add(1, 2)));///Polymorphism -method overloading

        textview2.setText(Integer.toString(Addition.add(1, 2, 3)));///Polymorphism -method overloading
        textview3.setText(Addition.add("sample"));///Polymorphism -method overloading

        textview4.setText(javaProgrammer.code());  //Polymorphism -method overriding
    }


    public class Programmer {
        public String code() {
            return "Coding in Kotin";
        }
    }

    public class JavaProgrammer extends Programmer {
        @Override
        public String code() {
            return "Coding in Java";
        }    ///method-overriding
    }



    public class NewProgrammer extends Programmer{      ///Inheritance
        public String advice()
        {
            return " study more and more code";
        }
    }


}