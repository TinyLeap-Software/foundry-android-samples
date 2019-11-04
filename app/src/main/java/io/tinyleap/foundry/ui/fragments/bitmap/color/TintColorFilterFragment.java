package io.tinyleap.foundry.ui.fragments.bitmap.color;

import io.tinyleap.bitmap.TinyLeapBitmap;
import io.tinyleap.bitmap.filters.BlurFilters;
import io.tinyleap.bitmap.filters.ColorFilters;
import io.tinyleap.foundry.ui.fragments.bitmap.BitmapFilterDetailFragment;

public class TintColorFilterFragment extends BitmapFilterDetailFragment {

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
        return "Degree";
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
        ColorFilters.tint(bitmap,mSeekbar1.getProgress());
    }
}
