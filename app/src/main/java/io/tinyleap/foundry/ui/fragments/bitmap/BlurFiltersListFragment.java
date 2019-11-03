package io.tinyleap.foundry.ui.fragments.bitmap;

import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.foundry.ui.adapters.ComponentDetailListAdapter;
import io.tinyleap.foundry.ui.fragments.ComponentDetailListFragment;

import java.util.ArrayList;
import java.util.List;

public class BlurFiltersListFragment extends ComponentDetailListFragment {
    static final List<ComponentDetail> ITEMS = new ArrayList();
    static {
        int i=0;
        addItem(new ComponentDetail(Integer.toString(i++),"Box Blur","Box Blur Filter Implementations", BoxBlurFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Gaussian Blur Filter","Gaussian Filter Implementation", GaussianBlurFilter.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Stack Blur Filter","Stack Filter Implementation", StackBlurFilter.class));
    }

    private static void addItem(ComponentDetail item) {
        ITEMS.add(item);
    }

    @Override
    public void setAdapter(RecyclerView recyclerView) {
        recyclerView.setAdapter(new ComponentDetailListAdapter(mOnClickListener, ITEMS));
    }
}