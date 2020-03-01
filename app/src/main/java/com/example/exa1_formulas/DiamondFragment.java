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
public class DiamondFragment extends Fragment {

    EditText txtD, txtd;

    MainActivity main;

    public DiamondFragment() {
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
        LinearLayout frameLayout= (LinearLayout) inflater.inflate(R.layout.fragment_diamond, container, false);
        txtD = frameLayout.findViewById(R.id.edTxtDiamD);
        txtd = frameLayout.findViewById(R.id.edTxtDiamd);
        Button btn = frameLayout.findViewById(R.id.btnDiamCalc);
        final TextView txtRes = frameLayout.findViewById(R.id.txtVwDiamRes);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtD.getText().toString().equals("") || txtd.getText().toString().equals("")){
                    main.onNullValue();

                } else{
                    float D = Integer.parseInt(txtD.getText().toString());
                    float d = Integer.parseInt(txtd.getText().toString());
                    float res = (D * d)/2;
                    txtRes.setText("Área = " + res);
                }
            }
        });
        return frameLayout;
    }

}
