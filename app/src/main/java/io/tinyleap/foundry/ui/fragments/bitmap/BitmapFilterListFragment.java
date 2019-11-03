package io.tinyleap.foundry.ui.fragments.bitmap;

import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.foundry.ui.adapters.ComponentDetailListAdapter;
import io.tinyleap.foundry.ui.fragments.ComponentDetailListFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.blur.BlurFiltersListFragment;

import java.util.ArrayList;
import java.util.List;

public class BitmapFilterListFragment extends ComponentDetailListFragment {
    static final List<ComponentDetail> ITEMS = new ArrayList();
    static {
        int i=0;
        addItem(new ComponentDetail(Integer.toString(i++),"Blur Filters","Blur Filter implementations", BlurFiltersListFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Color Filters","Color Filter implementations", ColorFiltersListFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Enhancement Filters","Enhancement Filter implementations", EnhanceFiltersListFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Edge Detection Filters","Edge Detection Filter implementations", EdgeDetectionFiltersListFragment.class));

    }

    private static void addItem(ComponentDetail item) {
        ITEMS.add(item);
    }

    @Override
    public void setAdapter(RecyclerView recyclerView) {
        recyclerView.setAdapter(new ComponentDetailListAdapter(mOnClickListener, ITEMS));
    }
}
