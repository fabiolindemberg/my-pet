package mypet.fabiolindemberg.com.br.mypet;

import android.content.Intent;
import android.media.Image;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Pet> pets;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    public static String RESULT_CODE_DETAIL_ACTIVITY = "RCDA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pets = loadData();

        TextView tvCat = findViewById(R.id.tvCat);
        TextView tvDog = findViewById(R.id.tvDog);
        TextView tvOthers = findViewById(R.id.tvOthers);

        // Setup RecyclerView
        setUpRecyclerView();

        tvCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Filtro", "Gato");
            }
        });
        tvDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Filtro", "Cão");
            }
        });
        tvOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Filtro", "Outros");
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void setUpRecyclerView(){
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(new MyAdapter(pets));
        recyclerView.setLayoutManager(layoutManager);
    }

    private List<Pet> loadData(){
        List<Pet> list = new ArrayList<Pet>();

        Pet pastor = new Pet(1, "Pastor Alemão", true, "Pastor alemão sem pedigri, com dois meses muito dócil");
        list.add(new Pet(2, "Gato Angorá", true, "Gatinho fofo"));
        list.add(new Pet(3, "Periquito", true, "Doo o passáro e a gaiola!"));
        return list;
    }

}
