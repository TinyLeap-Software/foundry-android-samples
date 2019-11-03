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
        addItem(new ComponentDetail(Integer.toString(i++),"Aztec","Aztec encoding", AztecCodeFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Codebar","Codebar encoding", CodebarFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Code39","Code39 encoding", Code39Fragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Code128","Code128 encoding", Code128Fragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"PDF417","PDF417 encoding", PDF417CodeFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"EAN-8","EAN-8 encoding", EAN8CodeFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"EAN-13","EAN-13 encoding", EAN13Fragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"UPC-A","UPC-A encoding", UPCACodeFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Data-Matrix","Data-Matrix", DataMatrixFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"ITF","ITF barcode encoding ", ITFCodeFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Databar","Databar barcode encoding ", DatabarFragment.class));
    }

    private static void addItem(ComponentDetail item) {
        ITEMS.add(item);
    }


    @Override
    public void setAdapter(RecyclerView recyclerView) {
        recyclerView.setAdapter(new ComponentDetailListAdapter(mOnClickListener, ITEMS));
    }
}
