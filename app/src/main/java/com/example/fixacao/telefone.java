package com.example.fixacao;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class telefone extends AppCompatActivity {
    TextView titulo, d;
    EditText Nome, Operadora, País, Telefone;
    Button btnCadast;
    int t;
    String a, b, c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefone);
        titulo = (TextView) findViewById(R.id.tit);
        d = (TextView) findViewById(R.id.dd);
        Nome = (EditText) findViewById(R.id.name);
        Operadora = (EditText) findViewById(R.id.op);
        País = (EditText) findViewById(R.id.pa);
        Telefone = (EditText) findViewById(R.id.telef);
        btnCadast = (Button) findViewById(R.id.btncad);
    }

    public void cadastrar(View view){




        if (Nome.getText().length() == 0) {
            new AlertDialog.Builder(telefone.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (Operadora.getText().length() == 0) {
            new AlertDialog.Builder(telefone.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (País.getText().length() == 0) {
            new AlertDialog.Builder(telefone.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        t = Telefone.length();
        if(t==11){
            Toast.makeText(telefone.this, "Número registrado!", Toast.LENGTH_SHORT).show();
            Nome.setText("");
            Operadora.setText("");
            Telefone.setText("");
            País.setText("");
        }
        else{
            new AlertDialog.Builder(telefone.this)
                    .setTitle("Número inválido")
                    .setMessage("Número digitado é inválido")
                    .show();
        }
    }

}
