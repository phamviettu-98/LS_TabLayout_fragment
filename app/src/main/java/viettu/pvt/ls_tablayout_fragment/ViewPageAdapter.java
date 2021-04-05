package viettu.pvt.ls_tablayout_fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import viettu.pvt.ls_tablayout_fragment.fragments.CallFragment;
import viettu.pvt.ls_tablayout_fragment.fragments.MailFragment;
import viettu.pvt.ls_tablayout_fragment.fragments.UserFragment;

public class ViewPageAdapter  extends FragmentStatePagerAdapter {
    public ViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new  UserFragment();
            case 1:
                return  new MailFragment();
            case 2:
                return  new CallFragment();
            default:
                return new UserFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
