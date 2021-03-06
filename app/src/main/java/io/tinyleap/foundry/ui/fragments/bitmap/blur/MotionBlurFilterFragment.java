package io.tinyleap.foundry.ui.fragments.bitmap.blur;

import io.tinyleap.bitmap.TinyLeapBitmap;
import io.tinyleap.bitmap.filters.BlurFilters;
import io.tinyleap.foundry.ui.fragments.bitmap.BitmapFilterDetailFragment;

public class MotionBlurFilterFragment extends BitmapFilterDetailFragment {

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
    protected String slider1Name() {
        return "X Speed";
    }


    @Override
    protected int slider2Max() {
        return 100;
    }

    @Override
    protected String slider2Name() {
        return "Y Speed";

    }

    @Override
    protected void processBitmap(TinyLeapBitmap bitmap) {
        BlurFilters.motionBlurNative(bitmap,mSeekbar1.getProgress(),mSeekbar2.getProgress());
    }
}
