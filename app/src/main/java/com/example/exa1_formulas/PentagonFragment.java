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
public class PentagonFragment extends Fragment {

    EditText txtApot, txtPerim;

    MainActivity main;

    public PentagonFragment() {
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
        LinearLayout frameLayout= (LinearLayout) inflater.inflate(R.layout.fragment_pentagon, container, false);
        txtPerim = frameLayout.findViewById(R.id.edTxtPentPerim);
        txtApot = frameLayout.findViewById(R.id.edTxtPentApot);
        Button btn = frameLayout.findViewById(R.id.btnPentCalc);
        final TextView txtRes = frameLayout.findViewById(R.id.txtVwPentRes);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtPerim.getText().toString().equals("") || txtApot.getText().toString().equals("")){
                    main.onNullValue();

                } else{
                    float perim = Integer.parseInt(txtPerim.getText().toString());
                    float apot = Integer.parseInt(txtApot.getText().toString());
                    float res = (perim * apot)/2;
                    txtRes.setText("Área = " + res);
                }
            }
        });
        return frameLayout;
    }

}
