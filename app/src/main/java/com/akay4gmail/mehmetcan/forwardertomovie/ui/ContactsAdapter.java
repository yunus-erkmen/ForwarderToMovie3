package com.akay4gmail.mehmetcan.forwardertomovie.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.akay4gmail.mehmetcan.forwardertomovie.R;
import com.akay4gmail.mehmetcan.forwardertomovie.restApi.models.Search;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by mehme on 5.08.2016.
 */
public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    private final Context mcontext;
    private OnItemClickListener mItemClickListener;
    private ArrayList<Search> search;


    public ContactsAdapter(ArrayList<Search> search, Context mcontext) {
        this.search = search;
        this.mcontext = mcontext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // MyAdapter.ViewHolder vh = new ViewHolder(v, new ContactsAdapter.ViewHolder.IMyViewHolderClicks()
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView1.setText(search.get(position).title);
        holder.textView2.setText(search.get(position).year);
        Picasso.with(mcontext).load(search.get(position).poster).into(holder.icon);
    }

    @Override
    public int getItemCount() {

        return search.size();
    }

    public void SetOnItemClickListener(OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    /*Every adapter has three primary methods: onCreateViewHolder to inflate the item layout and create the holder,
    onBindViewHolder to set the view attributes based on the data and getItemCount to determine the number of items.
    We need to implement all three to finish the adapter:
     */
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView textView1;
        public TextView textView2;
        public ImageView icon;


        public ViewHolder(View itemView) {
            super(itemView);

            textView1 = (TextView) itemView.findViewById(R.id.movie11);
            textView2 = (TextView) itemView.findViewById(R.id.year11);
            icon = (ImageView) itemView.findViewById(R.id.image11);
            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            mcontext.startActivity(new Intent(mcontext,ActivityMain.class));
            if (mItemClickListener != null) {
                mItemClickListener.onItemClick(v, getPosition());

            }
        }

    }
}