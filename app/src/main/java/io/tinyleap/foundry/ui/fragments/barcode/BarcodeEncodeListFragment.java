package io.tinyleap.foundry.ui.fragments.barcode;

import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.containers.BarcodeListContent;
import io.tinyleap.foundry.ui.adapters.ComponentDetailListAdapter;
import io.tinyleap.foundry.ui.fragments.ComponentDetailListFragment;

public class BarcodeEncodeListFragment extends ComponentDetailListFragment {
    @Override
    public void setAdapter(RecyclerView recyclerView) {
        recyclerView.setAdapter(new ComponentDetailListAdapter(mOnClickListener, BarcodeListContent.ITEMS));
    }
}
