package materialdesign.df29.lumiere.materialdesign.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import materialdesign.df29.lumiere.materialdesign.R;
import materialdesign.df29.lumiere.materialdesign.activity.SimpleTab.ManyTabAct;
import materialdesign.df29.lumiere.materialdesign.activity.SimpleTab.TabAct;

/**
 * Created by Lumiere on 3/2/2016.
 */
public class FriendsFragment extends Fragment {

    Button btnSimpleTab, btnSimpleManyTab;

    public FriendsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_friend, container, false);
        btnSimpleTab = (Button) rootView.findViewById(R.id.btnSimpleTab);
        btnSimpleManyTab = (Button) rootView.findViewById(R.id.btnSimpleManyTab);

        btnSimpleTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), TabAct.class);
                startActivity(i);
            }
        });

        btnSimpleManyTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ManyTabAct.class);
                startActivity(i);
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
