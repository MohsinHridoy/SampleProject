package com.example.simpleproject.datastructure.Queue;

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
import com.example.simpleproject.datastructure.stack.StackActivity;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueActivity extends AppCompatActivity {

    EditText name;
    Button enqueue,dequeue,nextActivity;
    ListView listView;
    ArrayAdapter arrayAdapter;
    Queue<String> queue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

        name = findViewById(R.id.name);
        enqueue = findViewById(R.id.save);
        dequeue=findViewById(R.id.addLast);
        nextActivity=findViewById(R.id.button1);
        listView = findViewById(R.id.listView);

        queue= new LinkedList<>() ;

        enqueue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=name.getText().toString() ;
                name.setText("");

                queue.offer(value);
                arrayAdapter = new ArrayAdapter(QueueActivity.this, android.R.layout.simple_list_item_1, (List) queue);
                listView.setAdapter(arrayAdapter);
            }
        });

        dequeue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                queue.poll();
                arrayAdapter = new ArrayAdapter(QueueActivity.this, android.R.layout.simple_list_item_1, (List) queue);
                listView.setAdapter(arrayAdapter);


            }
        });
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(QueueActivity.this, VectorActivity.class);
                startActivity(intent);
            }
        });

    }

}