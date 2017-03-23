package com.daoran.newfactory.onefactory.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daoran.newfactory.onefactory.R;


/**
 * Created by lizhipeng on 2017/3/22.
 */

public class SetupFragment extends Fragment {

    Activity mactivity;
    private Toolbar tbarSetup;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mactivity = getActivity();
        View view = inflater.inflate(R.layout.fragment_setup, container, false);
        tbarSetup = (Toolbar) view.findViewById(R.id.tbarSetup);
        tbarSetup.setTitle("");
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void getViews() {
    }
}