package com.example.universitykrasnodar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Resultat extends Fragment {
    private TextView resultat = null;
    private TextView resultat2 = null;
    private TextView resultat3 = null;
    private TextView resultat4 = null;
    private TextView resultat5 = null;
    private TextView resultat6 = null;
    private LinearLayout rek_fuk = null;


    private int result_of_test;
    private int intel_of_test;
    private int soc_of_test;
    private int kon_of_test;
    private int pred_of_test;
    private int artist_of_test;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultat, container, false);
        if (getArguments() != null && getArguments().containsKey("result_of_test")) {
            result_of_test = getArguments().getInt("result_of_test");
            intel_of_test = getArguments().getInt("intel_of_test");
            soc_of_test = getArguments().getInt("soc_of_test");
            kon_of_test = getArguments().getInt("kon_of_test");
            pred_of_test = getArguments().getInt("pred_of_test");
            artist_of_test = getArguments().getInt("artist_of_test");
        } else {
            throw new IllegalArgumentException("Must be created through newInstance(...)");
        }
        initViews(view);
        setupUniversityInfo();

        return view;
    }


    private LinearLayout createFacultyLinearLayout() {
        Context context = getContext();
        int id = View.generateViewId();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(7, 10, 7, 10);
        if (context == null) return null;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundResource(R.drawable.style_main_shape);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(id);

        return linearLayout;
    }


    private void initViews(View view) {
        resultat = view.findViewById(R.id.textView2);
        resultat2 = view.findViewById(R.id.textView8);
        resultat3 = view.findViewById(R.id.textView9);
        resultat4 = view.findViewById(R.id.textView10);
        resultat5 = view.findViewById(R.id.textView11);
        resultat6 = view.findViewById(R.id.textView12);
    }
    @SuppressLint("SetTextI18n")
    private void setupUniversityInfo() {
        resultat.setText("Реалистический тип: " + result_of_test);
        resultat2.setText("Интеллектуальный тип: " + intel_of_test);
        resultat3.setText("Социальный тип: " + soc_of_test);
        resultat4.setText("Конвенциальный тип: " + kon_of_test);
        resultat5.setText("Предприимчивый тип: " + pred_of_test);
        resultat6.setText("Артистичный тип: " + artist_of_test);
    }




}