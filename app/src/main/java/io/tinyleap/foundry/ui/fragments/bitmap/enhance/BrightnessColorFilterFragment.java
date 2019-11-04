package io.tinyleap.foundry.ui.fragments.bitmap.enhance;

import io.tinyleap.bitmap.TinyLeapBitmap;
import io.tinyleap.bitmap.filters.ColorFilters;
import io.tinyleap.bitmap.filters.EnhancementFilters;
import io.tinyleap.foundry.ui.fragments.bitmap.BitmapFilterDetailFragment;

public class BrightnessColorFilterFragment extends BitmapFilterDetailFragment {

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
        return "Brightness";
    }


    @Override
    protected int slider2Max() {
        return 100;
    }

    @Override
    protected String slider2Name() {
        return "Contrast";
    }

    @Override
    protected void processBitmap(TinyLeapBitmap bitmap) {
        EnhancementFilters.setBrightnessAndContrast(bitmap,mSeekbar1.getProgress(),mSeekbar2.getProgress());
    }
}
