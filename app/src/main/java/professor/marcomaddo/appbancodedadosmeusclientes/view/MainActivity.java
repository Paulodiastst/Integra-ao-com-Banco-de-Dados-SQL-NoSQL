package professor.marcomaddo.appbancodedadosmeusclientes.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import professor.marcomaddo.appbancodedadosmeusclientes.database.AppDataBase;
import professor.marcomaddo.appbancodedadosmeusclientes.model.Cliente;
import professor.marcomaddo.appbancodedadosmeusclientes.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}