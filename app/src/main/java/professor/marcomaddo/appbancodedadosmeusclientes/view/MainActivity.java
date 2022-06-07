package professor.marcomaddo.appbancodedadosmeusclientes.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import professor.marcomaddo.appbancodedadosmeusclientes.controller.ClienteORMController;
import professor.marcomaddo.appbancodedadosmeusclientes.database.AppDataBase;
import professor.marcomaddo.appbancodedadosmeusclientes.model.Cliente;
import professor.marcomaddo.appbancodedadosmeusclientes.R;
import professor.marcomaddo.appbancodedadosmeusclientes.model.ClienteORM;

public class MainActivity extends AppCompatActivity {

    ClienteORMController clienteORMController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clienteORMController = new ClienteORMController();


        for (int i = 21; i < 28 ; i++){


        clienteORMController.deleteById(i);

        }
    }
}