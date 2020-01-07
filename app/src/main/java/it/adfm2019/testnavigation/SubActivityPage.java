package it.adfm2019.testnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class SubActivityPage extends AppCompatActivity {
    ViewPager2 pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_page);

        pager = findViewById(R.id.pager);
        pager.setAdapter(new SubPageAdapter());
    }
}
