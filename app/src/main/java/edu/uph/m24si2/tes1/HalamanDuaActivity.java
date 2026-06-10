package edu.uph.m24si2.tes1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HalamanDuaActivity extends AppCompatActivity {

    EditText etNama, etNim;
    Button btnSimpan;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_dua);

        etNama = findViewById(R.id.etNama);
        etNim = findViewById(R.id.etNim);
        btnSimpan = findViewById(R.id.btnSimpan);
        tvHasil = findViewById(R.id.tvHasil);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama = etNama.getText().toString();
                String nim = etNim.getText().toString();

                tvHasil.setText(
                        "Nama : " + nama +
                                "\nNIM : " + nim
                );
            }
        });
    }
}