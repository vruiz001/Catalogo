package com.vicco.android.catalogo.view;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;
import com.vicco.android.catalogo.R;
import com.vicco.android.catalogo.view.fragments.HomeFragment;
import com.vicco.android.catalogo.view.fragments.ProfileFragment;
import com.vicco.android.catalogo.view.fragments.SearchFragment;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomBar bottombar= (BottomBar) findViewById(R.id.bottombar);
        bottombar.setDefaultTab(R.id.home);
        bottombar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.home:
                        HomeFragment homeFragment=new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).
                                addToBackStack(null).commit();
                        break;
                    case R.id.profile:
                        ProfileFragment profileFragment=new ProfileFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).
                                addToBackStack(null).commit();
                        break;
                    case R.id.search:
                        SearchFragment searchFragment=new SearchFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, searchFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).
                                addToBackStack(null).commit();
                        break;


                }

            }
        });
    }
}
