package com.example.universitykrasnodar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Resultat_sheina extends Fragment {
    private TextView resultat = null;
    private TextView resultat2 = null;
    private TextView resultat3 = null;
    private TextView resultat4 = null;
    private TextView resultat5 = null;
    private TextView resultat6 = null;
    private TextView resultat7= null;
    private TextView resultat8 = null;
    private TextView resultat9 = null;

    private int prof_con;
    private int men_con;
    private int avt_con;
    private int stab_con;
    private int stab_mesto_con;
    private int sluzh_con;
    private int vizov_con;
    private int integr_con;
    private int pred_con;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultat_sheina, container, false);
        if (getArguments() != null && getArguments().containsKey("prof_con_of_test")) {
            prof_con = getArguments().getInt("prof_con_of_test");
            men_con = getArguments().getInt("men_con_of_test");
            avt_con = getArguments().getInt("avt_con_of_test");
            stab_con = getArguments().getInt("stab_con_of_test");
            stab_mesto_con = getArguments().getInt("stab_mesto_con_of_test");
            sluzh_con = getArguments().getInt("sluzh_con_of_test");
            vizov_con = getArguments().getInt("vizov_con_of_test");
            integr_con = getArguments().getInt("integr_con_of_test");
            pred_con = getArguments().getInt("pred_con_of_test");
        } else {
            throw new IllegalArgumentException("Must be created through newInstance(...)");
        }
        initViews(view);
        setupUniversityInfo();

        return view;
    }

    private void initViews(View view) {
        resultat = view.findViewById(R.id.shein1);
        resultat2 = view.findViewById(R.id.shein2);
        resultat3 = view.findViewById(R.id.shein3);
        resultat4 = view.findViewById(R.id.shein4);
        resultat5 = view.findViewById(R.id.shein5);
        resultat6 = view.findViewById(R.id.shein6);
        resultat7 = view.findViewById(R.id.shein7);
        resultat8 = view.findViewById(R.id.shein8);
        resultat9 = view.findViewById(R.id.shein9);
    }
    @SuppressLint("SetTextI18n")
    private void setupUniversityInfo() {
        resultat.setText("Профессиональная компетентность: " + prof_con);
        resultat2.setText("Менеджмент: " + men_con);
        resultat3.setText("Автономия: " + avt_con);
        resultat4.setText("Стабильность работы: " + stab_con);
        resultat5.setText("Стабильность места жительства: " + stab_mesto_con);
        resultat6.setText("Служение: " + sluzh_con);
        resultat7.setText("Вызов: " + vizov_con);
        resultat8.setText("Интеграция стилей жизни: " + integr_con);
        resultat9.setText("Предпринимательство: " + pred_con);
    }}