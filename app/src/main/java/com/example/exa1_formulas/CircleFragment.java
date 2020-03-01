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
public class CircleFragment extends Fragment {

    MainActivity main;

    EditText txtRad;

    public CircleFragment() {
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
        LinearLayout frameLayout= (LinearLayout) inflater.inflate(R.layout.fragment_circle, container, false);
        txtRad = frameLayout.findViewById(R.id.edTxtCirRad);
        Button btn = frameLayout.findViewById(R.id.btnCirCalc);
        final TextView txtRes = frameLayout.findViewById(R.id.txtVwCirRes);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtRad.getText().toString().equals("")){
                    main.onNullValue();

                } else{
                    float rad = Integer.parseInt(txtRad.getText().toString());
                    float res = (float) (Math.PI * (rad * rad));
                    txtRes.setText("Área = " + res);
                }
            }
        });
        return frameLayout;
    }

}
