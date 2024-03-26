package coutinho.neves.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//A Classe Main Activity é a classe principal do app//
public class MainActivity extends AppCompatActivity {

    @Override
    //O onCreate é metodo que esta chamado toda vez que a tela esta sendo criada//
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //O contentView cria os elementos de interface//
        setContentView(R.layout.activity_main);

        //o button obtem o botão enviar atraves do Id//

        Button btnEnviar = findViewById(R.id.btnEnviar);

        // A ação a ser realizada ao pressionar o botão//
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            //o Onclick é executado quando clica o botão//
            public void onClick(View v) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                String textoDigitado = etDigiteAqui.getText().toString();
                Intent i = new Intent(MainActivity.this, NextActivity.class);
                i.putExtra("texto", textoDigitado);

                startActivity(i);
            }
        });
    }
}