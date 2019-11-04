package io.tinyleap.foundry.ui.fragments.bitmap;

import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.foundry.ui.adapters.ComponentDetailListAdapter;
import io.tinyleap.foundry.ui.fragments.ComponentDetailListFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.edge.CannyEdgeFilterFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.edge.LaPlaceEdgeFilterFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.edge.SimpleEmbossFilterFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.edge.SobelEdgeFilterFragment;

import java.util.ArrayList;
import java.util.List;

public class EdgeDetectionFiltersListFragment extends ComponentDetailListFragment {
    static final List<ComponentDetail> ITEMS = new ArrayList();
    static {
        int i=0;
        addItem(new ComponentDetail(Integer.toString(i++),"Simple Emboss filter","Simple Emboss Filter Implementation", SimpleEmbossFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Canny Edge filter","Canny Edge Detection Filter Implementation", CannyEdgeFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Sobel Edge filter","Sobel Edge Detection Filter Implementation", SobelEdgeFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"LaPlace Edge filter","LaPlace Edge Detection Filter Implementation", LaPlaceEdgeFilterFragment.class));
    }

    private static void addItem(ComponentDetail item) {
        ITEMS.add(item);
    }

    @Override
    public void setAdapter(RecyclerView recyclerView) {
        recyclerView.setAdapter(new ComponentDetailListAdapter(mOnClickListener, ITEMS));
    }
}