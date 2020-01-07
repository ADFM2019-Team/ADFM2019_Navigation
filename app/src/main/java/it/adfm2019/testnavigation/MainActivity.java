package it.adfm2019.testnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        final ViewPager2 viewPager = findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter(this);
        viewPager.setAdapter( adapter );

        new TabLayoutMediator(tabLayout, viewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        switch (position)
                        {
                            case 0:
                                tab.setText("Top stories");
                                return;
                            case 1:
                                tab.setText("Tech news");
                                return;
                            case 2:
                                tab.setText("Cooking tips");
                                return;

                                default:
                                    tab.setText("None");
                        }

                    }
                }).attach();


    }
}
