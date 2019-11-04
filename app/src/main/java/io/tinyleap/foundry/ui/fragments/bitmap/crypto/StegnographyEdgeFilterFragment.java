package io.tinyleap.foundry.ui.fragments.bitmap.crypto;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import io.tinyleap.bitmap.AndroidBitmap;
import io.tinyleap.bitmap.filters.crypto.Steganography;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.ui.fragments.ComponentDetailFragment;

public class StegnographyEdgeFilterFragment extends ComponentDetailFragment {


    @Override
    protected int getChildLayout() {
        return R.layout.fragment_bitmap_crypto;
    }

    @Override
    protected void setupUI(View view) {
        final Bitmap bitmap=BitmapFactory.decodeResource(getResources(),R.drawable.sky);
        final AndroidBitmap tBitmap=new AndroidBitmap(bitmap);
        final ImageView image=view.findViewById(R.id.image);
        final EditText text=view.findViewById(R.id.text);
        Button button=view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Steganography.encodeMessage(tBitmap,text.getText().toString());
                image.setImageBitmap(tBitmap.getBitmap());
            }
        });
    }
}
