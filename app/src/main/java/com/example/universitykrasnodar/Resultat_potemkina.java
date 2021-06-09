package com.example.universitykrasnodar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Resultat_potemkina extends Fragment {
    private TextView resultat = null;
    private TextView resultat2 = null;
    private TextView resultat3 = null;
    private TextView resultat4 = null;


    private int process_con_res;
    private int resultat_con_res;
    private int altruism_con_res;
    private int egoism_con_res;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultat_potemkina, container, false);
        if (getArguments() != null && getArguments().containsKey("result_of_test")) {
            process_con_res = getArguments().getInt("result_of_test");
            resultat_con_res = getArguments().getInt("intel_of_test");
            altruism_con_res = getArguments().getInt("soc_of_test");
            egoism_con_res = getArguments().getInt("kon_of_test");
        } else {
            throw new IllegalArgumentException("Must be created through newInstance(...)");
        }
        initViews(view);
        setupUniversityInfo();

        return view;
    }

    private void initViews(View view) {
        resultat = view.findViewById(R.id.pot1);
        resultat2 = view.findViewById(R.id.pot2);
        resultat3 = view.findViewById(R.id.pot3);
        resultat4 = view.findViewById(R.id.pot4);
    }
    @SuppressLint("SetTextI18n")
    private void setupUniversityInfo() {
        resultat.setText("Ориентация на процесс: " + process_con_res + "\nЧеловек имеет установку на процесс. В работе или другой деятельности ему важно, чтобы само занятие было интересным. Над достижением цели он относительно мало задумывается, поэтому, например, может опоздать со сдачей работы. А уж если процесс стал ему неинтересен, он может и вовсе забросить данное занятие, не задумываясь о последствиях. Но зато человеку с такой установкой легче справиться с задачей, где важен именно сам процесс, например, игра в театре.");
        resultat2.setText("Ориентация на результат: " + resultat_con_res + "\nЧеловек стремится достигать результата в своей деятельности вопреки всему – суете, помехам, неудачам... Он может входить в число самых надежных сотрудников. Но он может за стремлением к достижению результата забыть обо всем остальном, например, кому-то ненамеренно навредить или просто сделать дело быстро, но некрасиво («проехать на бульдозере»).");
        resultat3.setText("Ориентация на альтруизм: " + altruism_con_res + "\nЧеловек имеет установку на альтруизм, на то, чтобы действовать прежде всего на пользу другим, часто в ущерб себе (и делу). Это люди, о которых стоит позаботиться. Альтруизм – наиболее ценная общественная мотивация, наличие которой отличает зрелого человека. Традиционно эта установка считается ценной, а человек, обладающий ею, – заслуживающим всяческого уважения. Действительно, наверное, величайшие деяния добра совершались из альтруизма – но и зла, заметим, тоже. Альтруист может быть весьма опасен для себя и окружающих, когда начинает самоотверженно загонять человечество (или просто семью или группу) в счастье. Но если он не позволяет себе такого, то может быть чрезвычайно полезен окружающим и при этом чувствовать себя от этого счастливым вне зависимости от личного положения. Хотя подпускать его, скажем, к финансовому управлению коммерческой организацией опасно... Если же альтруизм чрезмерно вредит, он, хотя и может казаться неразумным, но приносит счастье.");
        resultat4.setText("Ориентация на эгоизм: " + egoism_con_res + "\nЧеловек сосредоточен в основном на своих личных интересах. Это не обязательно означает, что его интересы сводятся к материальной выгоде – просто при принятии решений он весьма серьезно учитывает то, как их последствия отразятся на нем лично. Обладать такой установкой могут как злобный вор и скряга, так и просто вполне моральный и добрый человек, придерживающийся разумного эгоизма. Люди с чрезмерно выраженным эгоизмом встречаются довольно редко. Известная доля разумного эгоизма не может навредить человеку. Скорее, более вредит его отсутствие, причем это среди людей интеллигентных профессий встречается довольно часто.");
    }}