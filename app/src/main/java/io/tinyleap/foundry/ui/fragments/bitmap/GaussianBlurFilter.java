package io.tinyleap.foundry.ui.fragments.bitmap;

import android.view.View;
import io.tinyleap.android.bitmap.TinyLeapBitmap;
import io.tinyleap.foundry.ui.fragments.ComponentDetailFragment;

public class GaussianBlurFilter extends BitmapFilterDetailFragment {

    @Override
    protected boolean useSlider1() {
        return false;
    }

    @Override
    protected boolean useSlider2() {
        return false;
    }

    @Override
    protected int slider1Max() {
        return 0;
    }


    @Override
    protected int slider2Max() {
        return 0;
    }

    @Override
    protected void processBitmap(TinyLeapBitmap bitmap) {

    }
}
