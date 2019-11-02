package io.tinyleap.foundry.ui.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.ItemDetailActivity;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.foundry.ui.fragments.ComponentDetailFragment;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.util.UIUtils;

import java.util.List;

public class ComponentListAdapter extends RecyclerView.Adapter<ComponentListAdapter.ViewHolder> {

    private final AppCompatActivity mParentActivity;
    private final List<ComponentDetail> mValues;
    private final boolean mTwoPane;
    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            ComponentDetail item = (ComponentDetail) view.getTag();
            if (mTwoPane) {
                Bundle arguments = new Bundle();
                arguments.putString(ComponentDetailFragment.ARG_TITLE, item.getContentTitle());
                arguments.putString(ComponentDetailFragment.ARG_DESC, item.getContentDescription());
                Fragment fragment = UIUtils.getFragment(item.getFragmentClass());
                fragment.setArguments(arguments);
                mParentActivity.getSupportFragmentManager().beginTransaction()
                        .replace(R.id.item_detail_container, fragment)
                        .commit();
            } else {
                Context context = view.getContext();
                Intent intent = new Intent(context, ItemDetailActivity.class);
                intent.putExtra(ComponentDetailFragment.ARG_TITLE, item.getContentTitle());
                intent.putExtra(ComponentDetailFragment.ARG_DESC, item.getContentDescription());
                intent.putExtra(ComponentDetailFragment.ARG_CLASS, item.getFragmentClass());
                context.startActivity(intent);
            }
        }
    };

    public ComponentListAdapter(AppCompatActivity parent,
                                  List<ComponentDetail> items,
                                  boolean twoPane) {
        mValues = items;
        mParentActivity = parent;
        mTwoPane = twoPane;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_content, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mIdView.setText(mValues.get(position).getContentTitle());
        holder.mContentView.setText(mValues.get(position).getContentDescription());

        holder.itemView.setTag(mValues.get(position));
        holder.itemView.setOnClickListener(mOnClickListener);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView mIdView;
        final TextView mContentView;

        ViewHolder(View view) {
            super(view);
            mIdView = (TextView) view.findViewById(R.id.id_text);
            mContentView = (TextView) view.findViewById(R.id.content);
        }
    }
}