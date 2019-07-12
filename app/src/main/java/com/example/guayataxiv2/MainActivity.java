package com.example.guayataxiv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.guayataxiv2.guayataxi.Billetera;
import com.example.guayataxiv2.guayataxi.Cliente;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Billetera billeteraLuis = new Billetera(1);
        Cliente Luis = new Cliente("Luis Zuniga", "123456789", billeteraLuis);
    }
}
