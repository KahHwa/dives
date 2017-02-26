package fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ricoardiya.dives.R;

import static com.example.ricoardiya.dives.R.layout;
import static com.example.ricoardiya.dives.R.layout.fragment_notification;


/**
 * Created by Rico Ardiya on 1/25/2017.
 */

public class NotificationFragment extends Fragment {
    // Array of strings...
    public String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(fragment_notification,container,false);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), layout.notification_listview, mobileArray);


        ListView listView = (ListView) rootView.findViewById(R.id.notification_list);
        listView.setAdapter(adapter);

        return rootView;
    }


}
