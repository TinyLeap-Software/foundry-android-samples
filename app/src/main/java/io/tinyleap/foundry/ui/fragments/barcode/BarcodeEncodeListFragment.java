package io.tinyleap.foundry.ui.fragments.barcode;

import androidx.recyclerview.widget.RecyclerView;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.foundry.ui.adapters.ComponentDetailListAdapter;
import io.tinyleap.foundry.ui.fragments.ComponentDetailListFragment;

import java.util.ArrayList;
import java.util.List;

public class BarcodeEncodeListFragment extends ComponentDetailListFragment {
    static final List<ComponentDetail> ITEMS = new ArrayList();
    static {
        int i=0;
        addItem(new ComponentDetail(Integer.toString(i++),"QRCode","QRCode encoding", EncodeQRFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Aztec","Aztec encoding", EncodeQRFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Codebar","Codebar encoding", EncodeQRFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Code39","Code39 encoding", EncodeQRFragment.class));
    }

    private static void addItem(ComponentDetail item) {
        ITEMS.add(item);
    }


    @Override
    public void setAdapter(RecyclerView recyclerView) {
        recyclerView.setAdapter(new ComponentDetailListAdapter(mOnClickListener, ITEMS));
    }
}
