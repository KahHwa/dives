package fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.ricoardiya.dives.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static android.R.attr.fragment;
import static com.example.ricoardiya.dives.R.layout.fragment_message;
import static com.example.ricoardiya.dives.R.layout.fragment_upcoming;

/**
 * Created by Rico Ardiya on 1/25/2017.
 */

public class MessageFragment extends Fragment {

    // Array of strings...
//    public String[] mobileArray = {"You got a new message from Google ",
//            "You got a new message from Seagate"
//    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(fragment_message,container,false);

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.message_listview, R.id.label_message, mobileArray);
//
//
//        ListView listView = (ListView) rootView.findViewById(R.id.message_list);
//        listView.setAdapter(adapter);

        ListView resultsListView = (ListView) rootView.findViewById(R.id.message_list);

        HashMap<String, String> message = new HashMap<>();
        message.put("Seagate", "Dear Henrikus");
        message.put("Mediatek", "Dear Henrikus");

        List<HashMap<String, String>> ListItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), ListItems, R.layout.message_listview,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.label_message, R.id.sublist_message});

        Iterator it = message.entrySet().iterator();
        while (it.hasNext())
        {
            HashMap<String, String> resultsMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultsMap.put("First Line", pair.getKey().toString());
            resultsMap.put("Second Line", pair.getValue().toString());
            ListItems.add(resultsMap);
        }
        resultsListView.setAdapter(adapter);
        return rootView;
    }
}
