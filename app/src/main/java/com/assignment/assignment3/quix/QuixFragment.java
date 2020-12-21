package com.assignment.assignment3.quix;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.assignment.assignment3.Question1;
import com.assignment.assignment3.R;

public class QuixFragment extends Fragment {

    private QuixViewModel quixViewModel;
    private  TextView textView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        quixViewModel =
                ViewModelProviders.of(this).get(QuixViewModel.class);
        View root = inflater.inflate(R.layout.fragment_quix, container, false);

        textView = (TextView)root.findViewById(R.id.textView5);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Question1.class);
                startActivity(i);
                // this.finish();
            }
        });
        return root;
    }
}
