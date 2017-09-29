package kata.bfwi315b.fhdw.de.katafragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Mulle on 28.09.2017.
 */

public class FragmentThree extends Fragment{

    private TextView myTextCViewParameterThree;

    //gets called by creating a new instance
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //creates the view that belongs to the layout

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.test_fragment_three, container, false);
        myTextCViewParameterThree = layout.findViewById(R.id.textView32);
        return layout;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
