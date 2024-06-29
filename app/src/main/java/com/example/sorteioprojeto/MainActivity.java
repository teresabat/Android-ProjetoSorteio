package com.example.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtém a referência ao TextView no layout
        final TextView textView = findViewById(R.id.textRes);
        // Obtém a referência ao Button no layout
        Button button = findViewById(R.id.btnSortear);

        // Define um OnClickListener para o botão
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cria uma nova instância de Random
                Random random = new Random();
                // Sorteia um número de 0 a 10 (inclusive)
                int randomNumber = random.nextInt(11);
                // Define o texto do TextView para mostrar o número sorteado
                textView.setText("Número sorteado foi: " + randomNumber);
            }
        });
    }
}