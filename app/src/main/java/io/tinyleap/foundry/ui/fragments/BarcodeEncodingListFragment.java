package io.tinyleap.foundry.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.containers.BarcodeListContent;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.foundry.ui.adapters.ComponentDetailListAdapter;
import io.tinyleap.foundry.util.UIUtils;

public class BarcodeEncodingListFragment extends ComponentDetailFragment {
    @Override
    protected void addChildContent(LayoutInflater inflater, ViewGroup parent) {
        View rootView = inflater.inflate(R.layout.fragment_list_barcode, null, false);
        parent.addView(rootView);
        RecyclerView recyclerView=rootView.findViewById(R.id.list);
        recyclerView.setAdapter(new ComponentDetailListAdapter(mOnClickListener, BarcodeListContent.ITEMS));
    }
    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            ComponentDetail item = (ComponentDetail) view.getTag();
            Bundle arguments = new Bundle();
            arguments.putString(ComponentDetailFragment.ARG_TITLE, item.getContentTitle());
            arguments.putString(ComponentDetailFragment.ARG_DESC, item.getContentDescription());
            Fragment fragment= UIUtils.getFragment(item.getFragmentClass());
            fragment.setArguments(arguments);
            FragmentTransaction ft=getFragmentManager().beginTransaction();
            ft.add(R.id.item_detail_container,fragment);
            ft.addToBackStack(item.getContentTitle());
            ft.commit();
        }
    };
}
