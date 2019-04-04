package com.example.diyana.opacuniszanew;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAccessionAdapter extends RecyclerView.Adapter<RecyclerViewAccessionAdapter.MyViewHolder> {

    private String value;
    private int allow;
    private Context mContext;
    private List<Accession> mData;

    public RecyclerViewAccessionAdapter(Context mContext, List<Accession> mData, String value) {
        this.mContext = mContext;
        this.mData = mData;
        this.value = value;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_accession_list, viewGroup, false);
        if(allow == 1){
            view.setVisibility(View.GONE);
            view.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
        }
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {

        if(mData.get(i).getaBookId().equalsIgnoreCase(value)){
            myViewHolder.callNoTxt.setText(mData.get(i).getaCallNum());
            myViewHolder.campusTxt.setText(mData.get(i).getaCampus());
            myViewHolder.locationTxt.setText(mData.get(i).getaLocation());
            myViewHolder.smdTxt.setText(mData.get(i).getaSmd());
            myViewHolder.categoryTxt.setText(mData.get(i).getaCategory());
            myViewHolder.statusTxt.setText(mData.get(i).getaStatus());
            myViewHolder.dueDateTxt.setText(mData.get(i).getaDueDate());
            myViewHolder.dueTimeTxt.setText(mData.get(i).getaDueTime());
        }else {
            myViewHolder.card.setVisibility(View.GONE);
        }


        //Set click listener
        /*myViewHolder.book_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(mContext, AdminBookDetailActivity.class);
                intent.putExtra("Title", mData.get(i).getTitle());
                intent.putExtra("Description", mData.get(i).getDescription());
                intent.putExtra("Thumbnail", mData.get(i).getThumbnail());
                intent.putExtra("Category", mData.get(i).getCategory());
                mContext.startActivity(intent);*/
//            }
//        });*/
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{


        private CardView card;
        private TextView callNoTxt,campusTxt, locationTxt, smdTxt, categoryTxt, statusTxt, dueDateTxt, dueTimeTxt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            callNoTxt = (TextView)itemView.findViewById(R.id.callNotxt);
            campusTxt = (TextView)itemView.findViewById(R.id.campustxt);
            locationTxt = (TextView)itemView.findViewById(R.id.locationtxt);
            smdTxt = (TextView)itemView.findViewById(R.id.smdtxt);
            categoryTxt = (TextView) itemView.findViewById(R.id.categorytxt);
            statusTxt = (TextView) itemView.findViewById(R.id.statustxt);
            dueDateTxt = (TextView) itemView.findViewById(R.id.dueDatetxt);
            dueTimeTxt = (TextView) itemView.findViewById(R.id.dueTimetxt);
            card = (CardView) itemView.findViewById(R.id.card_accession);
            if(allow == 1){
                card.setVisibility(View.GONE);
                card.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }


        }
    }
}
