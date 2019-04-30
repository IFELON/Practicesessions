package in.suriya.screens.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import in.suriya.screens.MainActivity;
import in.suriya.screens.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    Context context;
    ArrayList<String> myArrayList;

    public MyAdapter(Context context, ArrayList<String> myArrayList) {
        this.context = context;
        this.myArrayList = myArrayList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, viewGroup, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.txtView.setText(myArrayList.get(i));
    }

    @Override
    public int getItemCount() {
        return myArrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView txtView;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            txtView = itemView.findViewById(R.id.txtView);
        }
    }
}
