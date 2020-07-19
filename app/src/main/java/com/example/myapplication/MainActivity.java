package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.Navigation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivity extends AppCompatActivity {

    //items define

    private ImageView whatis, dangerous, quez_ans, treat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);


        // Tool bar

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



         // The Navigation Drawer

        //Header

        @SuppressLint("ResourceAsColor") AccountHeader hr = new AccountHeaderBuilder()
                .withHeaderBackground(R.drawable.vio__)
                .withActivity (this)
                .addProfiles(new ProfileDrawerItem().withIcon(R.drawable.student))
                .withTextColor(R.color.black)
                .build();

         // Items


        @SuppressLint("ResourceAsColor") PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName ("الرئيسية").withIcon(R.drawable.ic_homepage);
        @SuppressLint("ResourceAsColor") PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName ("اختبر نفسك ").withIcon(R.drawable.ic_list);
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withIdentifier(3).withName ("الدكاترة").withIcon(R.drawable.ic_doctor);
        PrimaryDrawerItem item4 = new PrimaryDrawerItem().withIdentifier(4).withName ("قصص الأبطال").withIcon(R.drawable.ic_trophy);
        SecondaryDrawerItem item5 = new SecondaryDrawerItem().withIdentifier(5).withName("تواصل معنا").withIcon(R.drawable.ic_message);
        SecondaryDrawerItem item6 = new SecondaryDrawerItem().withIdentifier(6).withName("الاعدادات").withIcon(R.drawable.ic_gear);
        //toolbar.setNavigationIcon(R.style.Material_DrawerArrowStyle);
        Drawer result = new DrawerBuilder()
               .withActivity(this)
                .withAccountHeader(hr)
                .addDrawerItems(item1)
                .addDrawerItems(item2)
                .addDrawerItems(item3)
                .addDrawerItems(item4)
                .addDrawerItems(new DividerDrawerItem())
                .addDrawerItems(item5)
                .addDrawerItems(item6)
                .withToolbar(toolbar)
                //.withDrawerGravity(Gravity.END)

                 // Items Intents


                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        //if (drawerItem.getIdentifier() == 1) {
                            //Intent a = new Intent(MainActivity.this, MainActivity.class);
                           // startActivity(a);
                        //}

                         if (drawerItem.getIdentifier ()==2){
                           Intent b = new Intent(MainActivity.this,test_start.class);
                           startActivity(b);
                         }

                        if (drawerItem.getIdentifier ()==3){
                        Intent c = new Intent(MainActivity.this,depression_doctors_list.class);
                        startActivity(c);
                        }

                        if (drawerItem.getIdentifier ()==4){
                           Intent d = new Intent(MainActivity.this,depression_legends_title.class);
                           startActivity(d);
                          }

                        if (drawerItem.getIdentifier ()==5){
                        Intent e = new Intent(MainActivity.this,contact_us.class);
                         startActivity(e);
                          }
                        if(drawerItem.getIdentifier ()==6){
                         Intent f = new Intent(MainActivity.this,settings.class);
                         startActivity(f);
                        }

                        return false;
                    }
                })
                .build();

        // Circles define

        ImageView whatis = findViewById(R.id.circle1);
        ImageView dangerous = findViewById(R.id.circle2);
        ImageView quez_ans = findViewById(R.id.circle3);
        ImageView treat = findViewById(R.id.circle4);

        // circle 1 click listener

        whatis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, depression_definision_titles.class);
                startActivity(a);
            }
        });

         // circle 2 click listener

        dangerous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this,depression_damages_title.class);
                startActivity(b);
            }
        });

        // circle 4 click listener

        treat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this,depression_treat_titles.class);
                startActivity(c);
            }
        });

        // circle 3 click listener

        quez_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this,depression_quiz_titles.class);
                startActivity(d);
            }
        });


            }

    }
