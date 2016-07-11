package com.example.satriadimaspermana.tes_recyclerview;

/**
 * Created by Satria Dimas Permana on 7/11/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Model> modelList;

    public MyAdapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Model model = modelList.get(position);
        holder.nama.setText(model.getNama());
        holder.alamat.setText(model.getAlamat());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nama, alamat;

        public ViewHolder(View itemView) {
            super(itemView);
            nama = (TextView) itemView.findViewById(R.id.nameList);
            alamat = (TextView) itemView.findViewById(R.id.alamatList);
        }


    }
}
