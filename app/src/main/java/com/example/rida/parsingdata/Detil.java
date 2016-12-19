package com.example.rida.parsingdata;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Detil extends AppCompatActivity {

    String nim, nama, angkatan, tgl_lahir, alamat, ayah, ibu;
    TextView txtNim, txtNama, txtAngkatan, txtTglLahir, txtAlamat, txtAyah, txtIbu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil);

        nim = getIntent().getStringExtra("nim");
        nama = getIntent().getStringExtra("nama");
        angkatan = getIntent().getStringExtra("angkatan");
        tgl_lahir = getIntent().getStringExtra("tgl_lahir");
        alamat = getIntent().getStringExtra("alamat");
        ayah = getIntent().getStringExtra("ayah");
        ibu = getIntent().getStringExtra("ibu");

        String newNama = nama.replace("-", " ");
        String newAlamat = alamat.replace("-", " ");

        txtNim = (TextView)findViewById(R.id.nim);
        txtNim.setText(nim);

        txtNama = (TextView)findViewById(R.id.nama);
        txtNama.setText(newNama);

        txtAngkatan = (TextView)findViewById(R.id.angkatan);
        txtAngkatan.setText(angkatan);

        txtTglLahir = (TextView)findViewById(R.id.tgl_lahir);
        txtTglLahir.setText(tgl_lahir);

        txtAlamat = (TextView)findViewById(R.id.alamat);
        txtAlamat.setText(newAlamat);

        txtAyah = (TextView)findViewById(R.id.ayah);
        txtAyah.setText(ayah);

        txtIbu = (TextView)findViewById(R.id.ibu);
        txtIbu.setText(ibu);
    }
}
