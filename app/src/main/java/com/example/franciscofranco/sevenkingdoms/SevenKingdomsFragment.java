package com.example.franciscofranco.sevenkingdoms;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SevenKingdomsFragment extends Fragment {

    private ArrayList<String> sevenKingdoms;
    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    public static final String CURRENT_RULER = "currentRuler";

    public SevenKingdomsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seven_kingdoms, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        instantiateSevenKingdoms();

        arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,
                sevenKingdoms);

        listView = (ListView) getView().findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("FRANCO_DEBUG", sevenKingdoms.get(position));
                Intent intent = new Intent(getActivity(), CurrentRuler.class);
                intent.putExtra(CURRENT_RULER, sevenKingdoms.get(position));
                startActivity(intent);
            }
        });

        listView.setAdapter(arrayAdapter);

    }

    private void instantiateSevenKingdoms() {
        sevenKingdoms = new ArrayList<String>();
        sevenKingdoms.add("Stark of Winterfell");
        sevenKingdoms.add("Tully of Riverrun");
        sevenKingdoms.add("Arryn of the Eyrie");
        sevenKingdoms.add("Lannister of Casterly Rock");
        sevenKingdoms.add("Baratheon of Storm's End");
        sevenKingdoms.add("Tyrell of Highgarden");
        sevenKingdoms.add("Martell of Sunspear");
    }
}
