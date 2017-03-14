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

import static com.example.ricoardiya.dives.R.layout.fragment_message;
import static com.example.ricoardiya.dives.R.layout.fragment_upcoming;

/**
 * Created by Rico Ardiya on 1/25/2017.
 */

public class MessageFragment extends Fragment {

    // Array of strings...
    public String[] mobileArray = {"You got a new message from Google ",
            "You got a new message from Seagate"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(fragment_message,container,false);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.message_listview, R.id.label_message, mobileArray);


        ListView listView = (ListView) rootView.findViewById(R.id.message_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
