package cl.gazulabs.hermesapp.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cl.gazulabs.hermesapp.R;

public class Home extends AppCompatActivity {

   private Button btn_compromisos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_compromisos = findViewById(R.id.btn_compromisos);
        btn_compromisos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Notificaciones.class);
                startActivity(intent);
            }
        });



    }
}
