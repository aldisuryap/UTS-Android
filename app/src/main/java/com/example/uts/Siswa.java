package com.example.uts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Siswa extends AppCompatActivity {


    private EditText nikInput;
    private EditText namaInput;
    private EditText alamatInput;
    private EditText handphoneInput;
    private EditText keteranganInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);

        nikInput = findViewById(R.id.input_Nik);
        namaInput = findViewById(R.id.input_Nama);
        alamatInput = findViewById(R.id.input_Alamat);
        handphoneInput = findViewById(R.id.input_Nomor);
        keteranganInput = findViewById(R.id.input_Keterangan);
    }

    public void handleSubmit(View view) {
        int nik = Integer.parseInt(nikInput.getText().toString());
        int nomer = Integer.parseInt(handphoneInput.getText().toString());
        String nama = namaInput.getText().toString();
        String alamat = alamatInput.getText().toString();
        String keterangan = keteranganInput.getText().toString();

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        alertDialog.setTitle("Data Siswa");

        alertDialog
                .setMessage("Nik : " + nik + "\nNama : " + nama + "\nAlamat : " + alamat
                        + "\nHandphone : " + nomer + "\nKeterangan : " + keterangan)
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setNegativeButton("Tutup",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert = alertDialog.create();

        alert.show();

    }
}
