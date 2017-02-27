package fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ricoardiya.dives.R;

import static com.example.ricoardiya.dives.R.layout.fragment_feed;

/**
 * Created by Rico Ardiya on 1/23/2017.
 */

public class FeedFragment extends Fragment {

    // Array of strings...
    public String[] mobileArray = {"Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",
            "Job fair by Nanyang Technological University",

    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(fragment_feed,container,false);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.feed_listview, R.id.label, mobileArray);


        ListView listView = (ListView) rootView.findViewById(R.id.feed_list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
