package io.tinyleap.foundry.ui.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.containers.ComponentDetail;

public class BarcodeEncodingFragment extends ComponentDetailFragment {
    @Override
    protected void addChildContent(LayoutInflater inflater, ViewGroup parent) {
        View rootView = inflater.inflate(R.layout.fragment_random_data, null, false);
        parent.addView(rootView);
    }
}
