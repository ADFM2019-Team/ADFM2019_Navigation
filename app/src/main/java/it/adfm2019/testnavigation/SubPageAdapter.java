package it.adfm2019.testnavigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SubPageAdapter extends RecyclerView.Adapter<SubPageAdapter.RecyclerSubPageViewHolder> {

    private static String[] eventListTitle = {"Story 0", "Story 1", "Story 2", "Story 4", "Story 5", "Story 6", "Story 7", "Story 8", "Story 9", "Story 10"};
    private static String[] eventListDescription = {"Description Description Description Description Description 0", "Description Description Description Description Description 1", "Description Description Description Description Description 2", "Description Description Description Description Description 4", "Description Description Description Description Description 5", "Description Description Description Description Description 6", "Description Description Description Description Description 7", "Description Description Description Description Description 8", "Description Description Description Description Description 9", "Description Description Description Description Description 10"};

    private Context parentContext;


    @NonNull
    @Override
    public RecyclerSubPageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        parentContext = parent.getContext();
        int layoutIdForItem = R.layout.recycler_sub_page_view;
        LayoutInflater inflater = LayoutInflater.from(parentContext);
        View view = inflater.inflate(layoutIdForItem, parent, false);

        RecyclerSubPageViewHolder holder = new RecyclerSubPageViewHolder(view);

        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerSubPageViewHolder holder, int position) {

        holder.bind(position);
    }


    @Override
    public int getItemCount() {
        return eventListTitle.length;
    }

    class RecyclerSubPageViewHolder extends RecyclerView.ViewHolder
    {
        TextView titleTxt;
        TextView descriptionTxt;

        public RecyclerSubPageViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTxt = (TextView) itemView.findViewById(R.id.TitleTxt);
            descriptionTxt = (TextView) itemView.findViewById(R.id.descriptionTxt);
        }

        void bind(int listIndex)
        {
            titleTxt.setText( eventListTitle[listIndex] );
            descriptionTxt.setText( eventListDescription[listIndex] );
        }
    }
}
