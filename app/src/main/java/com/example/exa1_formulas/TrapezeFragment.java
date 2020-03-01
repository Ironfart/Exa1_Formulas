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
public class TrapezeFragment extends Fragment {

    MainActivity main;
    EditText txtB, txtb, txtH;

    public TrapezeFragment() {
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
        LinearLayout frameLayout= (LinearLayout) inflater.inflate(R.layout.fragment_trapeze, container, false);

        txtB = frameLayout.findViewById(R.id.edTxtTpB);
        txtb = frameLayout.findViewById(R.id.edTxtTpb);
        txtH = frameLayout.findViewById(R.id.edTxtTpH);

        Button btn = frameLayout.findViewById(R.id.btnTpCalc);
        final TextView txtRes = frameLayout.findViewById(R.id.txtVwTpRes);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtB.getText().toString().equals("") || txtb.getText().toString().equals("") ||
                txtH.getText().toString().equals("")){
                    main.onNullValue();

                } else{
                    float B = Integer.parseInt(txtB.getText().toString());
                    float b = Integer.parseInt(txtb.getText().toString());
                    float h = Integer.parseInt(txtH.getText().toString());
                    float res = ((B*b)*h)/2;
                    txtRes.setText("Área = " + res);
                }
            }
        });
        return frameLayout;
    }

}
