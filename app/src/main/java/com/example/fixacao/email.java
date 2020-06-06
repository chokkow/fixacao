package com.example.fixacao;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class email extends AppCompatActivity {
    TextView titulo, s, cs;
    EditText Nome, em, senha, conf;
    Button btnCriar;
    String sen, confisen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        titulo = (TextView) findViewById(R.id.Tit);
        s = (TextView) findViewById(R.id.se);
        cs = (TextView) findViewById(R.id.cse);
        Nome = (EditText) findViewById(R.id.name);
        em = (EditText) findViewById(R.id.emai);
        senha = (EditText) findViewById(R.id.passw);
        conf = (EditText) findViewById(R.id.cpassw);
        btnCriar = (Button) findViewById(R.id.btc);
    }

    public void Criar(View view) {



        if (Nome.getText().length() == 0) {
            new AlertDialog.Builder(email.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (em.getText().length() == 0) {
            new AlertDialog.Builder(email.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (senha.getText().length() == 0) {
            new AlertDialog.Builder(email.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        sen = senha.getText().toString();
        confisen = conf.getText().toString();
        if (sen.equals(confisen)) {
            Toast.makeText(email.this, "Conta Criada!", Toast.LENGTH_SHORT).show();
            Nome.setText("");
            em.setText("");
            senha.setText("");
            conf.setText("");
        } else {
            new AlertDialog.Builder(email.this)
                    .setTitle("Senha inválida")
                    .setMessage("Senhas não correspondem")
                    .show();
        }

    }

}
