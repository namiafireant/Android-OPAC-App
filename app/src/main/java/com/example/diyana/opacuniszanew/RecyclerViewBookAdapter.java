package com.example.diyana.opacuniszanew;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewBookAdapter extends RecyclerView.Adapter<RecyclerViewBookAdapter.ViewHolder>{
    private static final String TAG = "RecyclerViewBookAdapter";

    private String search,text;
    private List<Books> mData;
    private Context mContext;
    private int allow, found;

    public RecyclerViewBookAdapter(Context mContext, List<Books> mData, String search, String text) {
        this.search = search;
        this.text = text;
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_book_list,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: started.");

        //radio button choice
        String choice = search;
        switch (choice){

            case "Title":
                //somting here
                if (!text.equalsIgnoreCase("")){
                    if (mData.get(i).getbTitle().toLowerCase().contains(text.toLowerCase())){
                        viewHolder.title.setText(mData.get(i).getbTitle());
                        viewHolder.id.setText(mData.get(i).getbCallNum());
                        viewHolder.author.setText(mData.get(i).getbAuthor());
                    }

                    else{
                        viewHolder.card.setVisibility(View.GONE);
                    }
                }
                else {
                    viewHolder.title.setText(mData.get(i).getbTitle());
                    viewHolder.id.setText(mData.get(i).getbCallNum());
                    viewHolder.author.setText(mData.get(i).getbAuthor());
                }
                break;

            case "Subject":
                if (!text.equalsIgnoreCase("")){
                    if (mData.get(i).getbSubject().toLowerCase().contains(text.toLowerCase())){
                        viewHolder.title.setText(mData.get(i).getbTitle());
                        viewHolder.id.setText(mData.get(i).getbCallNum());
                        viewHolder.author.setText(mData.get(i).getbAuthor());
                    }

                    else{
                        viewHolder.card.setVisibility(View.GONE);
                    }
                }
                else {
                    viewHolder.title.setText(mData.get(i).getbTitle());
                    viewHolder.id.setText(mData.get(i).getbCallNum());
                    viewHolder.author.setText(mData.get(i).getbAuthor());
                }
                break;

            case "Series":

                break;

            case "ISBN/ISSN":
                if (!text.equalsIgnoreCase("")){
                    if (mData.get(i).getbIsbnNum().toLowerCase().contains(text.toLowerCase())){
                        viewHolder.title.setText(mData.get(i).getbTitle());
                        viewHolder.id.setText(mData.get(i).getbCallNum());
                        viewHolder.author.setText(mData.get(i).getbAuthor());
                    }

                    else{
                        viewHolder.card.setVisibility(View.GONE);
                    }
                }
                else {
                    viewHolder.title.setText(mData.get(i).getbTitle());
                    viewHolder.id.setText(mData.get(i).getbCallNum());
                    viewHolder.author.setText(mData.get(i).getbAuthor());
                }
                break;

            case "Name/Author":
                if (!text.equalsIgnoreCase("")){
                    if (mData.get(i).getbAuthor().toLowerCase().contains(text.toLowerCase())){
                        viewHolder.title.setText(mData.get(i).getbTitle());
                        viewHolder.id.setText(mData.get(i).getbCallNum());
                        viewHolder.author.setText(mData.get(i).getbAuthor());
                    }

                    else{
                        viewHolder.card.setVisibility(View.GONE);
                    }
                }
                else {
                    viewHolder.title.setText(mData.get(i).getbTitle());
                    viewHolder.id.setText(mData.get(i).getbCallNum());
                    viewHolder.author.setText(mData.get(i).getbAuthor());
                }
                break;

            case "Publication":
                break;

            case "Call Number":
                if (!text.equalsIgnoreCase("")){
                    if (mData.get(i).getbCallNum().toLowerCase().contains(text.toLowerCase())){
                        viewHolder.title.setText(mData.get(i).getbTitle());
                        viewHolder.id.setText(mData.get(i).getbCallNum());
                        viewHolder.author.setText(mData.get(i).getbAuthor());
                    }

                    else{
                        viewHolder.card.setVisibility(View.GONE);
                    }
                }
                else {
                    viewHolder.title.setText(mData.get(i).getbTitle());
                    viewHolder.id.setText(mData.get(i).getbCallNum());
                    viewHolder.author.setText(mData.get(i).getbAuthor());
                }
                break;
        }

        viewHolder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DescriptionActivity.class);
                intent.putExtra("value", mData.get(i).getbId());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private RelativeLayout last;
        private CardView card;
        private TextView title,id, author;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.titleBook);
            id = (TextView)itemView.findViewById(R.id.idBook);
            author = (TextView)itemView.findViewById(R.id.authorBook);
            card = (CardView) itemView.findViewById(R.id.card_book);
            last = (RelativeLayout) itemView.findViewById(R.id.accessionLayout);
        }
    }


}
