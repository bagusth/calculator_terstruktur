package com.example.calculator_terstruktur;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, tambah, kurang, kali, bagi, sama_Dengan, koma, C, rei;

    TextView hasil;

    boolean add, subs, divided, multiply;
    float hasil1, hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rei = findViewById(R.id.zero);
        rei.setOnClickListener(this);

        satu = findViewById(R.id.ichi);
        satu.setOnClickListener(this);

        dua = findViewById(R.id.ni);
        dua.setOnClickListener(this);

        tiga = findViewById(R.id.san);
        tiga.setOnClickListener(this);

        empat = findViewById(R.id.yon);
        empat.setOnClickListener(this);

        lima = findViewById(R.id.go);
        lima.setOnClickListener(this);

        enam = findViewById(R.id.roku);
        enam.setOnClickListener(this);

        tujuh = findViewById(R.id.nana);
        tujuh.setOnClickListener(this);

        delapan = findViewById(R.id.hachi);
        delapan.setOnClickListener(this);

        sembilan = findViewById(R.id.kyuu);
        sembilan.setOnClickListener(this);

        C = findViewById(R.id.C);
        C.setOnClickListener(this);

        tambah = findViewById(R.id.tambah);
        tambah.setOnClickListener(this);

        kurang = findViewById(R.id.kurang);
        kurang.setOnClickListener(this);

        kali = findViewById(R.id.kali);
        kali.setOnClickListener(this);

        bagi = findViewById(R.id.bagi);
        bagi.setOnClickListener(this);

        sama_Dengan = findViewById(R.id.equal);
        sama_Dengan.setOnClickListener(this);

        koma = findViewById(R.id.colon);
        koma.setOnClickListener(this);

        hasil = (TextView) findViewById(R.id.result);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.C:
                hasil.setText("");
            case R.id.zero:
                hasil.setText(hasil.getText().toString().trim() + "");
                break;
            case R.id.ichi:
                hasil.setText(hasil.getText().toString().trim() + "1");
                break;
            case R.id.ni:
                hasil.setText(hasil.getText().toString().trim() + "2");
                break;
            case R.id.san:
                hasil.setText(hasil.getText().toString().trim() + "3");
                break;
            case R.id.yon:
                hasil.setText(hasil.getText().toString().trim() + "4");
                break;
            case R.id.go:
                hasil.setText(hasil.getText().toString().trim() + "5");
                break;
            case R.id.roku:
                hasil.setText(hasil.getText().toString().trim() + "6");
                break;
            case R.id.nana:
                hasil.setText(hasil.getText().toString().trim() + "7");
                break;
            case R.id.hachi:
                hasil.setText(hasil.getText().toString().trim() + "8");
                break;
            case R.id.kyuu:
                hasil.setText(hasil.getText().toString().trim() + "9");
                break;
            case R.id.colon:
                hasil.setText(hasil.getText().toString().trim() + ".");
                break;
            case R.id.tambah:
                hasil1 = Float.parseFloat(hasil.getText().toString());
                add = true;
                hasil.setText(null);
                break;
            case R.id.kurang:
                hasil1 = Float.parseFloat(hasil.getText().toString());
                subs = true;
                hasil.setText(null);
                break;
            case R.id.kali:
                hasil1 = Float.parseFloat(hasil.getText().toString());
                multiply = true;
                hasil.setText(null);
                break;
            case R.id.bagi:
                hasil1 = Float.parseFloat(hasil.getText().toString());
                divided = true;
                hasil.setText(null);
                break;
            case R.id.equal:
                hasil2 = Float.parseFloat(hasil.getText().toString().trim());
                if (add == true) {
                    hasil.setText(hasil1 + hasil2 + " ");
                    add = false;
                }
                if (subs == true) {
                    hasil.setText(hasil1 - hasil2 + " ");
                    subs = false;
                }
                if (multiply == true) {
                    hasil.setText(hasil1 * hasil2 + " ");
                    multiply = false;
                }
                if (divided == true) {
                    hasil.setText(hasil1 / hasil2 + " ")    ;
                    divided = false;


                }

        }
    }
}
