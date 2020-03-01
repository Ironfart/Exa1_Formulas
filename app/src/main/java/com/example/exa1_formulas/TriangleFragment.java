package com.example.exa1_formulas;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TriangleFragment extends Fragment {

    EditText txtBase, txtH;

    MainActivity main;

    public TriangleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout frameLayout= (LinearLayout) inflater.inflate(R.layout.fragment_triangle, container, false);
        txtBase = frameLayout.findViewById(R.id.edTxtTriBase);
        txtH = frameLayout.findViewById(R.id.edTxtTriH);
        Button btn = frameLayout.findViewById(R.id.btnTriCalc);
        final TextView txtRes = frameLayout.findViewById(R.id.txtVwTriRes);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtBase.getText().toString().equals("") || txtH.getText().toString().equals("")){
                    main.onNullValue();

                } else {
                    float base = Integer.parseInt(txtBase.getText().toString());
                    float h = Integer.parseInt(txtH.getText().toString());
                    float res = (base * h)/2;
                    txtRes.setText("Área = " + res);
                }
            }
        });
        return frameLayout;
    }

}
