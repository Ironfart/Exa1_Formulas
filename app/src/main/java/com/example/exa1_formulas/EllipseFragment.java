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
public class EllipseFragment extends Fragment {

    EditText txtA, txtB;

    MainActivity main;

    public EllipseFragment() {
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
        LinearLayout frameLayout= (LinearLayout) inflater.inflate(R.layout.fragment_ellipse, container, false);
        txtA = frameLayout.findViewById(R.id.edTxtElA);
        txtB = frameLayout.findViewById(R.id.edTxtElB);
        Button btn = frameLayout.findViewById(R.id.btnElCalc);
        final TextView txtRes = frameLayout.findViewById(R.id.txtVwElRes);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtA.getText().toString().equals("") || txtB.getText().toString().equals("")){
                    main.onNullValue();

                } else{
                    float a = Integer.parseInt(txtA.getText().toString());
                    float b = Integer.parseInt(txtB.getText().toString());
                    float res = (float) (Math.PI * a * b);
                    txtRes.setText("Área = " + res);
                }
            }
        });
        return frameLayout;
    }

}
