package com.shubhadip.bcamate

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationview = findViewById<NavigationView>(R.id.nav_view)
        navigationview.setNavigationItemSelectedListener(this)
        navigationview.itemIconTintList = null;

        val toogle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav)

        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

        if (savedInstanceState==null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()

            navigationview.setCheckedItem(R.id.nav_home)
        }

    }



    override fun onNavigationItemSelected(item: MenuItem): Boolean {


        when(item.itemId){
            R.id.nav_home -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()


            R.id.nav_time_table -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, TimeTableFragment()).commit()


            R.id.nav_mentor_list -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MentorFragment()).commit()

            R.id.nav_cr_list -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, CrFragment()).commit()

            R.id.nav_whatsapp_groups -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, WhatsappGroupFragment()).commit()

            R.id.nav_developer_details -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, DeveloperDetailsFragment()).commit()

            R.id.nav_important_contacts -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ImportantContactFragment()).commit()

        }

        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


    override fun onBackPressed(){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START)
        }
        else{
            onBackPressedDispatcher.onBackPressed()
        }
    }


}