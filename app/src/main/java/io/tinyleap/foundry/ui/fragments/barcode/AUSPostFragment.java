package io.tinyleap.foundry.ui.fragments.barcode;

import android.text.TextUtils;
import android.widget.EditText;
import io.tinyleap.barcode.BarcodeType;

public class AUSPostFragment extends EncodeQRFragment {

    protected void setText(EditText text){
        text.setText("FoundryforAndroid");
    }
    protected boolean isTextValid(String text){
        if(TextUtils.isEmpty(text)){
            return false;
        }
        return true;
    }

    protected BarcodeType getBarcodeType(){
        return BarcodeType.AUSPOST;
    }
}
