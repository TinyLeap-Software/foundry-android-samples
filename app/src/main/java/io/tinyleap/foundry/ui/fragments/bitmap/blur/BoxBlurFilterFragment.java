package io.tinyleap.foundry.ui.fragments.bitmap.blur;

import io.tinyleap.android.bitmap.TinyLeapBitmap;
import io.tinyleap.bitmap.filters.BlurFilters;
import io.tinyleap.foundry.ui.fragments.bitmap.BitmapFilterDetailFragment;
;

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
    protected String slider1Name() {
        return "H-Radius";
    }

    @Override
    protected int slider2Max() {
        return 100;
    }

    @Override
    protected String slider2Name() {
        return "V-Radius";
    }

    @Override
    protected void processBitmap(TinyLeapBitmap bitmap) {
        BlurFilters.boxBlur(bitmap,mSeekbar1.getProgress(),mSeekbar2.getProgress(),1,true);
    }
}
