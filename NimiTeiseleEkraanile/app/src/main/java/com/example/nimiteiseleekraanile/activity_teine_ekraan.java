package com.example.nimiteiseleekraanile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_teine_ekraan extends AppCompatActivity {
    private TextView name;
    private TextView lastname;
    private TextView age;
    private TextView phone_number;
    private TextView city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teine_ekraan);
        name=(TextView) findViewById(R.id.nametxt);
        lastname=(TextView) findViewById(R.id.lastnametxt);
        age=(TextView) findViewById(R.id.agetxt);
        phone_number=(TextView) findViewById(R.id.phone_numbertxt);
        city=(TextView) findViewById(R.id.citytxt);
        //принимаем имя
        String txtName=getIntent().getStringExtra("name");
        //принимаем perekonnanimi
        String txtLastname=getIntent().getStringExtra("lastname");
        //принимаем age
        String txtAge=getIntent().getStringExtra("age");
        //принимаем phone_number
        String txtPhone_number=getIntent().getStringExtra("phone_number");
        //принимаем city
        String txtCity=getIntent().getStringExtra("city");
        //Показываем полученные значения в наши вьюшки TextView
        name.setText(name.getText().toString()+" "+txtName);
        lastname.setText(lastname.getText().toString()+" "+txtLastname);
        age.setText(age.getText().toString()+" "+txtAge);
        phone_number.setText(phone_number.getText().toString()+" "+txtPhone_number);
        city.setText(city.getText().toString()+" "+txtCity);
    }
    public void back(View v){
        switch (v.getId()){
            case R.id.back_button:
                Intent intent =new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}