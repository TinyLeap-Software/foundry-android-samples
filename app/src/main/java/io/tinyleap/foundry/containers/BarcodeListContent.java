package io.tinyleap.foundry.containers;

import io.tinyleap.foundry.ui.fragments.BarcodeEncodingFragment;
import io.tinyleap.foundry.ui.fragments.RandomDataFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BarcodeListContent {
    /**
     * An array of sample (dummy) items.
     */
    public static final List<ComponentDetail> ITEMS = new ArrayList<ComponentDetail>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ComponentDetail> ITEM_MAP = new HashMap<String, ComponentDetail>();

    static {
        int i=0;
        addItem(new ComponentDetail(Integer.toString(i++),"QRCode","QRCode encoding", BarcodeEncodingFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Aztec","Aztec encoding", BarcodeEncodingFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Codebar","Codebar encoding", BarcodeEncodingFragment.class));
        addItem(new ComponentDetail(Integer.toString(i++),"Code39","Code39 encoding", BarcodeEncodingFragment.class));

    }

    private static void addItem(ComponentDetail item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }
}
