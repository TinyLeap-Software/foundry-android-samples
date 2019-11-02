package io.tinyleap.foundry.util;

import android.util.Log;
import androidx.fragment.app.Fragment;

public class UIUtils {

    public static Fragment getFragment(Class<? extends androidx.fragment.app.Fragment> clz){
        try {
            return clz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
