package io.tinyleap.foundry.containers;

import androidx.fragment.app.Fragment;

public class ComponentDetail {
    private String id;
    private String contentTitle;
    private String contentDescription;
    private Class<? extends Fragment> fragmentClass;

    public ComponentDetail(String id, String title, String description, Class<? extends Fragment> fragmentClass) {
        this.id = id;
        this.contentTitle = title;
        this.contentDescription = description;
        this.fragmentClass = fragmentClass;
    }

    public String getId() {
        return id;
    }

    public Class<? extends Fragment> getFragmentClass() {
        return fragmentClass;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public String getContentDescription() {
        return contentDescription;
    }
}
