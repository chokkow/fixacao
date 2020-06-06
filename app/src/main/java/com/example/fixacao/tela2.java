package com.example.fixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tela2 extends AppCompatActivity {

        Button btnEmail, btnTel, btnEnder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        btnEmail= (Button) findViewById(R.id.btnE);
        btnEnder = (Button) findViewById(R.id.btnEn);
        btnTel = (Button) findViewById(R.id.btnTe);
    }

    public void endereco(View view){
        btnEnder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(tela2.this, endereco.class);
                startActivity(it);
            }
        });
    }

    public void telefone(View view){
        btnTel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(tela2.this, telefone.class);
                startActivity(it);
            }
        });
    }
    public void Email(View view){
        btnEmail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(tela2.this, email.class);
                startActivity(it);
            }
        });
    }
}
