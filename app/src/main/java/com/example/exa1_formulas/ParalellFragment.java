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
public class ParalellFragment extends Fragment {

    EditText txtB, txtH;

    MainActivity main;

    public ParalellFragment() {
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
        LinearLayout frameLayout= (LinearLayout) inflater.inflate(R.layout.fragment_paralell, container, false);
        txtB = frameLayout.findViewById(R.id.edTxtParB);
        txtH = frameLayout.findViewById(R.id.edTxtParH);
        Button btn = frameLayout.findViewById(R.id.btnParCalc);
        final TextView txtRes = frameLayout.findViewById(R.id.txtVwParRes);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtB.getText().toString().equals("") || txtH.getText().toString().equals("")){
                    main.onNullValue();

                } else{
                    float b = Integer.parseInt(txtB.getText().toString());
                    float h = Integer.parseInt(txtH.getText().toString());
                    float res = b * h;
                    txtRes.setText("Área = " + res);
                }
            }
        });
        return frameLayout;
    }

}
