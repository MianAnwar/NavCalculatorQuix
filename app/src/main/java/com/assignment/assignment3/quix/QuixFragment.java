package com.assignment.assignment3.quix;

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

import com.assignment.assignment3.R;

public class QuixFragment extends Fragment {

    private QuixViewModel quixViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        quixViewModel =
                ViewModelProviders.of(this).get(QuixViewModel.class);
        View root = inflater.inflate(R.layout.fragment_quix, container, false);

        return root;
    }
}
