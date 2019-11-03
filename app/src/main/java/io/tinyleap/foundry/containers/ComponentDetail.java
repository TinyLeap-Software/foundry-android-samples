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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComponentDetail that = (ComponentDetail) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return contentTitle != null ? contentTitle.equals(that.contentTitle) : that.contentTitle == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (contentTitle != null ? contentTitle.hashCode() : 0);
        return result;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public String getContentDescription() {
        return contentDescription;
    }
}
