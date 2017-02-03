package fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ricoardiya.dives.LoginActivity;
import com.example.ricoardiya.dives.R;
import com.example.ricoardiya.dives.SignupActivity;

/**
 * Created by Rico Ardiya on 1/23/2017.
 */

public class FeedFragment extends Fragment {

    public Button bLogIn1;
    public Button bSignUp1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_feed,container,false);

        bLogIn1 = (Button) rootView.findViewById(R.id.bLogIn1);
        bSignUp1 = (Button) rootView.findViewById(R.id.bSignUp1);

        bLogIn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent login = new Intent(getActivity(),LoginActivity.class);

                startActivity(login);
            }

        });

        bSignUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signup = new Intent(getActivity(), SignupActivity.class);

                startActivity(signup);
            }

        });

        return rootView;
    }

}
