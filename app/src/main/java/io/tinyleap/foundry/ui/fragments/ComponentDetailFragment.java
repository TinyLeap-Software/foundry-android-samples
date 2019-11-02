package io.tinyleap.foundry.ui.fragments;

import android.app.Activity;
import android.widget.LinearLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.tinyleap.foundry.ItemDetailActivity;
import io.tinyleap.foundry.ItemListActivity;
import io.tinyleap.foundry.R;
import io.tinyleap.foundry.containers.ComponentContent;
import io.tinyleap.foundry.containers.ComponentDetail;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public abstract class ComponentDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_TITLE = "title";
    public static final String ARG_DESC = "description";
    public static final String ARG_CLASS = "class";
    private String title;
    private String description;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ComponentDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null && getArguments().containsKey(ARG_TITLE)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            title = getArguments().getString(ARG_TITLE);
            if( getArguments().containsKey(ARG_DESC)){
                description= getArguments().getString(ARG_DESC);
            }
            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout =  activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(title);
            }

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);
        // Show the dummy content as text in a TextView.
        if (description != null) {
            ((TextView) rootView.findViewById(R.id.item_detail)).setText(description);
        }
        LinearLayout parent=rootView.findViewById(R.id.content);
        addChildContent(inflater,parent);

        return rootView;
    }

    protected abstract void addChildContent(LayoutInflater inflater,ViewGroup parent);

}
