package com.example.simpleproject.datastructure.stack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.simpleproject.R;
import com.example.simpleproject.datastructure.Vector.VectorActivity;
import com.example.simpleproject.linklist.LinkListActivity;

import java.util.Stack;

public class StackActivity extends AppCompatActivity implements View.OnClickListener{
    EditText name;
    Button push,pop,nextActivity;
    ListView listView;
    ArrayAdapter arrayAdapter;

    Stack<String> stack;

    CustomStack<String> customStack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        name = findViewById(R.id.name);
        push = findViewById(R.id.save);
        pop=findViewById(R.id.addLast);
        nextActivity=findViewById(R.id.button11);

        listView = findViewById(R.id.listView);
        stack=new Stack<>();
        customStack=new CustomStack();


        push.setOnClickListener(this);
        pop.setOnClickListener(this);

        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(StackActivity.this, LinkListActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {

        Button button= (Button) view;

        switch(button.getId()){
            case R.id.save:
                String value=name.getText().toString() ;
                name.setText("");


                stack.push(value);
                arrayAdapter = new ArrayAdapter(StackActivity.this, android.R.layout.simple_list_item_1, stack);
                listView.setAdapter(arrayAdapter);
                break;

            case R.id.addLast:



                stack.pop();
                arrayAdapter = new ArrayAdapter(StackActivity.this, android.R.layout.simple_list_item_1, stack);
                listView.setAdapter(arrayAdapter);
                break;



        }

    }
}