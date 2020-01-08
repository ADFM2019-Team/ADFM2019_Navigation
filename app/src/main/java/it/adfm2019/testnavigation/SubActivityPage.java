package it.adfm2019.testnavigation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class SubActivityPage extends AppCompatActivity {
    ViewPager2 pager;

    @Override
    public void onBackPressed() {
        int currentPage = pager.getCurrentItem();

        if(currentPage > 0 )
            pager.setCurrentItem(currentPage-1);
        else
            super.onBackPressed();

        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_page);

        pager = findViewById(R.id.pager);
        pager.setAdapter(new SubPageAdapter());
    }
}
