package br.com.local.recyclerappjsonapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<ListarItens> listItens;
    Context context;

    public MyAdapter(List<ListarItens> listItens, Context context) {
        this.listItens = listItens;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listar_itens, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListarItens listarItens = listItens.get(position);

        holder.txtCabecalho.setText(listarItens.getTitle());
        holder.txtDescricao.setText(listarItens.getOpening_crawl());

    }

    @Override
    public int getItemCount() {
        return listItens.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtCabecalho, txtDescricao;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtCabecalho = itemView.findViewById(R.id.txtCabecalho);
            txtDescricao = itemView.findViewById(R.id.txtDescricao);

        }
    }
}
