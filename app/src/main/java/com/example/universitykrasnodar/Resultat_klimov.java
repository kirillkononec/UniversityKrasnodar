package com.example.universitykrasnodar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Resultat_klimov extends Fragment {
    private TextView resultat = null;
    private TextView resultat2 = null;
    private TextView resultat3 = null;
    private TextView resultat4 = null;
    private TextView resultat5 = null;


    private int result_of_test;
    private int intel_of_test;
    private int soc_of_test;
    private int kon_of_test;
    private int pred_of_test;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultat_klimov, container, false);
        if (getArguments() != null && getArguments().containsKey("result_of_test")) {
            result_of_test = getArguments().getInt("result_of_test");
            intel_of_test = getArguments().getInt("intel_of_test");
            soc_of_test = getArguments().getInt("soc_of_test");
            kon_of_test = getArguments().getInt("kon_of_test");
            pred_of_test = getArguments().getInt("pred_of_test");
        } else {
            throw new IllegalArgumentException("Must be created through newInstance(...)");
        }
        initViews(view);
        setupUniversityInfo();
        return view;
    }

    private void initViews(View view) {
        resultat = view.findViewById(R.id.klimov1);
        resultat2 = view.findViewById(R.id.klimov2);
        resultat3 = view.findViewById(R.id.klimov3);
        resultat4 = view.findViewById(R.id.klimov4);
        resultat5 = view.findViewById(R.id.klimov5);
    }
    @SuppressLint("SetTextI18n")
    private void setupUniversityInfo() {
        resultat.setText("Человек — природа: " + pred_of_test + "\nСюда входят профессии, в которых человек имеет дело с различными явлениями неживой и живой природы, например биолог, географ, геолог, математик, физик, химик и другие профессии, относящиеся к разряду естественных наук.");
        resultat2.setText("Человек — техника: " + soc_of_test + "\nВ эту группу профессий включены различные виды трудовой деятельности, в которых человек  имеет дело с техникой, её использованием или конструированием, например профессия инженера, оператора, машиниста, механизатора, сварщика и т.п.");
        resultat3.setText("Человек — человек: " + result_of_test + "\nСюда включены все виды профессий, предполагающих взаимодействие людей, например политика, религия, педагогика, психология, медицина, торговля, право.");
        resultat4.setText("Человек — знаковая система: " + intel_of_test + "\nВ эту группу включены профессии, касающиеся создания, изучения и использования различных знаковых систем, например лингвистика, языки математического программирования, способы графического представления результатов наблюдений и т.п.");
        resultat5.setText("Человек — художественный образ: " + kon_of_test + "\nЭта группа профессий представляет собой различные виды художественно-творческого труда, например литература, музыка, театр, изобразительное искусство.");
    }

}