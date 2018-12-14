package mypet.fabiolindemberg.com.br.mypet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Pet> Pets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pets = new ArrayList<Pet>();

        Pets.add(new Pet(1, "Pastor Alemão", true, "Pastor alemão sem pedigri, com dois meses muito dócil"));
        Pets.add(new Pet(2, "Gato Angorá", true, "Gatinho fofo"));
        Pets.add(new Pet(3, "Periquito", true, "Doo o passáro e a gaiola!"));

    }
}
