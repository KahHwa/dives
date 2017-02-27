package fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ricoardiya.dives.R;

import static com.example.ricoardiya.dives.R.layout.fragment_notification;
import static com.example.ricoardiya.dives.R.layout.fragment_upcoming;

/**
 * Created by Rico Ardiya on 1/25/2017.
 */

public class UpComingFragment extends Fragment{

    // Array of strings...
    public String[] mobileArray = {"job fair by Nanyang Technological University ",
            "Seminar by Microsoft"

    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(fragment_upcoming,container,false);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.upcoming_listview, R.id.label_upcoming, mobileArray);


        ListView listView = (ListView) rootView.findViewById(R.id.upcoming_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
