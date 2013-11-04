package com.alarm.fuse01126;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

 
public class MenuFragment extends ListFragment {
	final String[] menuEntries = { "Credit","AlarmPoolFragment","Friends" };
	final String[] fragments = { "com.alarm.fuse01126.InfoFragment","com.alarm.fuse01126.AlarmPoolFragment","com.alarm.fuse01126.Friends" };
    public static final String Slide_Menu_Item = "SlideMenuItem";
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        /** Creating an array adapter to store the list of countries **/
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1,menuEntries);
 
        /** Setting the list adapter for the ListFragment */
        setListAdapter(adapter);
 
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
