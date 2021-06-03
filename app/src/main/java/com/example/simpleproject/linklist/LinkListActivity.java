package com.example.simpleproject.linklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.simpleproject.MainActivity;
import com.example.simpleproject.R;
import com.example.simpleproject.datastructure.stack.StackActivity;

import java.util.LinkedList;

public class LinkListActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name;
    Button save,addLast,nextActivity;
    ListView listView;
    ArrayAdapter arrayAdapter;
    LinkedList<String> model;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_list);

        name = findViewById(R.id.name);
        save = findViewById(R.id.save);
        addLast=findViewById(R.id.addLast);
        nextActivity=findViewById(R.id.button12);
        listView = findViewById(R.id.listView);


        model = new LinkedList<String>();
        save.setOnClickListener(this);
        addLast.setOnClickListener(this);

        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LinkListActivity.this, MainActivity.class);
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


                model.add(value);
                arrayAdapter = new ArrayAdapter(LinkListActivity.this, android.R.layout.simple_list_item_1, model);
                listView.setAdapter(arrayAdapter);
                break;

            case R.id.addLast:
                String value1=name.getText().toString() ;


                model.addFirst(value1);
                arrayAdapter = new ArrayAdapter(LinkListActivity.this, android.R.layout.simple_list_item_1, model);
                listView.setAdapter(arrayAdapter);
                break;


        }
        }

    }
