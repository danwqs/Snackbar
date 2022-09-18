package com.danilodev.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button buttonAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbrir = findViewById(R.id.buttonAbrir);

        buttonAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Snackbar snackbar =

                Snackbar.make(
                                view,
                                "Botão pressionado",
                                Snackbar.LENGTH_LONG
                        ).setAction("Confirmar", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                //buttonAbrir.setText("Botão abrir alterado");
                            }
                        }).setActionTextColor(getResources().getColor(com.google.android.material.R.color.design_default_color_error))
                        .show();

                //snackbar.show();
                //snackbar.dismiss();

            }
        });
    }

    }