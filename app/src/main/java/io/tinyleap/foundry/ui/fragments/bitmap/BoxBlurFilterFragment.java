package io.tinyleap.foundry.ui.fragments.bitmap;

import android.view.View;
import io.tinyleap.android.bitmap.TinyLeapBitmap;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.ui.fragments.ComponentDetailFragment;

public class BoxBlurFilterFragment extends BitmapFilterDetailFragment {

    @Override
    protected boolean useSlider1() {
        return true;
    }

    @Override
    protected boolean useSlider2() {
        return true;
    }

    @Override
    protected int slider1Max() {
        return 100;
    }

    @Override
    protected int slider2Max() {
        return 100;
    }

    @Override
    protected void processBitmap(TinyLeapBitmap bitmap) {

    }
}
