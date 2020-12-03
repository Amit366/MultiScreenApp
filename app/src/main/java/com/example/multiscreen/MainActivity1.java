package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.multiscreen.Adapter.PageAdapter1;
import com.example.multiscreen.Fragments.tabA1;
import com.example.multiscreen.Fragments.tabA2;
import com.example.multiscreen.Fragments.tabA3;
import com.google.android.material.tabs.TabLayout;

public class MainActivity1 extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    ViewPager vp;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        vp =(ViewPager) findViewById(R.id.viewPage1);
        this.addPager();

        tabLayout = findViewById(R.id.mTab_Id);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);
    }
    private void addPager(){
        PageAdapter1 pageAdapter = new PageAdapter1(this.getSupportFragmentManager());
        pageAdapter.addFragment(new tabA1());
        pageAdapter.addFragment(new tabA2());
        pageAdapter.addFragment(new tabA3());

        vp.setAdapter(pageAdapter);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }
}