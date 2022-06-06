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

        ClienteORM orm = new ClienteORM();
        orm.setNome("Paulo");
        orm.setIdade(18);
        orm.setPreco(12.97);
        orm.setSalario(999.97);
        orm.setDataCadastro("21/01/2022");
        orm.setHoraCadastro("12:12");


        clienteORMController.insert(orm);

    }
}