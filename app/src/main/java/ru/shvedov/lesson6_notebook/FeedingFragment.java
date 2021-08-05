package ru.shvedov.lesson6_notebook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FeedingFragment extends Fragment {

    public static String ARG_ANIMAL = "animal";
    private Animal animal;

    public static FeedingFragment newInstance(Animal animal){
        FeedingFragment fragment = new FeedingFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_ANIMAL, animal);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!= null){
            this.animal = getArguments().getParcelable(ARG_ANIMAL);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feeding, container, false);
        TextView textView = view.findViewById(R.id.feeding);
        textView.setText(this.animal.getName());
        return view;
    }
}
