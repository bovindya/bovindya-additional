package com.example.mad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {



    EditText txtName,txtPrice,txtSize,txtComposition;
    Button save,update,delete,view;

    Item obIte;
    DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName=findViewById(R.id.txtName);
        txtPrice=findViewById(R.id.txtPrice);
        txtSize=findViewById(R.id.txtSize);
        txtComposition=findViewById(R.id.txtComposition);

        save=findViewById(R.id.save);
        //update=findViewById(R.Id.update);
       // delete=findViewById(R.Id.delete);
       // view=findViewById(R.Id.view);

        obIte= new Item();

    }

    public void update(View view) {
    }

    public void save(View view) {
        db= FirebaseDatabase.getInstance().getReference().child("Item");

        try{
            if(TextUtils.isEmpty(txtName.getText().toString().trim())){
                Toast.makeText(getApplicationContext(),"Please enter the name",Toast.LENGTH_LONG).show();
            }else if(TextUtils.isEmpty(txtPrice.getText().toString().trim())){
                Toast.makeText(getApplicationContext(),"Please enter the price",Toast.LENGTH_LONG).show();
            }else if(TextUtils.isEmpty(txtSize.getText().toString().trim())){
                Toast.makeText(getApplicationContext(),"Please enter the size",Toast.LENGTH_LONG).show();
            }else if(TextUtils.isEmpty(txtComposition.getText().toString().trim())){
                Toast.makeText(getApplicationContext(),"Please enter the composition",Toast.LENGTH_LONG).show();
            }else{
                obIte.setName(txtName.getText().toString().trim());
                obIte.setPrice(txtPrice.getText().toString().trim());
                obIte.setSize(txtSize.getText().toString().trim());
                obIte.setComposition(txtComposition.getText().toString().trim());

                db.push().setValue(obIte);
                Toast.makeText(getApplicationContext(),"suceessful insert",Toast.LENGTH_LONG).show();
            }


        }catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Number Format Exception", Toast.LENGTH_LONG).show();
        }
    }

    public void delete(View view) {
    }

    public void view(View view) {
    }

    private class Id {
    }
}