package com.cristiangimenez.fondografia.FragmentosAdministrador;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cristiangimenez.fondografia.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RegistrarAdmin#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegistrarAdmin extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_registro_admin, container, false);
        return view;

    }
}