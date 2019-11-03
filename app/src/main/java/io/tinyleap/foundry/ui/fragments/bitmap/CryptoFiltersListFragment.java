package io.tinyleap.foundry.ui.fragments.bitmap;

import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.foundry.ui.adapters.ComponentDetailListAdapter;
import io.tinyleap.foundry.ui.fragments.ComponentDetailListFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.crypto.StegnographyEdgeFilterFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.edge.CannyEdgeFilterFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.edge.LaPlaceEdgeFilterFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.edge.SimpleEmbossFilterFragment;

import java.util.ArrayList;
import java.util.List;

public class CryptoFiltersListFragment extends ComponentDetailListFragment {
    static final List<ComponentDetail> ITEMS = new ArrayList();
    static {
        int i=0;
        addItem(new ComponentDetail(Integer.toString(i++),"Stegnography","Stegnography Crypto Filter Implementation", StegnographyEdgeFilterFragment.class));
    }

    private static void addItem(ComponentDetail item) {
        ITEMS.add(item);
    }

    @Override
    public void setAdapter(RecyclerView recyclerView) {
        recyclerView.setAdapter(new ComponentDetailListAdapter(mOnClickListener, ITEMS));
    }
}