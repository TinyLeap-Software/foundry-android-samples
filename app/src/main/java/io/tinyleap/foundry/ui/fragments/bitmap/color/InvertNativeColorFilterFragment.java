//package io.tinyleap.foundry.ui.fragments.bitmap.color;
//
//import io.tinyleap.android.bitmap.TinyLeapBitmap;
//import io.tinyleap.bitmap.filters.ColorFilters;
//import io.tinyleap.foundry.ui.fragments.bitmap.BitmapFilterDetailFragment;
//
//public class InvertNativeColorFilterFragment extends BitmapFilterDetailFragment {
//
//    @Override
//    protected boolean useSlider1() {
//        return false;
//    }
//
//    @Override
//    protected boolean useSlider2() {
//        return false;
//    }
//
//    @Override
//    protected int slider1Max() {
//        return 0;
//    }
//
//    @Override
//    protected String slider1Name() {
//        return "";
//    }
//
//
//    @Override
//    protected int slider2Max() {
//        return 0;
//    }
//
//    @Override
//    protected String slider2Name() {
//        return null;
//    }
//
//    @Override
//    protected void processBitmap(TinyLeapBitmap bitmap) {
//        ColorFilters.invertNative(bitmap);
//    }
//}
