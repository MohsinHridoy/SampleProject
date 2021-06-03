package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.simpleproject.datastructure.Queue.QueueActivity;
import com.example.simpleproject.datastructure.Vector.VectorActivity;

import java.io.File;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    TextView textview2;
    TextView textview3;
    TextView textview4;
    TextView textview5;
    TextView textview6;
    TextView textview7;
    TextView textview8;
    TextView textview9;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {       ///here onCreate is override because it has same parameter
        super.onCreate(savedInstanceState);    ////here super used for invoke parent class FragmentActivity.java onCreate method
        setContentView(R.layout.activity_main);

        Polymorphism();
        Encapsulation();
        Inheritance();
        Interface();
         //exception();

        button=findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, QueueActivity.class);
                startActivity(intent);
            }
        });



    }


    class testThread extends Thread{
        public void run(){
            for(int i=1;i<5;i++){
                try{Thread.sleep(1000);}  //here sleep for five seconds

                catch(Exception e){

                    System.out.println(e);
                }
                System.out.println(i);
            }
        }
    }
    private void exception() {
        textview9=findViewById(R.id.tvNine);

        //Runtime Arithmatic exception

        try {
            int data1 = 50 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        //Runtime ArrayIndexOutOfBoundException


        try {
            int array[] = {1, 3, 5, 7};

            textview9.setText(array[9]);            ////arr[9] is not possible because arr

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }


        ///Null Pointer Exception


        try {
            Object obj=null;
            obj.toString();

        }catch(NullPointerException e)
        {
           e.printStackTrace();
        }

    }

    private void JavaIo() {

        try {
            File myObj = new File("file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //  textview9.setText(data);
            }
            myReader.close();

        } catch (Exception e)  ///here Exception parent class we can use IOExcetion
        {
            e.printStackTrace();
        }
    }

    private void Interface() {
        textview8 = findViewById(R.id.tvEight);
        class Sample implements InterfaceExample {
            @Override
            public String run() {
                return "Run Fast";
            }
        }

        Sample sample = new Sample();

        textview8.setText(sample.run());


        class abstractSample extends AbstractClassExample {      ///Abstraction
            @Override
            public String Run() {
                return "runn";
            }
        }
    }

    private void Inheritance() {

        textview6 = findViewById(R.id.tvSix);
        textview7 = findViewById(R.id.tvSeven);


        NewProgrammer newProgrammer = new NewProgrammer();
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


    public class NewProgrammer extends Programmer {      ///Inheritance
        public String advice() {
            return " study more and more code";
        }
    }


}