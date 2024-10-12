package com.example.layouts;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class PaginaPrin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_prin);


        TextView welcomeTextView = findViewById(R.id.welcomeTextView);
        welcomeTextView.setText("Bienvenido a la aplicación de fuentes hídricas");
    }
}
