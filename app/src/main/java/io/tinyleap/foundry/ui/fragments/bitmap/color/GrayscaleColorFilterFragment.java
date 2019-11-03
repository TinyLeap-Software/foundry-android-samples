package io.tinyleap.foundry.ui.fragments.bitmap.color;

import io.tinyleap.android.bitmap.TinyLeapBitmap;
import io.tinyleap.bitmap.filters.ColorFilters;
import io.tinyleap.foundry.ui.fragments.bitmap.BitmapFilterDetailFragment;

public class GrayscaleColorFilterFragment extends BitmapFilterDetailFragment {

    @Override
    protected boolean useSlider1() {
        return true;
    }

    @Override
    protected boolean useSlider2() {
        return false;
    }

    @Override
    protected int slider1Max() {
        return 100;
    }

    @Override
    protected String slider1Name() {
        return "Saturation";
    }


    @Override
    protected int slider2Max() {
        return 0;
    }

    @Override
    protected String slider2Name() {
        return null;
    }

    @Override
    protected void processBitmap(TinyLeapBitmap bitmap) {
        ColorFilters.grayScale(bitmap,mSeekbar1.getProgress());
    }
}
