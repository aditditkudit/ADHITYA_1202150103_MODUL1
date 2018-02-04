package com.example.android.ADHITYA_1202150103_MODUL1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_case);

        Intent intent = getIntent();
        String gMakanan = intent.getStringExtra(MainActivity.MAKANAN_MESSAGE);
        String gPorsi = intent.getStringExtra(MainActivity.PORSI_MESSAGE);
        String gRestoran = intent.getStringExtra(MainActivity.RESTORAN_MESSAGE);

        TextView makanan    =   (TextView) findViewById(R.id.textView_makanan);
        TextView porsi      =   (TextView) findViewById(R.id.textView_jumlahporsi);
        TextView restoran   =   (TextView) findViewById(R.id.textView_restoran);
        TextView harga      =   (TextView) findViewById(R.id.textView_jumlahHarga);

        int duit = 65000;
        int harga_total=0;
        if(gRestoran.equals("Eatbus")){
            harga_total = Integer.parseInt(gPorsi)*50000;
        } else if(gRestoran.equals("Abnormal")){
            harga_total = Integer.parseInt(gPorsi)*30000;
        }

        if(harga_total>duit){
            Toast.makeText(this, "Jangan Makan Disini, GAJI KAMU LANGSUNG HABIS", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Makan Disini saja, Kamu tidak bakal sengsara", Toast.LENGTH_SHORT).show();
        }

        makanan.setText(gMakanan);
        porsi.setText(gPorsi);
        restoran.setText(gRestoran);
        harga.setText(String.valueOf(harga_total));
    }


}
