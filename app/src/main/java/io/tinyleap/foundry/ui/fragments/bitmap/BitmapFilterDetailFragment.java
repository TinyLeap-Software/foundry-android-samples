package io.tinyleap.foundry.ui.fragments.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import io.tinyleap.bitmap.AndroidBitmap;
import io.tinyleap.bitmap.TinyLeapBitmap;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.ui.fragments.ComponentDetailFragment;

public abstract class BitmapFilterDetailFragment extends ComponentDetailFragment {
    protected SeekBar mSeekbar1;
    protected SeekBar mSeekbar2;
    @Override
    protected int getChildLayout() {
        return R.layout.fragment_bitmap_filters;
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
        final Bitmap bitmap=BitmapFactory.decodeResource(getResources(),R.drawable.sky);
        final AndroidBitmap tBitmap=new AndroidBitmap(bitmap);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processBitmap(tBitmap);
                image.setImageBitmap(tBitmap.getBitmap());
            }
        });
    }

    protected abstract boolean useSlider1();
    protected abstract boolean useSlider2();
    protected abstract int slider1Max();
    protected abstract String slider1Name();
    protected abstract int slider2Max();
    protected abstract String slider2Name();

    protected abstract void processBitmap(TinyLeapBitmap bitmap);
}
