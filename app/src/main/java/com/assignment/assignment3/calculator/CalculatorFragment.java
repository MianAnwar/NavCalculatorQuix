package com.assignment.assignment3.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.assignment.assignment3.R;
import com.assignment.assignment3.quix.QuixViewModel;

public class CalculatorFragment extends Fragment {
    private CalcluatorViewModel calcluatorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        calcluatorViewModel =
                ViewModelProviders.of(this).get(CalcluatorViewModel.class);
        View root = inflater.inflate(R.layout.fagment_calculator, container, false);

        return root;
}
}
