package io.tinyleap.foundry.ui.fragments.bitmap.blur;

import io.tinyleap.bitmap.TinyLeapBitmap;
import io.tinyleap.bitmap.filters.BlurFilters;
import io.tinyleap.foundry.ui.fragments.bitmap.BitmapFilterDetailFragment;

public class AverageBlurFilterFragment extends BitmapFilterDetailFragment {

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
        return "Mask Size";
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
        int masksize=mSeekbar1.getProgress()%2==0?mSeekbar1.getProgress()+1:mSeekbar1.getProgress();
        BlurFilters.averageBlurNative(bitmap,masksize);
    }
}
