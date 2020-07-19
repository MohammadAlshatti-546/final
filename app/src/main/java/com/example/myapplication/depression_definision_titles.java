package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
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

public class depression_definision_titles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //defining tool bar


        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_depression_definision_titles);

        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_definison);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        //creating the array for titles

        ArrayList<titles> mytitles = new ArrayList<>();

        //creating and adding titles

        final titles p1 = new titles("ما هو الاكتئاب","الاكتئاب هو اضطراب المزاج الذي يسبب شعورًا متواصلًا بالحزن، وفقدان المتعة، والاهتمام بالأمور المعتادة، ونقص التركيز. وقد يكون مصحوبًا بالشعور بالذنب، وعدم الأهمية، ونقص تقدير الذات. ويؤثر المرض في المشاعر، والتفكير، والتصرفات؛ مما يسبب كثيرًا من المشكلات العاطفية والجسدية، والتي بدورها تؤثر في أداء الأنشطة اليومية. وقد يسبب الشعور باليأس من الحياة، والتفكير في الانتحار، وربما الإقدام عليه في الحالات المتقدمة.",R.drawable.nopat);
        final titles p2 = new titles("أنواع الاكتئاب","تظهر بعض أنواع الاكتئاب في ظروف خاصة، مثل:\n" +
                "\u200Bاضطراب الاكتئاب الجزئي:\n" +
                " ويعرف - أيضًا - باسم الاكتئاب الجزئي، والاكتئاب الخفيف، واضطراب عسر المزاج. والاكتئاب الجزئي حالة من سوء المزاج تستمر لفترات طويلة، ولا تؤثر بشكل ملحوظ في أداء الشخص. وقد يمر المصاب بنوبات من الاكتئاب الشديد، والاكتئاب الخفيف. ولا يسمى بالاكتئاب الجزئي إلا إذا استمر لسنتين على الأقل.\n" +
                "\n" +
                "الاكتئاب الموسمي:\n" +
                "يتميز بحدوثه خلال موسم الشتاء؛ حيث تقل فيه أشعة الشمس، ويزول غالبًا بحلول فصل الربيع، ويكون مصحوبًا بالعزلة الاجتماعية، وكثرة النوم، وزيادة الوزن.\n" +
                "\n" +
                "الاكتئاب الذهاني:\n" +
                "فيه يصاب الشخص باكتئاب شديد، بالإضافة إلى نوع آخر من الاضطرابات العقلية، مثل: الهلوسات، والأوهام، وغيرهما. وتكون أعراضه مرتبطة بأوهام كئيبة، مثل: هلوسات الفقر، والمرض، وغيرهما. \n" +
                "\n" +
                "اكتئاب ما بعد الولادة:\n" +
                "يُعد أشد خطورة من الكآبة النفاسية التي تصيب أغلب النساء لمدة أسبوعين بعد الولادة. والمرأة المصابة باكتئاب ما بعد الولادة تواجه اكتئابًا شديدًا في أثناء فترة الحمل وبعد الولادة، ومن أعراضه: الحزن الشديد، والقلق، والإجهاد، مما يؤثر في أنشطتها اليومية، وعنايتها بنفسها وطفلها.\n" +
                "\n" +
                "الاكتئاب ثنائي القطب:\n" +
                "يختلف اضطراب ثنائي القطب عن الاكتئاب، ولكن يتم ذكره ضمن أنواع الاكتئاب؛ لأن المصاب بثنائي القطب يواجه نوبات من الاكتئاب الشديد تتناوب مع نوبات ابتهاج عالية.",R.drawable.types);
        final titles p3 = new titles("أعراض الاكتئاب","الأعراض:\n" +
                " لا يعاني جميع المصابين بالاكتئاب الأعراض نفسها؛ حيث تختلف أعراضه من شخص لآخر بحسب حدة المرض، ومدة الإصابة به، وبحسب مرحلة المرض. وتصنف الأعراض كالتالي:\n" +
                "\u200Bأعراض نفسية:\n" +
                "o\tالحزن المستمر.\n" +
                "o\tضعف الثقة بالنفس، والشعور بالدونية.\n" +
                "o\tالشعور باليأس، والإحساس بالذنب.\n" +
                "o\tالشعور بالقلق، والتوتر.\n" +
                "o\tنقص، أو انعدام الرغبة، أو المتعة بالنشاطات التي كانت تثير الرغبة والمتعة.\n" +
                "o\tصعوبات في التركيز، أو اتخاذ القرارات.\n" +
                "o\tالتفكير بالموت، أو الانتحار.\n" +
                "\n" +
                "\u200Bأعراض جسدية:\n" +
                "o\tصعوبة النوم ليلًا، مع الاستيقاظ باكرًا، أو النوم الزائد.\n" +
                "o\tالشعور بالخمول، وانعدام النشاط.\n" +
                "o\tانخفاض الشهية ونقصان الوزن، أو زيادة الشهية وزيادة الوزن.\n" +
                "o\tالصداع، وآلام العضلات بلا سبب واضح.\n" +
                "o\tالتحدث، والتحرك ببطء.\n" +
                "o\tاضطراب الأمعاء (الإمساك).\n" +
                "o\tفقدان الرغبة الجنسية.\n" +
                "o\tتغيرات في الدورة الشهرية.\n" +
                "\n" +
                "أعراض اجتماعية:\n" +
                "o\tالميل للانعزالية.\n" +
                "o\tعدم الاهتمام بالواجبات بالعمل، أو المدرسة.\n" +
                "o\tالابتعاد عن الأهل، والأصدقاء المقربين.\n" +
                "o\tتعاطي المهدئات، والكحول.\n" +
                "\n" +
                " هنالك بعض الحالات تصاحبها أعراض مشابهة لأعراض الاكتئاب، مثل: مشكلات الغدة الدرقية، أو ورم في الدماغ، أو نقص الفيتامينات، مثل فيتامين (د). لذلك يجب التحقق من الحالة الصحية قبل تشخيص الاكتئاب.",R.drawable.nopath);
        final titles p4 = new titles("الفرق بين الحزن والاكتئاب","\n" +
                "الفرق بين الحزن والاكتئاب:\n" +
                "عند حدوث خسائر في الحياة قد يصعب على الشخص تحملها، مثل: وفاة شخص عزيز، أو خسارة الوظيفة، أو انتهاء العلاقات، وغيرها. ومن الطبيعي أن يصاب بالحزن، وقد يعتقد أنه قد أصيب بالاكتئاب. وفي الواقع أن الشعور بالحزن ليس كالاكتئاب. فالحزن أمر طبيعي، ويختلف من شخص إلى آخر، ويشبه الاكتئاب في بعض خصائصه، مثل: العبوس، والعزلة، وغير ذلك، ولكنهما يختلفان في نواحٍ أخرى :\n" +
                "\u200B\u200B  \n" +
                "الحزن :\n" +
                "\u200Bرد فعل طبيعي تجاه الخسائر\n" +
                "\n" +
                "الاكتئاب :\n" +
                "\n" +
                "\u200Bحالة مرضية.\n" +
                "\n" +
                "الحزن :\n" +
                "\n" +
                "\u200Bالشعور بالحزن قد يكون مؤقتًا، ولا يزال الشخص قادرًا على الاستمتاع بالأمور الأخرى، والتطلع إلى لمستقبل.\n" +
                "\n" +
                "الاكتئاب :\n" +
                "\u200Bيستمر الشعور بالحزن، ولا يستطيع الشخص الاستمتاع، ولا التفكير في المستقبل بإيجابية.\n" +
                "\n" +
                "الحزن :\n" +
                "\n" +
                "\u200Bلا يزال الشخص محتفظًا بثقته بنفسه.\n" +
                "\n" +
                "الاكتئاب :\n" +
                "\n" +
                "\u200Bالشعور بالدونية أمر شائع.\n" +
                "\n" +
                "هنالك بعض الأمور التي قد تسبب الاكتئاب لبعضهم، ولكنها تسبب حزنًا فقط لآخرين. والتفريق بينهما يساعد كثيرًا في تجاوز الأمور الصعبة، ويساعد على إيجاد العلاج المناسب.\n" +
                "\n",R.drawable.sadnessdepression);
        mytitles.add(p1);
        mytitles.add(p2);
        mytitles.add(p3);
        mytitles.add(p4);


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
                .withToolbar(toolbar)
                //.withDrawerGravity(Gravity.END)

                // Items Intents

                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        if (drawerItem.getIdentifier() == 1) {
                            Intent a = new Intent(depression_definision_titles.this, MainActivity.class);
                            startActivity(a);
                        }

                        if (drawerItem.getIdentifier ()==2){
                            Intent b = new Intent(depression_definision_titles.this,test_start.class);
                            startActivity(b);
                        }

                        if (drawerItem.getIdentifier ()==3){
                            Intent c = new Intent(depression_definision_titles.this,depression_doctors_list.class);
                            startActivity(c);
                        }

                        if (drawerItem.getIdentifier ()==4){
                            Intent d = new Intent(depression_definision_titles.this,depression_legends_title.class);
                            startActivity(d);
                        }

                        if (drawerItem.getIdentifier ()==5){
                            Intent e = new Intent(depression_definision_titles.this,contact_us.class);
                            startActivity(e);
                        }
                        if(drawerItem.getIdentifier ()==6){
                            Intent f = new Intent(depression_definision_titles.this,settings.class);
                            startActivity(f);
                        }

                        return false;
                    }
                })
                .build();


        //conneting it to the adapter


        RecyclerView rv = findViewById(R.id.definition_recycler);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        what_isAdapter adapter = new what_isAdapter(mytitles,this);
        rv.setAdapter(adapter);
    }
}