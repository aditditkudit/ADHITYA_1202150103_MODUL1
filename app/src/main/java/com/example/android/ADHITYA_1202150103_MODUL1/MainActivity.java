package com.example.android.ADHITYA_1202150103_MODUL1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MAKANAN_MESSAGE = "com.example.android.ADHITYA_1202150103_MODUL1.makanan.MESSAGE";
    private EditText mMakananEditText;
    public static final String PORSI_MESSAGE = "com.example.android.ADHITYA_1202150103_MODUL1.porsi.MESSAGE";
    private EditText mPorsiEditText;
    public static final String RESTORAN_MESSAGE = "com.example.android.ADHITYA_1202150103_MODUL1.restoran.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMakananEditText    = (EditText) findViewById(R.id.editText_makanan);
        mPorsiEditText      = (EditText) findViewById(R.id.editText_porsi);
    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String messageMakanan   = mMakananEditText.getText().toString();
        String messagePorsi     = mPorsiEditText.getText().toString();
        intent.putExtra(MAKANAN_MESSAGE,messageMakanan);
        intent.putExtra(PORSI_MESSAGE,messagePorsi);
        intent.putExtra(RESTORAN_MESSAGE,"Eatbus");
        if(!messageMakanan.equalsIgnoreCase("Nasi Uduk")|| messagePorsi.equals("")||messageMakanan.isEmpty()){
            Toast peringatan = Toast.makeText(this, "Tidak Boleh Kosong salah Satu Form \n Dan Makanan Harus Nasi Uduk",
                    Toast.LENGTH_LONG);
            peringatan.show();
        } else{
            startActivity(intent);
        }



    }

    public void abnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String messageMakanan   = mMakananEditText.getText().toString();
        String messagePorsi     = mPorsiEditText.getText().toString();
        intent.putExtra(MAKANAN_MESSAGE,messageMakanan);
        intent.putExtra(PORSI_MESSAGE,messagePorsi);
        intent.putExtra(RESTORAN_MESSAGE,"Abnormal");

        if(!messageMakanan.equalsIgnoreCase("Nasi Uduk")|| messagePorsi.equals("")||messageMakanan.isEmpty()){
            Toast peringatan = Toast.makeText(this, "Tidak Boleh Kosong salah Satu Form \n Dan Makanan Harus Nasi Uduk",
                    Toast.LENGTH_LONG);
            peringatan.show();
        } else{
            startActivity(intent);
        }
    }





}
