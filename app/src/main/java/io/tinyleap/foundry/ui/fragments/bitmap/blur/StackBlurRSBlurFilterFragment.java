package io.tinyleap.foundry.ui.fragments.bitmap.blur;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import io.tinyleap.bitmap.TinyLeapBitmap;
import io.tinyleap.bitmap.filters.BlurFilters;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.ui.fragments.bitmap.BitmapFilterDetailFragment;

public class StackBlurRSBlurFilterFragment extends BitmapFilterDetailFragment {

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
        return 25;
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
        int masksize=mSeekbar1.getProgress()%2==0?mSeekbar1.getProgress()+1:mSeekbar1.getProgress();
        BlurFilters.averageBlurNative(bitmap,masksize);
    }
    @Override
    protected void setupUI(View view) {
        mSeekbar1=view.findViewById(R.id.seek1);
        mSeekbar2=view.findViewById(R.id.seekbar2);
        TextView tv1=view.findViewById(R.id.text1);
        TextView tv2=view.findViewById(R.id.text2);
        Button button=view.findViewById(R.id.button);
        final ImageView image=view.findViewById(R.id.image);
        if(!useSlider1()){
            tv1.setVisibility(View.GONE);
            mSeekbar1.setVisibility(View.GONE);
        }else{
            mSeekbar1.setMax(slider1Max());
            tv1.setText(slider1Name());
        }
        if(!useSlider2()){
            tv2.setVisibility(View.GONE);
            mSeekbar2.setVisibility(View.GONE);
        }else{
            mSeekbar2.setMax(slider2Max());
            tv2.setText(slider2Name());
        }
        final Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.sky);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap bm=BlurFilters.stackBlurRS(getContext(),bitmap,mSeekbar1.getProgress());
                image.setImageBitmap(bm);
            }
        });
    }
}
