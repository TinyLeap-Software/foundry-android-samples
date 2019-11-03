package io.tinyleap.foundry.ui.fragments.barcode;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.snackbar.Snackbar;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.ui.fragments.ComponentDetailFragment;

import io.tinyleap.barcode.BarcodeType;
import io.tinyleap.barcode.zint.BarcodeWriter;
import io.tinyleap.foundry.util.UIUtils;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class EncodeQRFragment extends ComponentDetailFragment {


    @Override
    protected int getChildLayout() {
        return R.layout.fragment_encode_barcode;
    }

    @Override
    protected void setupUI(final View view) {

        final ImageView iv=view.findViewById(R.id.barcode);
        final EditText text=view.findViewById(R.id.text);
        setText(text);
        Button btn=view.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UIUtils.hideKeyboard(getActivity());
                String code=text.getText().toString();
                if(isTextValid(code)) {
                    Map<BarcodeWriter.EncodeHints, Integer> hints = new HashMap<BarcodeWriter.EncodeHints, Integer>();
                    hints.put(BarcodeWriter.EncodeHints.HEIGHT, 500);
                    hints.put(BarcodeWriter.EncodeHints.WIDTH, 500);
                    hints.put(BarcodeWriter.EncodeHints.BG_COLOR, 0xFFFFFFFF);
                    hints.put(BarcodeWriter.EncodeHints.FG_COLOR, getResources().getColor(R.color.colorPrimary));
                    try {
                        Bitmap bm = BarcodeWriter.encode(getActivity(), getBarcodeType(), text.getText().toString(), hints);
                        iv.setImageBitmap(bm);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else{
                    Snackbar.make(view, "Text for "+getBarcodeType()+" barcode is not valid", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });


    }

    protected void setText(EditText text){
        text.setText("Foundry for Android");
    }


    protected boolean isTextValid(String text){
        if(TextUtils.isEmpty(text)){
            return false;
        }
        return true;
    }

    protected BarcodeType getBarcodeType(){
        return BarcodeType.QR_CODE;
    }
}
