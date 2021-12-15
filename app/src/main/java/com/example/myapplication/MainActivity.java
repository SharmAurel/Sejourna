 package com.example.myapplication;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

     //FOR DESIGN
     private Toolbar toolbar;
     private DrawerLayout drawerLayout;
     private NavigationView navigationView;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.menu);

         // 6 - Configure all views

         this.configureToolBar();

         this.configureDrawerLayout();

         this.configureNavigationView();
     }

     @Override
     public void onBackPressed() {
         // 5 - Handle back click to close menu
         if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
             this.drawerLayout.closeDrawer(GravityCompat.START);
         } else {
             super.onBackPressed();
         }
     }


     @Override
     public boolean onNavigationItemSelected(MenuItem item) {

         // 4 - Handle Navigation Item Click
         int id = item.getItemId();

         switch (id){
             case R.id.drawer_news :
                 break;
             case R.id.activity_main_drawer_profile:
                 break;
             case R.id.activity_main_drawer_settings:
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

     // 1 - Configure Toolbar
     private void configureToolBar(){
         this.toolbar = (Toolbar) findViewById(R.id.menu_toolbar);
         setSupportActionBar(toolbar);
     }

     // 2 - Configure Drawer Layout
     private void configureDrawerLayout(){
         this.drawerLayout = (DrawerLayout) findViewById(R.id.menu_drawer_layout);
         ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
         drawerLayout.addDrawerListener(toggle);
         toggle.syncState();
     }

     // 3 - Configure NavigationView
     private void configureNavigationView(){
         this.navigationView = (NavigationView) findViewById(R.id.nav_view);
         navigationView.setNavigationItemSelectedListener(this);
     }
 }