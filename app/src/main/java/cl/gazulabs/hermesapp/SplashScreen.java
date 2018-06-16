package cl.gazulabs.hermesapp;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.os.Handler;
import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class SplashScreen extends AppCompatActivity {

    private GifImageView gifImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        //Declarar elementos
        gifImageView = findViewById(R.id.splash_gif);

        //Setear gif a utilizar desde carpeta assets
         try {
             InputStream inputStream = getAssets().open("splash.gif");
             byte[] bytes = IOUtils.toByteArray(inputStream);
             gifImageView.setBytes(bytes);
             gifImageView.startAnimation();
         } catch (IOException e) {
             e.printStackTrace();
         }

        //Tiempo de espera en segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this, MainActivity.class));
                SplashScreen.this.finish();
            }
        },5000); // segundos de duracion del .gif


    }
}
