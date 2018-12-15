package mypet.fabiolindemberg.com.br.mypet;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<Pet> mPets;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivPetPic;
        public TextView tvPetName;
        //public TextView tvDescription;

        public MyViewHolder(LinearLayout linearLayout) {
            super(linearLayout);
            tvPetName = (TextView) linearLayout.findViewById(R.id.tvPetname);
            ivPetPic = (ImageView) linearLayout.findViewById(R.id.ivPetPic);
        }
    }

    public MyAdapter(List<Pet> pets){
        this.mPets = pets;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
    int viewType) {
        // create a new view
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.feed_main, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        Pet pet = mPets.get(i);
        myViewHolder.tvPetName.setText(pet.getDescription());
        myViewHolder.ivPetPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mPets.size();
    }
}
