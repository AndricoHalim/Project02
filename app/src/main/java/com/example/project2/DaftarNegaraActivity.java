package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class DaftarNegaraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_negara);

        //daftar negara yang tampil (awal)
        ArrayList<String> alNegara = new ArrayList<>();
        alNegara.add("Indonesia");
        alNegara.add("Malaysia");
        alNegara.add("Thailand");
        alNegara.add("Kamboja");
        alNegara.add("Filipina");

        EditText etNegara = findViewById(R.id.et_negara);
        Button button = findViewById(R.id.button);
        ListView lvNegara = findViewById(R.id.lv_negara);

        ArrayAdapter<String> adapterNegara = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alNegara);
        lvNegara.setAdapter(adapterNegara);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaNegara = etNegara.getText().toString();
                if (!namaNegara.equals("")) {
                    //adapter.add(namaNegara);
                    adapterNegara.add(namaNegara);
                    adapterNegara.notifyDataSetChanged();
                    etNegara.setText("");
                } else {
                    Toast.makeText(DaftarNegaraActivity.this, "Isian kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}