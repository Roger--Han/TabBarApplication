package com.example.roger.tabbarapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by roger on 7/03/16.
 */
public class TabFragment1 extends Fragment {

    private View mView;
    private Button btnClick;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        mView =  inflater.inflate(R.layout.tab_fragment, container, false);
        getUiInitialization();

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "First Fragment", Toast.LENGTH_SHORT).show();
            }
        });
        return mView;

    }

    private void getUiInitialization() {
        btnClick = (Button) mView.findViewById(R.id.btnClick);

    }
}
