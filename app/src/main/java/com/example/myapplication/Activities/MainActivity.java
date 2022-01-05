package com.example.myapplication.Activities;

import android.os.Bundle;

import android.view.MenuItem;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.appcompat.widget.Toolbar;
import com.example.myapplication.Fragments.NewsFragment;
import com.example.myapplication.Fragments.ParamsFragment;
import com.example.myapplication.Fragments.PlanifierFragment;
import com.example.myapplication.Fragments.ProfileFragment;
import com.example.myapplication.Fragments.TripsFragment;
import com.example.myapplication.R;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //FOR DESIGN
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    //FOR FRAGMENTS
    private Fragment fragmentNews;
    private Fragment fragmentTrips;
    private Fragment fragmentPlanifier;
    private Fragment fragmentProfile;
    private Fragment fragmentParams;

    //FOR DATAS
    private static final int FRAGMENT_NEWS = 0;
    private static final int FRAGMENT_TRIPS = 1;
    private static final int FRAGMENT_PLANIFIER = 2;
    private static final int FRAGMENT_PROFILE = 3;
    private static final int FRAGMENT_PARAMS = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configure all views
        this.configureToolBar();
        this.configureDrawerLayout();
        this.configureNavigationView();

        // Show First Fragment
        this.showFirstFragment();
    }

    @Override
    public void onBackPressed() {
        // Handle back click to close menu
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        // Show fragment after user clicked on a menu item
        switch (id){
            case R.id.activity_main_drawer_news :
                this.showFragment(FRAGMENT_NEWS);
                break;
            case R.id.activity_main_drawer_trips :
                this.showFragment(FRAGMENT_TRIPS);
                break;
            case R.id.activity_main_drawer_planifier:
                this.showFragment(FRAGMENT_PLANIFIER);
                break;
            case R.id.activity_main_drawer_profile:
                this.showFragment(FRAGMENT_PROFILE);
                break;
            case R.id.activity_main_drawer_settings:
                this.showFragment(FRAGMENT_PARAMS);
                break;
            default:
                break;
        }

        this.drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

    // ---------------------
    // CONFIGURATION
    // ---------------------

    // Config Toolbar
    private void configureToolBar(){
        this.toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(toolbar);
    }

    // Config DrawerLayout
    private void configureDrawerLayout(){
        this.drawerLayout = findViewById(R.id.activity_main_drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    // Configure NavigationView
    private void configureNavigationView(){
        this.navigationView = (NavigationView) findViewById(R.id.activity_main_nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    // ---------------------
    // FRAGMENTS
    // ---------------------

    // Montrer le premier fragment news par défaut
    private void showFirstFragment(){
        Fragment visibleFragment = getSupportFragmentManager().findFragmentById(R.id.activity_main_frame_layout);
        if (visibleFragment == null){
            // Montrer le fragment news
            this.showFragment(FRAGMENT_NEWS);
            // Marquer le fragment news comme selectionner
            this.navigationView.getMenu().getItem(0).setChecked(true);
        }
    }

    // Montrer les fragment avec leur identifier

    private void showFragment(int fragmentIdentifier){
        switch (fragmentIdentifier){
            case FRAGMENT_NEWS :
                this.showNewsFragment();
                break;
            case FRAGMENT_TRIPS:
                this.showTripsFragment();
                break;
            case FRAGMENT_PLANIFIER:
                this.showPlanifierFragment();
                break;
            case FRAGMENT_PROFILE:
                this.showProfileFragment();
                break;
            case FRAGMENT_PARAMS:
                this.showParamsFragment();
                break;
            default:
                break;
        }
    }

    // ---

    //Créer chaque fragment page et la montrer

    private void showNewsFragment(){
        if (this.fragmentNews == null) this.fragmentNews = NewsFragment.newInstance();
        this.startTransactionFragment(this.fragmentNews);
    }

    private void showTripsFragment(){
        if (this.fragmentTrips == null) this.fragmentTrips = TripsFragment.newInstance();
        this.startTransactionFragment(this.fragmentTrips);
    }

    private void showPlanifierFragment(){
        if (this.fragmentPlanifier == null) this.fragmentPlanifier = PlanifierFragment.newInstance();
        this.startTransactionFragment(this.fragmentPlanifier);
    }

    private void showParamsFragment(){
        if (this.fragmentParams == null) this.fragmentParams = ParamsFragment.newInstance();
        this.startTransactionFragment(this.fragmentParams);
    }

    private void showProfileFragment(){
        if (this.fragmentProfile == null) this.fragmentProfile = ProfileFragment.newInstance();
        this.startTransactionFragment(this.fragmentProfile);
    }

    // ---

    // Generic method that will replace and show a fragment inside the MainActivity Frame Layout
    private void startTransactionFragment(Fragment fragment){
        if (!fragment.isVisible()){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.activity_main_frame_layout, fragment).commit();
        }
    }
}