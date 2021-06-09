package com.example.universitykrasnodar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Result_aizek extends Fragment {
    private TextView resultat = null;
    private TextView resultat2 = null;
    private TextView resultat3 = null;


    private int result_of_test;
    private int intel_of_test;
    private int soc_of_test;
    private String ectr, nr, loz;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result_aizek, container, false);
        if (getArguments() != null && getArguments().containsKey("result_of_test")) {
            result_of_test = getArguments().getInt("result_of_test");
            intel_of_test = getArguments().getInt("intel_of_test");
            soc_of_test = getArguments().getInt("soc_of_test");
        } else {
            throw new IllegalArgumentException("Must be created through newInstance(...)");
        }
        initViews(view);
        setupUniversityInfo();

        return view;
    }

    private void initViews(View view) {
        resultat = view.findViewById(R.id.aizek);
        resultat2 = view.findViewById(R.id.aizek2);
        resultat3 = view.findViewById(R.id.aizek3);
    }
    @SuppressLint("SetTextI18n")
    private void setupUniversityInfo() {
        if (result_of_test >= 19){
            ectr = "яркий экстраверт";
        }
        if (result_of_test > 15 && result_of_test < 19){
            ectr = "экстраверт";
        }
        if (result_of_test > 12 && result_of_test <=15){
            ectr = "склонность к экстроверсии";
        }
        if (result_of_test > 9 && result_of_test <= 12){
            ectr = "склонность к интроверсии";
        }
        if (result_of_test > 5 && result_of_test <= 9){
            ectr = "интроверт";
        }
        if (result_of_test <= 5){
            ectr = "глубокий интроверт";
        }

        if (intel_of_test >= 19){
            nr = "очень высокий уровень нейротизма";
        }
        if (intel_of_test >= 13 && intel_of_test < 19){
            nr = "высокий уровень нейротизма";
        }
        if (intel_of_test >= 9 && intel_of_test < 13){
            nr = "среднее значение";
        }
        if (intel_of_test < 9){
            nr = "низкий уровень нейротизма";
        }

        if (soc_of_test >= 4){
            loz = "неискренность в ответах, свидетельствующая также о некоторой демонстративности поведения и ориентированности испытуемого на социальное одобрение";
        }
        if (soc_of_test < 4){
            loz = "нормальный уровень";
        }
        System.out.println(result_of_test);


        resultat.setText("Экстраверсия - интроверсия: " + ectr);
        resultat2.setText("Нейротизм: " + nr);
        resultat3.setText("Ложь: " + loz);
    }

}