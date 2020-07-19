package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

public class depression_doctors_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_doctors_list);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_doctors);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");


        //creating the array for titles

        ArrayList<doctors_list> myDoctors = new ArrayList<>();

        //creating and adding titles

        doctors_list p1 = new doctors_list("أ.منال الجيماز",R.drawable.jeemaz,"200","4.5 yr","مدربه و مستشارة في العلاقات الزوجيه\n" +
                "تخصص علم نفس , إرشاد أسري\n" +
                "مدير عام شركة ام انسايت للإستشارات الإجتماعية",(float) 4.0,"لا يوجد ايميل","+965 55693936");
        doctors_list p2 = new doctors_list("د. رسل بورسلي",R.drawable.borsli,"600+","20 yr"," ماجستيرالأمراض النفسية والعصبية و دكتوراه في الطب النفسي, و أول طبيبة نفسية كويتية , و أكثر من ٢٠ سنة خبرة في الطب النفسي, و مدرب دولي للارشاد الزوجي والأسري",(float) 5,"لا يوجد ايميل","+965 988 71 222");
        doctors_list p3 = new doctors_list("د. محمد السويدان",R.drawable.swedaan,"250+","7 yr","د. محمد السويدان هو أستاذ مساعد في قسم الطب النفسي في كل من جامعة الكويت وجامعة تورنتو الكندية. هو رئيس وحدة الصحة النفسية في مستشفى مبارك الكبير – أكبر مركز طبي أكاديمي في الكويت",(float) 4.5,"Info@AlsuwaidanClinic.com","+965 22055334");
        doctors_list p4 = new doctors_list("د.  عادل أحمد الزايد",R.drawable.alzayed,"400+","9 yr",
                "الشهادات- استشاري - زميل الكلية الملكية للأطباء النفسانيين – من اول الحاصلين على شهادة الكلية الملكية البريطانية في الكويت - بكالوريوس طب عام وجراحة جامعة الكويت ,  التخصصات وعلاج الحالات : - انفصام الشخصية - الإكتئاب - الوسواس القهري - القلق - اضطرابات الشيخوخة - إدمان النيكوتين - الأمراض النفسية للأطفال",(float) 4.5 ,"لا يوجد ايميل","+965 22633930");
        myDoctors.add(p1);
        myDoctors.add(p2);
        myDoctors.add(p3);
        myDoctors.add(p4);

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
                        if (drawerItem.getIdentifier() == 1) {
                        Intent a = new Intent(depression_doctors_list.this, MainActivity.class);
                         startActivity(a);
                        }

                        if (drawerItem.getIdentifier ()==2){
                            Intent b = new Intent(depression_doctors_list.this,test_start.class);
                            startActivity(b);
                        }

                        //if (drawerItem.getIdentifier ()==3){
                            //Intent c = new Intent(depression_doctors_list.this,depression_doctors_list.class);
                            //startActivity(c);
                        //}

                        if (drawerItem.getIdentifier ()==4){
                            Intent d = new Intent(depression_doctors_list.this,depression_legends_title.class);
                            startActivity(d);
                        }

                        if (drawerItem.getIdentifier ()==5){
                            Intent e = new Intent(depression_doctors_list.this,contact_us.class);
                            startActivity(e);
                        }
                        if(drawerItem.getIdentifier ()==6){
                            Intent f = new Intent(depression_doctors_list.this,settings.class);
                            startActivity(f);
                        }

                        return false;
                    }
                })
                .build();




        //conneting it to the adapter

        RecyclerView rv = findViewById(R.id.doctors_recycler);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        doctors_Adapter adapter = new doctors_Adapter(myDoctors,this);
        rv.setAdapter(adapter);
    }
}