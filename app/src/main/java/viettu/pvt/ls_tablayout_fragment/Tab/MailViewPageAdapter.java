package viettu.pvt.ls_tablayout_fragment.Tab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import viettu.pvt.ls_tablayout_fragment.fragments.CallFragment;
import viettu.pvt.ls_tablayout_fragment.fragments.MailFragment;
import viettu.pvt.ls_tablayout_fragment.fragments.UserFragment;

public class MailViewPageAdapter extends FragmentStatePagerAdapter {
    public MailViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Tab1Fragment();
            case 1:
                return  new Tab2Fragment();
            case 2:
                return  new Tab3Fragment();
            default:
                return new Tab1Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Tab1";
            case 1:
                return  "Tab2";
            case 2:
                return  "Tab3";
            default:
                return "Tab1";
        }
    }
}
