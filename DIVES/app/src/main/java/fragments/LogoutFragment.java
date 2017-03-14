package fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ricoardiya.dives.EditProfileActivity;
import com.example.ricoardiya.dives.LoginActivity;
import com.example.ricoardiya.dives.R;
import com.example.ricoardiya.dives.SignupActivity;

/**
 * Created by Rico Ardiya on 2/1/2017.
 */

public class LogoutFragment extends Fragment {

    public Button bLogOut;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_logout,container,false);

        bLogOut = (Button) rootView.findViewById(R.id.bLogOut);

        bLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent login = new Intent(getActivity(),LoginActivity.class);

                startActivity(login);
            }

        });

        return rootView;
    }
}
