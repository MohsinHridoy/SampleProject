package com.example.simpleproject.datastructure.Vector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.simpleproject.R;
import com.example.simpleproject.datastructure.Queue.QueueActivity;
import com.example.simpleproject.datastructure.stack.StackActivity;

import java.util.List;
import java.util.Vector;

public class VectorActivity extends AppCompatActivity {

    EditText name,name2;
    Button enqueue,dequeue,nextActivity,specifiedadd;
    ListView listView;
    ArrayAdapter arrayAdapter;
    Vector<String> vector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector);


        name = findViewById(R.id.name);
        name2=findViewById(R.id.name2);
        enqueue = findViewById(R.id.save);
        dequeue=findViewById(R.id.addLast);
        specifiedadd=findViewById(R.id.addLast2);
        nextActivity=findViewById(R.id.button1);

        listView = findViewById(R.id.listView);
        vector=new Vector<>();

        enqueue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=name.getText().toString() ;
                name.setText("");


                vector.add(value);
                arrayAdapter = new ArrayAdapter(VectorActivity.this, android.R.layout.simple_list_item_1, (List) vector);
                listView.setAdapter(arrayAdapter);
            }
        });

        dequeue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vector.removeAll(vector);
                arrayAdapter = new ArrayAdapter(VectorActivity.this, android.R.layout.simple_list_item_1, (List) vector);
                listView.setAdapter(arrayAdapter);


            }
        });

        specifiedadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value=name.getText().toString() ;
                name.setText("");

                String value2=name2.getText().toString();
                name2.setText("");

                vector.insertElementAt(value, Integer.parseInt(value2));
                arrayAdapter = new ArrayAdapter(VectorActivity.this, android.R.layout.simple_list_item_1, (List) vector);
                listView.setAdapter(arrayAdapter);


            }
        });

        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VectorActivity.this, StackActivity.class);
                startActivity(intent);
            }
        });
    }
}