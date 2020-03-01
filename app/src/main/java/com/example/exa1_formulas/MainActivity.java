package com.example.exa1_formulas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListFragment lstFrag;

    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
       /* if (fragment.getClass() == FigureFragment.class) {
            frmFrag = (FormulaFragment)fragment;
        } else if (fragment.getClass() == ListFragment.class) {
            lstFrag = (ListFragment)fragment;
        }*/
    }
                                    //quien             que
    public void onMsgFromFragToMain(String sender, String param) {
        frameLayout = findViewById(R.id.frameLayout);
        Toast.makeText(this,param, Toast.LENGTH_SHORT).show();
        switch (param) {
            case "Cuadrado":
                FragmentTransaction sq = getSupportFragmentManager().beginTransaction();
                sq.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                SquareFragment sqFrag = new SquareFragment(); //Fragmento de figura
                sq.replace(R.id.frameLayout,sqFrag);
                sq.addToBackStack(null);
                sq.commit();
                break;

            case "Trapecio":
                FragmentTransaction tp = getSupportFragmentManager().beginTransaction();
                tp.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                TrapezeFragment tpFrag = new TrapezeFragment(); //Fragmento de figura
                tp.replace(R.id.frameLayout,tpFrag);
                tp.addToBackStack(null);
                tp.commit();
                break;

            case "Círculo":
                FragmentTransaction cir = getSupportFragmentManager().beginTransaction();
                cir.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                CircleFragment cirFrag = new CircleFragment();
                cir.replace(R.id.frameLayout, cirFrag);
                cir.addToBackStack(null);
                cir.commit();
                break;

            case "Triángulo":
                //TODO triangulo
                FragmentTransaction tri = getSupportFragmentManager().beginTransaction();
                tri.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                TriangleFragment triFrag = new TriangleFragment();
                tri.replace(R.id.frameLayout, triFrag);
                tri.addToBackStack(null);
                tri.commit();
                break;

            case "Rombo":
                FragmentTransaction diam = getSupportFragmentManager().beginTransaction();
                diam.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                DiamondFragment diamFrag = new DiamondFragment();
                diam.replace(R.id.frameLayout, diamFrag);
                diam.addToBackStack(null);
                diam.commit();
                break;

            case "Hexágono":
                FragmentTransaction hex = getSupportFragmentManager().beginTransaction();
                hex.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                HexagonFragment hexFrag = new HexagonFragment();
                hex.replace(R.id.frameLayout, hexFrag);
                hex.addToBackStack(null);
                hex.commit();
                break;

            case "Pentágono":
                FragmentTransaction pent = getSupportFragmentManager().beginTransaction();
                pent.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                PentagonFragment pentFrag = new PentagonFragment();
                pent.replace(R.id.frameLayout, pentFrag);
                pent.addToBackStack(null);
                pent.commit();
                break;

            case "Rectángulo":
                FragmentTransaction rect = getSupportFragmentManager().beginTransaction();
                rect.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                RectangleFragment rectFrag = new RectangleFragment();
                rect.replace(R.id.frameLayout, rectFrag);
                rect.addToBackStack(null);
                rect.commit();
                break;

            case "Elipse":
                FragmentTransaction el = getSupportFragmentManager().beginTransaction();
                el.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                EllipseFragment elFrag = new EllipseFragment();
                el.replace(R.id.frameLayout, elFrag);
                el.addToBackStack(null);
                el.commit();
                break;

            case "Paralelogramo":
                FragmentTransaction par = getSupportFragmentManager().beginTransaction();
                par.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ParalellFragment parFrag = new ParalellFragment();
                par.replace(R.id.frameLayout, parFrag);
                par.addToBackStack(null);
                par.commit();
                break;
        }
    }
    
    public void onNullValue(){
        Toast.makeText(this, "Introduce un valor", Toast.LENGTH_SHORT).show();
    }
}
