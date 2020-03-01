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
public class HexagonFragment extends Fragment {

    EditText txtApot, txtPerim;

    MainActivity main;

    public HexagonFragment() {
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
        LinearLayout frameLayout= (LinearLayout) inflater.inflate(R.layout.fragment_hexagon, container, false);
        txtPerim = frameLayout.findViewById(R.id.edTxtHexPerim);
        txtApot = frameLayout.findViewById(R.id.edTxtHexApot);
        Button btn = frameLayout.findViewById(R.id.btnHexCalc);
        final TextView txtRes = frameLayout.findViewById(R.id.txtVwHexRes);
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
