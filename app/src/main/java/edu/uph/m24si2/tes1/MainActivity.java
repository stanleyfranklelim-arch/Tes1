package edu.uph.m24si2.tes1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnProfil, btnPasien, btnDokter, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProfil = findViewById(R.id.btnProfil);
        btnPasien = findViewById(R.id.btnPasien);
        btnDokter = findViewById(R.id.btnDokter);
        btnLogout = findViewById(R.id.btnLogout);

        View.OnClickListener pindah = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        HalamanDuaActivity.class);
                startActivity(intent);
            }
        };

        btnProfil.setOnClickListener(pindah);
        btnPasien.setOnClickListener(pindah);
        btnDokter.setOnClickListener(pindah);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}