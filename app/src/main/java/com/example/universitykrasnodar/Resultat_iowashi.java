package com.example.universitykrasnodar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Resultat_iowashi extends Fragment {
    private TextView resultat = null;
    private TextView resultat2 = null;
    private TextView resultat3 = null;
    private TextView resultat4 = null;
    private TextView resultat5 = null;
    private TextView resultat6 = null;


    private int result_of_test;
    private int intel_of_test;
    private int soc_of_test;
    private int kon_of_test;
    private int pred_of_test;
    private int artist_of_test;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultat_iowashi, container, false);
        if (getArguments() != null && getArguments().containsKey("result_of_test")) {
            result_of_test = getArguments().getInt("result_of_test");
            intel_of_test = getArguments().getInt("intel_of_test");
            soc_of_test = getArguments().getInt("soc_of_test");
            kon_of_test = getArguments().getInt("kon_of_test");
            pred_of_test = getArguments().getInt("pred_of_test");
            pred_of_test = getArguments().getInt("pred_of_test");
            artist_of_test = getArguments().getInt("artist_of_test");
        } else {
            throw new IllegalArgumentException("Must be created through newInstance(...)");
        }
        initViews(view);
        setupUniversityInfo();

        return view;
    }
    private void initViews(View view) {
        resultat = view.findViewById(R.id.iowashi1);
        resultat2 = view.findViewById(R.id.iowashi2);
        resultat3 = view.findViewById(R.id.iowashi3);
        resultat4 = view.findViewById(R.id.iowashi4);
        resultat5 = view.findViewById(R.id.iowashi5);
        resultat6 = view.findViewById(R.id.iowashi6);
    }
    @SuppressLint("SetTextI18n")
    private void setupUniversityInfo() {
        resultat.setText("Cфера искусства: " + pred_of_test +"\nЧеловек,  выбирающий  такиепрофессии,  должен  обладать  тонким  художественным  вкусом,  способностями  к  художест-венной творческой деятельности, развитыми эстетическими чувствами. Это должен быть на-блюдательный  человек,  с  хорошей  зрительной  памятью,  с  развитым  наглядно-образныммышлением и творческим воображением.\n");
        resultat2.setText("Cфера технических интересов: " + soc_of_test + "\nТребует от человека, выбирающеготакие  профессии,  технического  и  творческого  мышления,  наблюдательности,  координациидвижений,  хорошей  оперативной  памяти,  логичности,  доказательности,  практичности,  лако-ничности в речи, целеустремленности, трудолюбия и организованности.\n");
        resultat3.setText("Cфера работы с людьми: " + result_of_test + "\nЧтобы успешно справляться с профессия-ми  такой  группы,  необходимо  быть  общительным,  доброжелательным  и  отзывчивым,  отли-чаться выдержкой, тактом, воспитанностью, обладать хорошо развитой речью, уметь глубо-ко чувствовать и переживать.\n");
        resultat4.setText("Cфера умственного труда: " + intel_of_test + "\nСклонность к умственной деятельности. Данные профес-сии  требуют  от  человека  точности  восприятия,  умения  концентрировать  и  сосредоточиватьвнимание, хорошей памяти, аккуратности в своих действиях, большого трудолюбия.\n");
        resultat5.setText("Cфера физического труда: " + kon_of_test + "\nСклонность  к  подвижной  (физической)  деятельности. Человек, выбирающий такие профессии, должен быть выносливым, трудолюбивым, энергич-ным, предприимчивым, практичным, уметь быстро восстанавливать свои силы.\n");
        resultat6.setText("Cфера материальных интересов: " + kon_of_test + "\nПроизводство  и  предоставление  материальныхблаг. Человек, выбирающий такие профессии, должен быть, в первую очередь, организован-ным, целеустремленным, наблюдательным, коммуникабельным, обладать умением заботить-ся о других людях и практической хваткой.");
    }
}