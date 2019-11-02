package io.tinyleap.foundry.ui.fragments;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.util.random.RandomColor;
import io.tinyleap.util.random.RandomString;

public class RandomDataFragment extends ItemDetailFragment {


    @Override
    protected void addChildContent(ComponentDetail detail, LayoutInflater inflater, ViewGroup parent) {
        View rootView = inflater.inflate(R.layout.fragment_random_data, null, false);
        parent.addView(rootView);
        View random=rootView.findViewById(R.id.randomString);
        final TextView tv=rootView.findViewById(R.id.genString);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(RandomString.randomAlphanumeric(150));
            }
        });
        random=rootView.findViewById(R.id.randomColor);
        final View tvcolor=rootView.findViewById(R.id.genColor);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvcolor.setBackgroundColor(RandomColor.getRandomColor());
            }
        });
    }
}
