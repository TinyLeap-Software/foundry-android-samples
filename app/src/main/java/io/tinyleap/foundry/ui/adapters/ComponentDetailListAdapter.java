package io.tinyleap.foundry.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.containers.ComponentDetail;

import java.util.List;

public class ComponentDetailListAdapter  extends RecyclerView.Adapter<ComponentListAdapter.ViewHolder> {
    private final List<ComponentDetail> mValues;
    private final View.OnClickListener mClickListener;

    public ComponentDetailListAdapter(View.OnClickListener clickListener,
                                List<ComponentDetail> items
                              ) {
        mValues = items;
        mClickListener = clickListener;
    }
    @Override
    public ComponentListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_content, parent, false);
        return new ComponentListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ComponentListAdapter.ViewHolder holder, int position) {
        holder.mIdView.setText(mValues.get(position).getContentTitle());
        holder.mContentView.setText(mValues.get(position).getContentDescription());

        holder.itemView.setTag(mValues.get(position));
        holder.itemView.setOnClickListener(mClickListener);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }
}
