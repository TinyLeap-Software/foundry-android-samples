package io.tinyleap.foundry.ui.fragments.bitmap.blur;

import android.view.View;
import io.tinyleap.android.bitmap.TinyLeapBitmap;
import io.tinyleap.bitmap.filters.BlurFilters;
import io.tinyleap.foundry.ui.fragments.ComponentDetailFragment;
import io.tinyleap.foundry.ui.fragments.bitmap.BitmapFilterDetailFragment;

public class GaussianBlurFilterFragment extends BitmapFilterDetailFragment {

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
        return "Radius";
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
        BlurFilters.gaussianBlur(bitmap,mSeekbar1.getProgress(),true,true);
    }
}
