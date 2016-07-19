package com.example.hanshu.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HanShu on 2016/7/18.
 */
public class B_Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //return  View.inflate(getActivity(), R.layout.fragment_m, null);
        View view=inflater.inflate(R.layout.fragment_m,container,false);
        return view;
    }
}
