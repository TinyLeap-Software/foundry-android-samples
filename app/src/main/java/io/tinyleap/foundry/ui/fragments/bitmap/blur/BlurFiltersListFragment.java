package io.tinyleap.foundry.ui.fragments.bitmap.blur;

import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.foundry.ui.adapters.ComponentDetailListAdapter;
import io.tinyleap.foundry.ui.fragments.ComponentDetailListFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.blur.*;

import java.util.ArrayList;
import java.util.List;

public class BlurFiltersListFragment extends ComponentDetailListFragment {
    static final List<ComponentDetail> ITEMS = new ArrayList();
    static {
        int i=0;
        addItem(new ComponentDetail(Integer.toString(i++),"Box Blur","Box Blur Filter Implementations", BoxBlurFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Gaussian Blur Filter","Gaussian Blur Filter Implementation", GaussianBlurFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Stack Blur Filter","Stack Blur Filter Implementation", StackBlurFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Motion Blur Filter","Motion Blur Filter Implementation", MotionBlurFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Average Blur Filter","Average Blur Filter Implementation", AverageBlurFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Simple Blur Filter","Simple Blur Filter Implementation", SimpleBlurFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Stack Blur RS Filter","Stack Blur with Renderscript Filter Implementation", StackBlurRSBlurFilterFragment.class));
    }

    private static void addItem(ComponentDetail item) {
        ITEMS.add(item);
    }

    @Override
    public void setAdapter(RecyclerView recyclerView) {
        recyclerView.setAdapter(new ComponentDetailListAdapter(mOnClickListener, ITEMS));
    }
}