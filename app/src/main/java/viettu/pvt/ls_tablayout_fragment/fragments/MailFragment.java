package viettu.pvt.ls_tablayout_fragment.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import viettu.pvt.ls_tablayout_fragment.R;
import viettu.pvt.ls_tablayout_fragment.Tab.MailViewPageAdapter;


public class MailFragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private  View mView;


    public MailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_mail, container, false);
          viewPager = mView.findViewById(R.id.vp_mail);
          tabLayout = mView.findViewById(R.id.tab_layout);
        MailViewPageAdapter mailViewPageAdapter = new MailViewPageAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(mailViewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);
        return mView;
    }
}