package fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ricoardiya.dives.R;

/**
 * Created by Rico Ardiya on 2/1/2017.
 */

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_profile,container,false);


        Button button = null;
        button = (Button) button.findViewById(R.id.bEditProfile);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

                android.app.FragmentManager fn = getFragmentManager();

                fn.beginTransaction().replace(R.id.content_frame, new EditProfileFragment()).commit();

            }
        });
        return rootView;


    }

}
