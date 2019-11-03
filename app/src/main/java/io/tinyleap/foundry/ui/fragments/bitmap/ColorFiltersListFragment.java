package io.tinyleap.foundry.ui.fragments.bitmap;

import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.foundry.ui.adapters.ComponentDetailListAdapter;
import io.tinyleap.foundry.ui.fragments.ComponentDetailListFragment;
import io.tinyleap.foundry.ui.fragments.barcode.AztecCodeFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.color.*;

import java.util.ArrayList;
import java.util.List;

public class ColorFiltersListFragment extends ComponentDetailListFragment {
    static final List<ComponentDetail> ITEMS = new ArrayList();
    static {
        int i=0;
        addItem(new ComponentDetail(Integer.toString(i++),"Tint","Tint Color Filter Implementation", TintColorFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Sepia","Sepia Color Filter Implementation", SepiaColorFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Invert","Sepia Color Filter Implementation", InvertColorFilterFragment.class));
//        addItem(new ComponentDetail(Integer.toString(i++),"Invert native","Sepia Color Filter Implementations", InvertNativeColorFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Grayscale","Blur Filter Implementation", GrayscaleColorFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Temperature","Temperature Filter Implementation", TemperatureColorFilterFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Posterize","Posterize Filter Implementation", PosterizeColorFilterFragment.class));
    }

    private static void addItem(ComponentDetail item) {
        ITEMS.add(item);
    }

    @Override
    public void setAdapter(RecyclerView recyclerView) {
        recyclerView.setAdapter(new ComponentDetailListAdapter(mOnClickListener, ITEMS));
    }
}