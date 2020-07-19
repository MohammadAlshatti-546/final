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

public class depression_treat_titles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_treat_titles);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

        //defining tool bar

        Toolbar toolbar1 = findViewById(R.id.toolbar_treat);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setTitle("");
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //creating the array for titles

        ArrayList<how_titles> treat_titles = new ArrayList<>();


        //creating and adding titles


        how_titles p1 = new how_titles("كيف تقي نفسك من الاكتئاب","الوقاية :\n" +
                "ليست هناك طريقة أكيدة للوقاية من الاكتئاب، ولكن قد تساعد الاستراتيجيات التالية :-\n" +
                "\n" +
                "1- اتخذ الخطوات اللازمة للتحكم في الضغط النفسي لزيادة المرونة ولرفع درجة تقدير الذات\n" +
                "\n" +
                "2- تواصل مع الأسرة والأصدقاء، خاصةً في أوقات الأزمة، وذلك للتنفيس عن الهموم الشاقة\n" +
                "\n" +
                "3- احصل على العلاج عند ظهور أول علامة على وجود مشكلة للمساعدة في منع تفاقم الاكتئاب\n" +
                "\n" +
                "4- فكِّر في الحصول على علاج للحفاظ على الحالة الصحية لأمد طويل، في سبيل الوقاية من الانتكاسات الخاصة بالأعراض",R.drawable.protectyourself);
        how_titles p2 = new how_titles("أنواع العلاج ","توجد عدة وسائل في علاج الاكتئاب وهي\n" +
                "\n" +
                " - العلاج الكيميائي  \n" +
                "\n" +
                "  في العلاج الكيميائي يقيم الطبيب النفسي حالة المريض وبناء على التقييم يعطيه الجرعة المناسبة من أدوية تسمى بمضادات الاكتئاب .\n" +
                "\n" +
                "- العلاج النفسي \n" +
                "\n" +
                "    ثبتت فعالية معظم أنواع لاعلاج النفسي في علاج الاكتئاب ، ويشمل : العلاج المعرفي السلوكي ، والعلاج بحل المشكلات واخرى غيرها ، قد يكون العلاج النفسي هو الأفضل خصوصا في الحالات البسيطة \n" +
                "\n" +
                " - العلاج المشترك\n" +
                "\n" +
                "   وهو يشمل العلاج النفسي و الكيميائي معا  وهو الافضل في غير الحالات البسيطة ، وهذا ما أثبتته التجارب الطبية",R.drawable.treattypes);
        how_titles p3 = new how_titles("إرشادات للتعامل مع الاكتئاب","الحرص على ممارسة النشاط البدن  -\n" +
                " \n" +
                "تزجية الوقت بين الأهل والأصدقاء، وطلب المساعدة منهم، وتجنب العزلة  - \n" +
                " \n" +
                "القراءة والتعلم أكثر عن الاكتئاب  - \n" +
                "\n" +
                "التدوين والكتابة يساعدان على تفريغ المشاعر، والشعور بالتحسن - \n" +
                "\n" +
                "تعلم تقنيات الاسترخاء، والتعامل مع الضغوط، مثل: التأمل، واسترخاء العضلات، واليوغا  -\n" +
                "\n" +
                "تبسيط المهام اليومية، ووضع أهداف قابلة للتحقيق؛ لتجنب الإصابة بالإحباط  - \n" +
                "\n" +
                "تنظيم الوقت، وإعداد قائمة للإنجازات اليومية ومواعيدها  -\n" +
                "\n" +
                "تجنب اتخاذ القرارات المهمة عند الشعور بالاكتئاب  ",R.drawable.cope);
        treat_titles.add(p1);
        treat_titles.add(p2);
        treat_titles.add(p3);

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
                .withToolbar(toolbar1)
                //.withDrawerGravity(Gravity.END)

                // Items Intents

                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        if (drawerItem.getIdentifier() == 1) {
                            Intent a = new Intent(depression_treat_titles.this, MainActivity.class);
                            startActivity(a);
                        }

                        if (drawerItem.getIdentifier ()==2){
                            Intent b = new Intent(depression_treat_titles.this,test_start.class);
                            startActivity(b);
                        }

                        if (drawerItem.getIdentifier ()==3){
                            Intent c = new Intent(depression_treat_titles.this,depression_doctors_list.class);
                            startActivity(c);
                        }

                        if (drawerItem.getIdentifier ()==4){
                            Intent d = new Intent(depression_treat_titles.this,depression_legends_title.class);
                            startActivity(d);
                        }

                        if (drawerItem.getIdentifier ()==5){
                            Intent e = new Intent(depression_treat_titles.this,contact_us.class);
                            startActivity(e);
                        }
                        if(drawerItem.getIdentifier ()==6){
                            Intent f = new Intent(depression_treat_titles.this,settings.class);
                            startActivity(f);
                        }

                        return false;
                    }
                })
                .build();


        //conneting it to the adapter

        RecyclerView rv = findViewById(R.id.treat_recycler);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        treat_Adapter adapter = new treat_Adapter(treat_titles,this);
        rv.setAdapter(adapter);

    }
}