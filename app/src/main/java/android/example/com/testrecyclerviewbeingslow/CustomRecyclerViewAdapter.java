package android.example.com.testrecyclerviewbeingslow;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mohamed on 3/28/2018.
 *
 */

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter{

    public CustomRecyclerViewAdapter() {
        // empty constructor
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        //int layoutRes = R.layout.item_for_recycler_view_adapter;
        int layoutRes = R.layout.item_no_constraint_layout_at_all;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutRes, parent, false);

        return new CustomVH(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // do nothing
    }

    @Override
    public int getItemCount() {
        // NOTE -> 50 just to simulate for example sql query results or any arrayList of size 50
        return 50;
    }

    // --- View Holder

    public class CustomVH extends RecyclerView.ViewHolder {
        public CustomVH(View itemView) {
            super(itemView);
        }
    }

}
