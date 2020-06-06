package com.example.fixacao;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class endereco extends AppCompatActivity {
    TextView titulo, n, c;
    EditText endereco, nome, cep, numero, complemento;
    Button btnRegistrar;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endereco);
        titulo = (TextView) findViewById(R.id.tit2);
        n = (TextView) findViewById(R.id.nt);
        c = (TextView) findViewById(R.id.c);
        endereco = (EditText) findViewById(R.id.end);
        nome = (EditText) findViewById(R.id.name);
        cep = (EditText) findViewById(R.id.crp);
        numero = (EditText) findViewById(R.id.num);
        complemento = (EditText) findViewById(R.id.comp);
        btnRegistrar = (Button) findViewById(R.id.btnreg);
    }

    public void cadastro(View view){

        if (endereco.getText().length() == 0) {
            new AlertDialog.Builder(endereco.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (numero.getText().length() == 0) {
            new AlertDialog.Builder(endereco.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (nome.getText().length() == 0) {
            new AlertDialog.Builder(endereco.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        a = cep.length();
        if(a==8){
            Toast.makeText(endereco.this, "Número registrado!", Toast.LENGTH_SHORT).show();
            nome.setText("");
            endereco.setText("");
            cep.setText("");
            complemento.setText("");
            numero.setText("");
        }
        else{
            new AlertDialog.Builder(endereco.this)
                    .setTitle("Endereço inválido")
                    .setMessage("Cep inválido")
                    .show();
        }
    }
    }



