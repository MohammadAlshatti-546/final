package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.ArrayList;

public class depression_damages_title extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_damages_title);

        //defining the toolbar

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        Toolbar toolbaration = findViewById(R.id.toolbar_damage);
        setSupportActionBar(toolbaration);
        getSupportActionBar().setTitle("");
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //creating the array for titles

        ArrayList<damage_titles> my_damage_titles = new ArrayList<>();

        //creating and adding titles

        damage_titles m1 = new damage_titles("تأثير الاكتئاب على الصحة الجسدية","كشفت دراسة حديثة أن الأشخاص المتعافين من السكتات الدماغية أو النوبات القلبية ويصابون بالاكتئاب لديهم فرص أكبر لعودة المرض لهم مرة أخرى، ويجدون صعوبة فى اتباع تعليمات الطبيب، ووجدت دراسة أخرى أن المرضى الذين يعانون من الاكتئاب لديهم فرص أعلى للوفاة بعد الإصابة بنوبة قلبية",R.drawable.depressionbody);
        damage_titles m2 = new damage_titles("أنماط النوم للشخص المكتئب","على الرغم من أن المشكلة الأكثر شيوعاً لدى الشخص المكتئب هى الأرق أو صعوبة الحصول على قسط كافى من النوم، يشعر بعض الأشخاص المكتئبين بالحاجة المفرطة إلى النوم مع فقدان الطاقة، كما قد يؤدى الاكتئاب إلى زيادة أو فقدان الوزن ومشاعر اليأس والعجز والحساسية وعلاج الاكتئاب يساعد الشخص فى السيطرة على كل هذه الأعراض.\n" +
                "\n" +
                "ومن علامات الأرق الشائعة مع  الاكتئاب:\n" +
                "\n" +
                "الإرهاق فى النهار\n" +
                "\n" +
                "الحساسية وصعوبة التركيز\n" +
                "\n" +
                "عدم الحصول على كفايته من النوم مهما زادت عدد ساعات النوم\n" +
                "\n" +
                "مشكلة فى العودة إلى النوم بعد الاستيقاظ ليلاً\n" +
                "\n" +
                "الاستيقاظ قبل أن يرن المنبه\n" +
                "\n" +
                "القلق والاستيقاظ ليلاً ",R.drawable.sleepsepression);
        damage_titles m3 = new damage_titles("الاكتئاب قد يقودك للانتحار","هذه أسوء نتائج الاكتئاب، لذا فأى شخص يعبر عن أفكار أو نوايا انتحارية يجب أن تأخذها بمحمل الجد، ووفقاً للمعهد الوطنى للصحة العقلية فإن 90% من الأشخاص المنتحرون يعانون من الاكتئاب .",R.drawable.deadly);
        my_damage_titles.add(m1);
        my_damage_titles.add(m2);
        my_damage_titles.add(m3);

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
                .withToolbar(toolbaration)
                //.withDrawerGravity(Gravity.END)

                // Items Intents

                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        if (drawerItem.getIdentifier() == 1) {
                            Intent a = new Intent(depression_damages_title.this, MainActivity.class);
                            startActivity(a);
                        }

                        if (drawerItem.getIdentifier ()==2){
                            Intent b = new Intent(depression_damages_title.this,test_start.class);
                            startActivity(b);
                        }

                        if (drawerItem.getIdentifier ()==3){
                            Intent c = new Intent(depression_damages_title.this,depression_doctors_list.class);
                            startActivity(c);
                        }

                        if (drawerItem.getIdentifier ()==4){
                            Intent d = new Intent(depression_damages_title.this,depression_legends_title.class);
                            startActivity(d);
                        }

                        if (drawerItem.getIdentifier ()==5){
                            Intent e = new Intent(depression_damages_title.this,contact_us.class);
                            startActivity(e);
                        }
                        if(drawerItem.getIdentifier ()==6){
                            Intent f = new Intent(depression_damages_title.this,settings.class);
                            startActivity(f);
                        }

                        return false;
                    }
                })
                .build();


        //conneting it to the adapter

        RecyclerView rv = findViewById(R.id.damages_recycler);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        damage_adabter adapter = new damage_adabter(my_damage_titles,this);
        rv.setAdapter(adapter);
    }
}