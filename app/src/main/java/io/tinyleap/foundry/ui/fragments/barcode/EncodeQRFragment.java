package io.tinyleap.foundry.ui.fragments.barcode;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.containers.ComponentDetail;
import io.tinyleap.foundry.ui.fragments.ComponentDetailFragment;

import io.tinyleap.barcode.BarcodeType;
import io.tinyleap.barcode.zint.BarcodeWriter;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class EncodeQRFragment extends ComponentDetailFragment {


    @Override
    protected int getChildLayout() {
        return R.layout.fragment_encode_barcode;
    }

    @Override
    protected void setupUI(View view) {

        final ImageView iv=view.findViewById(R.id.barcode);
        final EditText text=view.findViewById(R.id.text);
        Button btn=view.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<BarcodeWriter.EncodeHints,Integer> hints=new HashMap<BarcodeWriter.EncodeHints, Integer>();
                hints.put(BarcodeWriter.EncodeHints.HEIGHT, 500 );
                hints.put(BarcodeWriter.EncodeHints.WIDTH, 500);
                hints.put(BarcodeWriter.EncodeHints.BG_COLOR, 0xFFFFFFFF);
                hints.put(BarcodeWriter.EncodeHints.FG_COLOR, getResources().getColor(R.color.colorPrimary));
                try {
                    Bitmap bm = BarcodeWriter.encode(getActivity(),BarcodeType.QR_CODE,text.getText().toString(), hints);
                    iv.setImageBitmap(bm);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


    }
}
