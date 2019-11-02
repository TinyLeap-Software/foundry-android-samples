package io.tinyleap.foundry.ui.fragments;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.containers.ComponentDetail;

public class RandomDataFragment extends ItemDetailFragment {


    @Override
    protected void addChildContent(ComponentDetail detail, LayoutInflater inflater, ViewGroup parent) {
        View rootView = inflater.inflate(R.layout.fragment_random_data, null, false);
        parent.addView(rootView);
        TextView t1=rootView.findViewById(R.id.description);
        t1.setText("This sis a texst");
    }
}
