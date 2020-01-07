package it.adfm2019.testnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class PagerAdapter extends FragmentStateAdapter {

    private static int TAB_NUMBER = 3;

    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new tab_fragment1();
            case 1:
                return new tab_fragment2();
            case 2:
                return new tab_fragment3();

            default:
                return null;
        }

    }

    @Override
    public int getItemCount() {
        return TAB_NUMBER;
    }
}
