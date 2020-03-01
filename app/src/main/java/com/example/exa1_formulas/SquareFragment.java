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
public class SquareFragment extends Fragment {

    EditText txtSide;

    MainActivity main;

    public SquareFragment() {
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
        LinearLayout frameLayout= (LinearLayout) inflater.inflate(R.layout.fragment_square, container, false);
        txtSide = frameLayout.findViewById(R.id.edTxtSqSide);
        Button btn = frameLayout.findViewById(R.id.btnSqCalc);
        final TextView txtRes = frameLayout.findViewById(R.id.txtVwSqRes);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtSide.getText().toString().equals("")){
                    main.onNullValue();

                } else{
                    float side = Integer.parseInt(txtSide.getText().toString());
                    float res = side * side;
                    txtRes.setText("Área = " + res);
                }
            }
        });
        return frameLayout;
    }
}
