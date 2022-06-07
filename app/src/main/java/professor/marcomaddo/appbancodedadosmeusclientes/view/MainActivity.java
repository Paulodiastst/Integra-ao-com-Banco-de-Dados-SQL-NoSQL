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
        orm.setId(1);
        orm.setNome("Paulo Roberto");
        orm.setIdade(19);
        orm.setPreco(13.97);
        orm.setSalario(789.97);
        orm.setDataCadastro("20/01/2022");
        orm.setHoraCadastro("20:20");
        orm.setAtivo(true);

        clienteORMController.update(orm);

    }
}