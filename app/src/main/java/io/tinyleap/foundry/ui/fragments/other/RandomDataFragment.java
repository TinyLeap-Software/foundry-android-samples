package io.tinyleap.foundry.ui.fragments.other;


import android.view.View;
import android.widget.TextView;
import io.tinyleap.foundry.R;

import io.tinyleap.foundry.ui.fragments.ComponentDetailFragment;
import io.tinyleap.util.random.RandomColor;
import io.tinyleap.util.random.RandomString;

public class RandomDataFragment extends ComponentDetailFragment {

    @Override
    protected int getChildLayout() {
        return R.layout.fragment_random_data;
    }

    @Override
    protected void setupUI(View rootView) {
        View random=rootView.findViewById(R.id.randomString);
        final TextView tv=rootView.findViewById(R.id.genString);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(RandomString.randomAlphanumeric(150));
            }
        });
        random=rootView.findViewById(R.id.randomString2);
        final TextView genString2=rootView.findViewById(R.id.genString2);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genString2.setText(RandomString.randomAscii(150));
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
