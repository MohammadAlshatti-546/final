package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

public class depression_quiz_titles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_quiz_titles);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        Toolbar toolbaration = findViewById(R.id.toolbar_quiz);
        setSupportActionBar(toolbaration);
        getSupportActionBar().setTitle("");

        //creating the array for titles

        ArrayList<quiz_titles> quiz_titles = new ArrayList<>();

        //creating and adding titles

        quiz_titles p0 = new quiz_titles("كيف أرسل سؤالي ؟","تستطيع ارسال سؤالك من خلال قائمة تواصل معنا , الطريقة سهلة جدا ولا تحتاج أي تعقيد , فقط عليك تعبئة بياناتك و السؤال , ونحن سنتكفل بالباقي.",R.drawable.quiesss);
        quiz_titles p1 = new quiz_titles("هل يمكن أن يلجأ مريض الاكتئاب لإدمان المخدرات؟","هناك علاقة قوية بين مرضى الاكتئاب والإدمان على المواد المؤثرة عقليًّا؛ فقد أثبتت الدراسات أن نسبة إدمان مرضى الاكتئاب تفوق مثيلتها عن الأصحاء.",R.drawable.drugdep);
        quiz_titles p2 = new quiz_titles("هل يصيب الاكتئاب النساء بنسبة أكبر من الرجال ؟","الحقيقة: نعم، فحالات الاكتئاب تكاد تصل إلى الضعف بين النساء مقارنة بالرجال؛ وذلك لوجود عدد كبير من النساء قد يصبن باكتئاب ما بعد الولادة، مما يزيد نسبة انتشار المرض لديهن. هذا بالإضافة إلى اختلاف الأدوار الاجتماعية بين الجنسين، بما يتيح للرجال فرصًا أكثر للسيطرة على الأعراض من خلال الانخراط في الحياة اليومية. هذا إلى جانب التقدير الزائف لعدد الحالات بين الرجال؛ نتيجة الإنكار، ولازدياد فرصة تعاطي المواد المؤثرة عقليًّا التي قد تغطي على بعض الأعراض.",R.drawable.depressionwomenvsmen);
        quiz_titles p3 = new quiz_titles("هل علاج الاكتئاب يستمر العمر كله ؟","الحقيقة: لا، فالعلاج يستمر لبضعة أشهر، وقد يستمر لفترة عام، أو عامين في حالات نوبات الاكتئاب. ولكن قد تتكرر نوبات الاكتئاب لدى بعضهم خلال عمر المريض، وذلك لفترات معينة يشفى بعدها المريض في فترات قد تزيد أو تقل على عامين كاملين.",R.drawable.maxresdefault);
        quiz_titles.add(p0);
        quiz_titles.add(p1);
        quiz_titles.add(p2);
        quiz_titles.add(p3);

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
                            Intent a = new Intent(depression_quiz_titles.this, MainActivity.class);
                            startActivity(a);
                        }

                        if (drawerItem.getIdentifier ()==2){
                            Intent b = new Intent(depression_quiz_titles.this,test_start.class);
                            startActivity(b);
                        }

                        if (drawerItem.getIdentifier ()==3){
                            Intent c = new Intent(depression_quiz_titles.this,depression_doctors_list.class);
                            startActivity(c);
                        }

                        if (drawerItem.getIdentifier ()==4){
                            Intent d = new Intent(depression_quiz_titles.this,depression_legends_title.class);
                            startActivity(d);
                        }

                        if (drawerItem.getIdentifier ()==5){
                            Intent e = new Intent(depression_quiz_titles.this,contact_us.class);
                            startActivity(e);
                        }
                        if(drawerItem.getIdentifier ()==6){
                            Intent f = new Intent(depression_quiz_titles.this,settings.class);
                            startActivity(f);
                        }

                        return false;
                    }
                })
                .build();


        //conneting it to the adapter

        RecyclerView rv = findViewById(R.id.quiz_recycler);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);


        quiz_adabter adabter = new quiz_adabter(quiz_titles,this);
        rv.setAdapter(adabter);
    }
}