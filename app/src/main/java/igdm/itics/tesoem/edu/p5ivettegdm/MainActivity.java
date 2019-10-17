package igdm.itics.tesoem.edu.p5ivettegdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensaje (View v){
        Toast.makeText(this,"BIENVENIDOS A ESTA APLICACION", Toast.LENGTH_SHORT).show();

    }
}
