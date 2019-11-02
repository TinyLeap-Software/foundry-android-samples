package io.tinyleap.foundry.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.ItemDetailActivity;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.containers.BarcodeListContent;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.foundry.ui.adapters.ComponentDetailListAdapter;
import io.tinyleap.foundry.util.UIUtils;

public abstract class ComponentDetailListFragment extends ComponentDetailFragment {
    boolean mTwoPane=true;
    @Override
    protected void addChildContent(LayoutInflater inflater, ViewGroup parent) {
        View rootView = inflater.inflate(R.layout.fragment_list_barcode, null, false);
        parent.addView(rootView);
        View detailContainer=getActivity().findViewById(R.id.item_detail_container);
        if ( detailContainer!= null && detailContainer instanceof NestedScrollView) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = false;
        }
        RecyclerView recyclerView=rootView.findViewById(R.id.list);
        setAdapter(recyclerView);

    }
    protected final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            ComponentDetail item = (ComponentDetail) view.getTag();
            if(mTwoPane) {
                Bundle arguments = new Bundle();
                arguments.putString(ComponentDetailFragment.ARG_TITLE, item.getContentTitle());
                arguments.putString(ComponentDetailFragment.ARG_DESC, item.getContentDescription());
                Fragment fragment = UIUtils.getFragment(item.getFragmentClass());
                fragment.setArguments(arguments);
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.add(R.id.item_detail_container, fragment);
                ft.addToBackStack(item.getContentTitle());
                ft.commit();
            }else {
                Context context = view.getContext();
                Intent intent = new Intent(context, ItemDetailActivity.class);
                intent.putExtra(ComponentDetailFragment.ARG_TITLE, item.getContentTitle());
                intent.putExtra(ComponentDetailFragment.ARG_DESC, item.getContentDescription());
                intent.putExtra(ComponentDetailFragment.ARG_CLASS, item.getFragmentClass());
                context.startActivity(intent);
            }
        }
    };
    public abstract void setAdapter(RecyclerView recyclerView);
}
