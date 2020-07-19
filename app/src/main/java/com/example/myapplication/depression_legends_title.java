package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

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

public class depression_legends_title extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_legends_title);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        Toolbar toolbaration = findViewById(R.id.toolbar_legend);
        setSupportActionBar(toolbaration);
        getSupportActionBar().setTitle("");

        //creating the array for titles

        ArrayList<legends_titles> my_legend = new ArrayList<>();

        //creating and adding titles

        legends_titles p1 = new legends_titles("اندرو سليمان ج 1"," شعرت بمأتم في ذهني، وظلّت خطى المعزين جيئة وذهاباً تطأ، وتطأ حتى شعرت أنه كان حقيقة لاشك فيها. وعندما جلسوا جميعاً، بدأت موعظة، كالطبل، ضلّ يقرع و يقرع، حتى شعرت بأن عقلي بدأ يتخدّر. و ثم سمعتهم يرفعون صندوقاً و سمعت صريراً عبر روحي من هذه الأحذية الرصاصية مرة أخرى، ثم بدأ الفضاء بالرنين، و كأن السماوات كانت جرساً و الوجود هو أذن، و أنا، و الصمت، إنه لعِرق غريب محطّم، وحيد، هنا. و هنا، تهشّم لوح في العقل، ورحت أغطس وأغطس وأرتطم مع كل غطسة بعالم من العوالم، حتى أنهيت المعرفة حينها.\" نحن نعرف الاكتئاب من خلال الألفاظ المجازية. استطاعت إيملي ديكنسون أن تعبر عنه لغوياً، كما استطاع جويا (رسام) التعبير عنه بصورة. إن نصف هدف الفن هو التعبير عن مثل هذه الحالات المجازية. بالنسبة لي، كنت دائماً أعتقد أنني قوي، أنني أحد هؤلاء الذين يستطيعون البقاء إن أُرسلت إلى معسكر اعتقال. في عام 1991، تعرضت إلى سلسة من الخسارات. لقد توفت أمي، انتهت علاقة عاطفية، و رجعت مرة أخرى إلى الولايات المتحدة بعد عدد من السنوات في الخارج، و استطعت الصمود خلال كل هذا الأحداث. لكن في عام 1994، بعد ثلاثة سنوات، وجدت نفسي أفقد الاهتمام في كل شيء تقريباً. لم أشأ أن أقوم بأيٍ من الأشياء التي أردت في السابق عملها، لم أعرف السبب. إن ضد الاكتئاب ليس السعادة، إنما الحيوية، و بدا أن الحيوية هي ما كان يتسرب بعيداً عني في تلك اللحظة. كل ما وجب فعله بدا و كأنه عمل شاق. كنت أعود إلى المنزل و أرى الضوء الأحمر يومض في آلة الرد الآلي، لكن عوضاً عن الإبتهاج لسماع أخبار أصدقائي، كنت أفكر: \"إنه لعدد كبير من الناس لأعاود الإتصال بهم.\" أو عندما كان عليّ تناول الغداء، كنت أفكر، يجب أن أخرج الطعام و أضعه على طبق و أقطعه و أمضغه و أبلعه، و شعرت كأنها <i>محطات الصليب</i> و أحد الأشياء التي تضيع غالباً عند الحديث عن الاكتئاب هي أنك تعلم أنه سخيف. أنت تعلم أنه سخيف خلال معايشتك له. أنت تعلم أن أغلب الناس تتدبر السماع إلى رسائلها الصوتية و تناول الغداء و الاستعداد للاستحمام و الخروج من الباب الأمامي و هذا ليس بالقضية المهمة، لكنك مع ذلك في قبضته و أنت غير قادر على إيجاد طريقة للإفلات منها. فوجدت نفسي أفعل أموراً أقل من السابق و أفكر أقل و أشعر أقل. إنه نوع من الفراغ. و ثم بدأ التوتر يصيبني. إن أخبرتني أنني يجب أن أصاب بالاكتئاب لمدة شهر، لقلت: \"ما دمت أعلم أنه سوف ينتهي في نوفمبر، أستطيع القيام بذلك.\" لكن إن قلت لي: \"يجب أن تصاب بتوتر حاد لمدة شهر،\" فإنني أفضل قطع شرايين رسغي على ذلك. ذلك بسبب الشعور المستمر الذي كنت أشعر به كالإحساس الذي ينتابك إذا كنت ماشياً و زلقت أو تعثّرت و ترى الأرض تقترب بسرعة، لكن عوضاً عن استمراره لنصف ثانية، كالمفترض، فإنه استمر لستة أشهر. إنه الشعور المستمر بالخوف لكن دون حتى معرفة ما الذي يخيفك. عند تلك اللحظة بدأت أفكر أن الحياة محالة مع هذا الألم، و أن السبب الوحيد في عدم انتحاري هو كي لا أؤذي الناس الآخرين. و في يوم من الأيام، صحيت و اعتقدت أنني قد أصبت بجلطة، لأنني كنت ممدداً على الفراش دون أي حركة، أنظر إلى الهاتف، و أنا أفكر، \"هناك أمر مريب و يجب أن أتصل للمساعدة،\" و لم يكن باستطاعتي مد يدي لأحمل الهاتف و أتصل. بالنهاية، بعد أربعة ساعات من استلقائي و تحديقي به، رن الهاتف، و بطريقة ما استطعت الإجابة، لقد كان أبي المتصل، و قلت له: \"إنني في مشكلة حقيقية. علينا فعل شيء.\" في اليوم التالي بدأت بأخذ الأدوية و بالعلاج. و أيضاً بدأت أفكر بهذا السؤال المروّع: إن لم أكن هذا الشخص القوي الذي يستطيع الصمود في معسكر اعتقال، إذاً من أنا؟ و إن احتجت لأن آخذ الدواء، فهل هو يجعلني أقرب إلى شخصي، أم هو يغييرني إلى شخص آخر؟ و ما هو شعوري إن كان يعمل على تغييري إلى شخص آخر؟ لقد كان لدي ميزتان خلال خوضي المعركة. الأولى هي أنني كنت أعلم، موضوعياً، أني كنت أعيش حياة جيدة، و أنني إن تحسنت، سوف يكون لدي أمر يستحق العيش لأجله في نهاية المطاف. و الميزة الأخرى كانت قدرتي على الحصول على العلاج الجيد. لكن بالرغم من ذلك فقد تحسنت و انتكست، ثم تحسنت و انتكست، ثم تحسنت و انتكست، ثم بالنهاية أدركت حاجتي لأن أتناول الدواء و أخضع للعلاج إلى الأبد. و كنت أفكر: \"لكن هل هي مشكلة كيميائية أم سيكولوجية نفسية؟ و هل تحتاج إلى علاج كيميائي أم علاج فلسفي؟\" و لم أستطع معرفة أي من هذين هي كانت. ثم أدركت أننا بالواقع لسنا متطورين بالشكل الكافي في أيّ من المجالين لتفسير الأمور بالشكل الوافي. إن للعلاجين الكيميائي و السيكولوجي دورين مهمين معاً، و أيضاً استنتجت أن الاكتئاب هو شيء متداخل بعمق بحيث لا يوجد انفصال عن شخصنا أو شخصيتنا. أود أن أذكر أن العلاجات المتوفرة للاكتئاب تعد جذّابة. إلا أنها ليست فعّالة بالقدر الكافي. إنها مكلفة إلى أقصى الحدود. و تسبب عوارض جانبية تعد و لا تحصى. إنها كارثية. لكنني ممتن لأني أعيش بالزمن الحالي و ليس قبل 50 سنة مضت، حينما لم يوجد ما يمكن عمله. لذا أتمنى أن يسمع الناس بعد 50 سنة بالعلاجات التي أخذتها و يشعروا بالفزع من أن أحدهم قد تحمل علم بدائي كهذا. إن الاكتئاب هو الخلل في الحب. إن كنت متزوج من أحدهم و قلت لنفسك: \"حسناً، إن توفيت زوجتي، سوف أجد غيرها،\" هذا لن يكون الحب الذي نعرفه. لا يوجد حب دون ترقّب الخسارة، و هذا شبح اليأس يمكن أن يكون الدافع للمودة. هناك ثلاثة أمور يخلط الناس بينها: الاكتئاب، و الغم على فقيد و الحزن. إن الغم هو تفاعلي بشكل واضح. إن فقدت شخص و شعرت بعدم السعادة البالغ، و ثم، بعد ستة أشهر، أنت لا تزال تشعر بالحزن العميق، لكنك تستطيع القيام بالمهام اليومية بشكل أفضل بقليل، فإنك على الأرجح مغموم لفقدان الشخص، و على الأغلب سوف تتحسن من تلقاء نفسك لدرجة معينة. إن اختبرت خسارة كارثية، و شعرت بشعور رهيب، و بعد ستة أشهر أنت بالكاد قادر على القيام بأمور الحياة، فإنك على الأغلب تعاني من اكتئاب أثارته الظروف المأساوية. إن المسار يخبرنا بالكثير. إن الناس تنظر إلى الاكتئاب على أنه حزن و حسب. إنه مقدار كبير، فوق المحتمل من الحزن، الكثير الكثير من الغم، و السبب طفيف جداً بالمقارنة.",R.drawable.sleeman);
        legends_titles p2 = new legends_titles("اندرو سليمان ج 2 ","عندما قررت أن أفهم الاكتئاب، و أن أقابل الناس الذين جربوه، اكتشفت أنه هناك الكثير من الناس الذين يبدون من الخارج يعانون مما بدا و كأنه اكتئاب طفيف نسبياً إلا أنهم عاجزون تماماً بسببه. و هناك أشخاص آخرون يعانون مما بدا من وصفهم و كأنه اكتئاب حاد جداً بشكل رهيب لكنهم يعيشون حياة جيدة خلال الفترات بين انتكاساتهم. و قررت أن أجد السبب الذي يجعل بعض الناس أكثر مرونة من الآخرين. ما هي الآليات التي تساعد الناس على البقاء؟ و بدأت بالخروج لمقابلة الناس شخص تلو الآخر ممن كانوا يعانون من الاكتئاب. أحد أوائل الأشخاص الذين قابلتهم قد وصف لي الاكتئاب على أنه طريقة بطيئة للموت، و كان سماع ذلك في مرحلة مبكرة أمر جيد لأنه ذكرني بأن هذه الطريقة البطيئة للموت يمكن أن تؤدي فعلاً إليه، بأنه أمر خطير. إنه أكثر إعاقة شيوعاً في العالم، و يموت الناس بسببه كل يوم. أحد الأشخاص الذين كلمتهم بينما كنت أحاول فهم هذا الموضوع كانت صديقة عزيزة قد عرفتها لسنوات عديدة و قد مرت خلال نكسة ذُهانية خلال سنتها الأولى من الجامعة، ثم دخلت في اكتئاب مروّع. لقد عانت من الاكتئاب ثنائي القطب، أو الاكتئاب الهوسي، كما كان يعرف آن ذاك. و ثم قد تحسّنت كثيراً لسنوات عديدة بأخذها لليثيوم، و في النهاية، تم إيقاف دوائها لاختبار استجابتها لذلك، و ثم مرت بتجربة ذهانية مرة أخرى، ثم دخلت في أسوء اكتئاب قد رأيته في حياتي حيث جلست في شقة أهلها، مشلولة تقريباً، بدون حركة، يوم بعد يوم بعد يوم. و عندما قابلتها بخصوص هذه التجربة بعد عدة سنوات -- هي شاعرة و معالجة نفسية اسمها ماجي روبنز -- عندما قابلتها، قالت لي: \"كنت أغنّي 'أين ذهبت كل الزهور' مراراً و تكراراً لأَشغَلَ عقلي. كنت أغني لأمحو الأشياء التي كان عقلي يقولها، و التي كانت: 'أنت لا شيء. أنت لست شخص مهم. أنت حتى لا تستحقين العيش.' و هنا حقاً كانت بداية تفكيري بقتل نفسي.\" أنت لا تدرك بالاكتئاب أنك قد وضعت خمار رمادي و أنك ترى العالم من خلال ضباب مزاج سيّء. إنك تعتقد أن الخمار قد تمت إزالته، خمار السعادة، و أنك الآن ترى الحقيقة. إنه من الأسهل مساعدة مرضى الفصام الذين يدركون أنه هناك شيء غريب بداخلهم يجب طرده، لكنه صعب مع مرضى الاكتئاب، لأننا نعتقد أننا نرى الحقيقة. لكنّ الحقيقة تخدع. لقد أصبحت مهووساً بهذه الجملة: \"لكنّ الحقيقة تخدع.\" و اكتشفت، من خلال حديثي مع الأشخاص المصابين بالاكتئاب، أن لديهم العديد من المفاهيم المضللة. يقول الشخص: \"لا أحد يحبني.\" فتقول له: \"أنا أحبك، زوجتك تحبك، أمك تحبك.\" تستطيع الرد على ذلك بشكل فوري جداً، في أغلب الحالات على الأقل. لكن الأشخاص المصابين بالاكتئاب يقولون أيضاً: \"مهما فعلنا، بالنهاية سوف نموت جميعنا.\" أو قد يقولوا: \"لا يمكن أن يوجد اتصال حقيقي بين شخصين من البشر. كل منا محبوس في جسمه.\" و عليك الرد على ذلك بالقول: \"إن ذلك صحيح، لكن أعتقد أننا يجب أن نركز الآن على ماذا سنتناول على الفطور.\" في الكثير من الأحيان، ما يظهرونه ليس مرضاً، إنما بصيرة، و يبدأ الشخص بالتفكير أن الأمر الاستثنائي في الموضوع هو أن أغلبنا يعلم بهذه الأسئلة الوجودية إلا أنها لا تشتتنا كثيراً. لقد كانت هناك دراسة أعجبتني تحديداً حيث تم الطلب من مجموعة من الأشخاص المكتئبين و أخرى من أشخاص غير مكتئبين أن يلعبوا بلعبة فيديو لمدة ساعة، و في نهاية الساعة، تم سؤالهم عم عدد الوحوش الصغيرة التي اعتقدوا أنهم قد قتلوا. لقد كانت المجموعة المكتئبة دقيقة مع هامش خطأ بحدود 10 بالمئة، أما الأشخاص الغير مكتئبين فقد خمنوا بين 15 و 20 ضعف العدد الحقيقي للوحوش الصغيرة التي قتلوها بالفعل. لقد قال لي العديد من الناس، عندما قررت أن أكتب عن تجربتي مع الاكتئاب، لا بد أنه أمر صعب جداً أن أخرج للملأ، و أجعل الناس تعلم. لقد قالوا: \"هل تغييرت طريقة حديث الناس معك؟\" فقلت: \"نعم، أصبح الناس يكلّموني بطريقة مختلقة. إنهم يكلموني بطريقة مختلفة من حيث أنهم أصبحوا يخبرونني عن تجربتهم، أو تجربة أختهم، أو تجربة صديقهم. إن الأمور مختلفة لأنني أعلم الآن أن الاكتئاب هو سر العائلة الذي يخفيه الجميع. لقد ذهبت إلى مؤتمر قبل عدة سنوات، و في يوم الجمعة من المؤتمر الذي امتد لثلاثة أيام، كلمتني أحد المشاركات في حديث جانبي، و قالت لي: \"إنني أعاني من الاكتئاب و أنا محرجة قليلاً بشأن ذلك، لكنني آحذ هذا الدواء، و أردت فقط أن أسأل عن رأيك في ذلك؟\" فحاولت جاهداً أن أقدم لها النصيحة حسب استطاعتي. و ثم قالت لي: \"كما تعلم، إن زوجي ما كان أبداً ليتفهم هذا. إنه ذلك النوع من الرجال الذي لا يفهم أمر كهذا، لذا، كما تعلم، أبقي الأمر بيننا.\" فقلت: \"حسناً، سوف أفعل.\" في يوم الأحد من نفس المؤتمر، أخذني زوجها في حديث جانبي، و قال: \"إن زوجتي لن تعتقد أنني رجل كفاية إن علمت بهذا الأمر، لكني أعاني من هذا الاكتئاب و أنا أتناول دواء معين، و إنني أتسائل عن رأيك بخصوص ذلك؟\" لقد كانوا يخبئون الدواء نفسه في مكانين مختلفين في غرفة النوم نفسها. فقلت إنني أعتقد أن التواصل في الزواج قد يكون السبب في بعض مشاكلهم. لكني كنت أيضاً مذهول من الطبيعة المرهقة لتكتم متبادل كهذا. إن الاكتئاب متعب جداً. إنه يستهلك الكثير من وقتك و طاقتك، و الصمت حيال الاكتئاب، يجعله أسوأ حقاً. و ثم بدأت أفكر بكل الطرق التي يساعد الناس بها أنفسهم. لقد بدأت كشخص متمسك بالطرق التقليدية للعلاج. لقد اعتقدت أنه هناك بضعة علاجات فعالة، لقد كان واضحاً أنها , لقد كان هناك الأدوية، هناك علاجات نفسية معينة، هناك العلاج بالصدمات الكهربائية، و أن أي شيء آخر فهو غير مُجدي. لكن لاحقاً اكتشفت أمراً. إن كان لديك سرطان في الدماغ، و قلت أن الوقوف على رأسك لمدة 20 دقيقة كل صباح يجعلك تشعر بتحسن، فإنه قد يشعرك بتحسن، إلّا أنك لا تزال تعاني من سرطان الدماغ، و أنت على الأرجح سوف تموت بسببه. لكن إن قلت إن لديك اكتئاب، و أن الوقوف على رأسك 20 دقيقة كل يوم يجعلك تشعر بتحسن، إذاً فقد نفع بالفعل، لأن الاكتئاب هو مرض يتعلق بكيفية شعورك، و إن شعرت بتحسن، فإذاً إنك لست مكتئب على نحو فعّال. لذا أصبحت متسامح أكثر مع العالم الواسع من العلاجات البديلة. و إنني أستلم رسائل، المئات من الرسائل من ناس يكتبون لي عما نفع معهم. أحدهم قد سألني خلف الكواليس اليوم عن الأدوية. ",R.drawable.sleeman);
        legends_titles p3 = new legends_titles("اندرو سليمان ج 3 ","إن الرسالة المفضلة لدي أرسلتها امرأة التي كتبت و قالت إنها جربت العلاج النفسي، و جربت الأدوية، و جربت تقريباً كل شيء. لكنها وجدت حل و آملت أن أخبر العالم به، و هو صنع أشياء صغيرة من الصوف. قد بعثت لي بعض منها ، عندما نظرت إلى علاجات بديلة، أصبح لدي منظور جديد للعلاجات الأخرى. لقد اختبرت طقس لطرد الأرواح في السنغال الذي تضمن الكثير من دم الخرفان الذي لن أذكره بالتفصيل الآن، لكن بعد عدة سنوات كنت في راوندا أعمل على مشروع مختلف، و صدف و أني قد وصفت تجربتي لشخص، فقال: \"حسناً، كما تعلم، إن ذلك يحصل في غرب أفريقيا، و نحن في شرقها، و شعائرنا مختلفة جداً في بعض النواحي، لكننا نمتلك بعض الشعائر التي لديها أمر يتوافق مع ما تصفه.\" فقلت: \"حقاً.\" قال: \"نعم،\" ذكر: \"لكنا عانينا مع العاملين في الصحة النفسية الغربيين، خصوصاً هؤلاء الذين أتو مباشرة بعد المجزرة.\" فقلت: \"ما نوع المعاناة تلك؟\" قال: \"حسناً، لقد كانوا يفعلوا هذا الأمر الغريب. لم يكونوا يأخذوا الناس إلى ضوء الشمس حيث تبدأ بالشعور بالتحسن. لم يدمجوا التطبيل أو الموسيقى لإثارة الناس. لم يُشركوا المجتمع بأسره. هم لم يجسّدوا الاكتئاب كروح غازِيَة. عوضاً عن ذلك فهم أخذوا الناس واحد تلو الآخر إلى غرف صغيرة داكنة وجعلوهم يتكلمون لمدة ساعة عن أمور سيئة قد حدثت لهم. قال: لقد وجب علينا أن نطلب منهم الرحيل. الآن في الطرف المقابل للعلاجات البديلة، دعني أخبركم عن فرانك روساكوف. لقد عانى فرانك روساكوف من ربما أسوأ اكتئاب قد رأيته في حياتي. لقد كان مكتئب على الدوام. لقد كان، عندما التقيته، قد وصل إلى نقطة حيث كان يخضع إلى العلاج بالصدمة الكهربائية كل شهر. ثم يشعر بالتشوش نوع ما لمدة أسبوع. ثم يشعر بالتحسن لأسبوع. ثم يسوء في الأسبوع التالي. ثم يخضع إلى جلسة علاج بالصدمة الكهربائبة أخرى. و قال لي عندما التقيته، \"إنه أمر لا يطاق عيش أسابيعي بهذه الطريقة. إنني لا أستطيع العيش هكذا، و قد قررت كيف سوف أنهيه إن لم أتحسن. لكن،\" قال لي: \"لقد سمعت ببروتوكول في مستشفى ماساتشوستس العام لعملية جراحية تسمى استئصال التلفيف الحزامي، و هي عملية جراحية للدماغ، و أعتقد أنني سوف أجرب ذلك.\" و أتذكر شعوري بالذهول في تلك اللحظة لفكرة أن شخص من الواضح أنه خاض العديد من التجارب السيئة مع العديد من العلاجات المختلفة لكن لا يزال لديه التفاؤل الكافي لتجربة علاج آخر. لقد أجرى العملية، و كانت ناجحة بشكل مذهل. الآن هو صديق لي. لديه زوجة رائعة و طفلين جميلين. لقد كتب لي رسالة في عيد الميلاد بعد العملية، و قال: \"لقد أرسل لي أبي هديتين هذه السنة، الأولى، عبارة عن حاملة أقراص مضغوطة (CD) ذات محرك من ذا شاربر إميج لم أكن بحاجة إليها، لكني عرفت أنه قد أعطاني إياها للاحتفال بحقيقة أنني أعيش مستقل لوحدي و أني أمتلك وظيفة يبدو أني أحبها. و الهدية الأخرى كانت صورة لجدتي، التي انتحرت. بينما أنا أفتحها، بدأت بالبكاء، و جاءت أمي و قالت، 'هل أنت تبكي على الأقارب الذين لم تعرفهم قط؟' فقلت: 'لقد عانت من نفس المرض الذي أعاني منه.' إنني أبكي الآن بينما أكتب هذه الرسالة. ليس لأني حزين جداً، لكن لدي مشاعر قوية، أعتقد، إنها لأني كان من الممكن أن أقتل نفسي، لكن والِدَيَّ ساعداني على المضي قدماً، و كذلك أطبائي، و ثم خضعت للعملية. إنني حي و ممتن. إننا نعيش في الزمن الصحيح، حتى لو لم نشعر دائما بذلك.\" لقد ذهلت بحقيقة أن الاكتئاب يتم النظر إليه بشكل كبير على أنه مرض حديث، خاص بالغرب، و بطبقة الدخل المتوسط، و ذهبت للبحث في أثره في مجموعة من الظروف الأخرى، و أحد الأشياء التي كنت مهتم بها بشكل كبير كانت الاكتئاب عند الفقراء. لذا خرجت في محاولة لمعرفة ما الذي يتم عمله للأشخاص الفقراء المصابين بالاكتئاب. و ما اكتشفته هو أن أغلب الناس الفقراء لا تتم معالجتهم من الاكتئاب. إن الاكتئاب هو نتيجة لقابلية جينية، و الذي يفترض أنه متوزع بالتساوي في مجموعة من الأشخاص، و حوادث مؤثرة، و التي تكون على الأغلب أكثر شدة عند الأشخاص الفقراء. لكن نجد أنه لو كانت لديك حياة رائعة جداً لكنك تشعر بالتعاسة طوال الوقت، إنك لتفكر: \"لماذا أشعر كذلك؟ لا بد أن لدي اكتئاب.\" و تقرر أن تجد علاجاً له. لكن إن كانت لديك حياة تعيسة كلياً، و أنت تشعر بالتعاسة طوال الوقت، إن شعورك يتوافق مع حياتك، و لن يخطر على بالك أن تقول: \"لربما هذا يمكن معالجته.\" فإذاً نحن لدينا وباء في هذا البلد من الاكتئاب بين الناس الفقراء الذين لم تتم مساعدتهم و لا معالجتهم و لا أحد يتكلم عن هذه المشكلة، و إنها لمأساة صخمة. لذا وجدت أكاديمية كانت تقوم بمشروع بحث في الأحياء الفقيرة خارج واشنطن العاصمة، و هناك قد اختارت نساء قد جِئن لمشاكل صحية أخرى و شخّصتهم بالاكتئاب، ثم وفرت لهن ستة أشهر من الإجراء العلاجي التجريبي. أحدهن، لولي، دخلت، و هذا ما قالته يوم ما دخلت. لقد قالت، و هي امرأة، على فكرة، قد كان لديها سبعة أطفال. لقد قالت: \"لقد كان لدي وظيفة لكن كان علي تركها لأنني لم أستطع الخروج من المنزل. ليس لدي ما أقول لأطفالي. في الصباح، لا أطيق الانتظار حتى يذهبوا، و ثم أصعد الفراش و أسحب الأغطية فوق رأسي، و في الثالثة عندما يعودون للمنزل، يكون الوقت قد مرّ بسرعة.\" قالت: \"كنت آخذ الكثير من التايلينول، أيّ ما أستطيع أخذه لأنام لمدة أطول. إن زوجي ينعتني بالغبية، و بالبشعة. تمنيت أن أستطيع ايقاف الألم.\" حسناً، تم قبولها لهذا الإجراء العلاجي التجريبي، و عندما قابلتها بعد ستة أشهر، لقد قبلت وظيفة في رعاية الأطفال لصالح البحرية الأمريكية، لقد تركت الزوج الذي يسيء معاملتها، و قالت لي: \"إن أطفالي أكثر سعادة بكثير الآن.\" قالت: \"في بيتي الجديد هناك غرفة للأولاد و غرفة للبنات، لكن مساءً، يصعد الجميع على سريري، و نقوم بعمل الواجبات و كل شيء سوية. أحدهم يريد أن يكون واعظ، الآخر يريد أن يكون رجل إطفاء، و أحد البنات تقول أنها سوف تصبح محامية. إنهم لا يبكون كالسابق، و لا يتشاجرون كما كانوا يفعلون. إنهم كل ما احتاجه الآن. إن الأمور تستمر بالتغير، طريقة لبسي، طريقة شعوري، طريقة تَصَرُّفي. إنني أستطيع الخروج دون خوف كالسابق، و لا أعتقد أن هذا المشاعر السيئة سوف تعود، و لولا د.ميراندا، لكنت لا أزال في المنزل و الأغطية فوق رأسي، إن استمريت بالحياة أصلاً. لقد دعيت الرب أن يرسل إلي ملك، و قد سمع دعائي.\" لقد تأثرت حقاً بهذا التجارب، و قررت أن أكتب عنها ليس فقط في كتاب كنت أكتبه، بل أيضاً في مقالة، فحصلت على عمولة من مجلة ذا نيويورك تايمز لكي أكتب عن الاكتئاب بين الفقراء. و سلمت قصتي، فاتصلت بي محررتي و قالت: \"نحن حقاً لا نستطيع نشر هذا.\" فقلت: \"لما لا؟\" قالت: \"إنها خيالية جداً. هؤلاء الأشخاص الذين هم نوع ما في أسفل سلم المجتمع و ثم يتلقون العلاج لبضعة أشهر و الآن هم قادرين فعلياً على إدارة مورجن ستاينلي (أشهر مؤسسة مصرفية)؟ إنها غير قابلة للتصديق و حسب.\" قالت: \"إنني حتى لم أسمع بأمر كهذا من قبل.\" فقلت: \"إن حقيقة أنك لم تسمعي عنه من قبل هو دليل على أنه أخبار. و أنتم مجلة أخبار.\" هكذا بعد بعض المفاوضات، وافقوا على نشرها. لكني أعتقد أن كثير مما قالوا له علاقة بطريقة غريبة بالنفور الذي لا يزال لدى الناس من فكرة العلاج، فكرة أن بطريقة ما إن خرجنا و عالجنا الكثير من الناس في المجتمعات الفقيرة، سوف يكون أمر استغلالي، لأننا سوف نكون نعمل على تغييرهم. يوجد هناك هذه العاقبة الأخلاقية الخاطئة التي تبدو في كل مكان أن علاج الاكتئاب، من الأدوية و ما إلى ذلك، هو خدعة، و أنه ليس طبيعي. و أعتقد أن ذلك مُضَلَل بشكل كبير. إنه من الطبيعي أن تفقد الناس أسنانها، لكن لا أحد يعترض على معجون الأسنان، على الأقل ليس من الناس الذين أعرفهم. ثم يقول الناس: \"حسناً، لكن أليس الاكتئاب جزء مما يجب أن يمر به الإنسان؟ ألم نتطور لكي نصاب بالاكتئاب؟ أليس هو جزء من شخصيتك؟\" و أرد على ذلك، إن المزاج تكيّفي. إن القدرة على الشعور بالحزن و الخوف و البهجة و المتعة و كل الأمزجة الأخرى التي نشعر بها، إنه لأمر قيّم جداً. و الاكتئاب الاكلنيكي هو أمر يحدث عندما يتعطل هذا النظام. إنه سوء تكيّف. إن الناس تأتي و تقول لي: \"لكني، أعتقد، لو أني تحمّلت لسنة أخرى، أعتقد أني أستطيع التخلص منه.\" و أقول دائماً لهم: \"قد تستطيع التخلص منه، إلا أنك لن يكون عمرك 37 مرة أخرى. إن الحياة قصيرة، و نحن نتحدث عن تَخَلِّيك عن سنة كاملة. فكر جيداً بالأمر.\" إنه لعوز غريب في اللغة الانجليزية، و في الكثير من اللغات الأخرى حقاً، أننا نستخدم الكلمة نفسها، الاكتئاب، لوصف شعور صبي عندما تمطر في عيد ميلاده، و لوصف شعور الشخص قبل إقدامه على الانتحار مباشرة. يقول الناس لي: \"حسناً، هل له صلة مع الحزن الطبيعي؟\" و أجيب، بطريقة ما هو متعلق بالحزن الطبيعي. هناك صلة إلى درجة معينة، لكنها نفس درجة الصلة بين امتلاكك سياج حديدي خارج منزلك الذي يصدأ في بقعة صغيرة و عليك صقله و إعادة طلائه قليلاً، و بين تركك للمنزل لمدة 100 سنة و يصدأ السياج كله حتى لا بقى منه إلا كومة من الغبار البرتقالي. و إنها هذه الكومة من الغبار البرتقالي، مشكلة الغبار البرتقالي هذه، هي المشكلة التي نتكلم عنها. فالآن يقول الناس: \"أنت تتناول حبوب السعادة هذه، و تشعر بالسعادة؟\" إنني لا أشعر بذلك. لكني لا أشعر بالحزن بخصوص تناول الغداء، و لا أشعر بالحزن بشأن آلة الرد الآلي، و لا أشعر بالحزن بشأن الاستحمام. بالحقيقة، أنا أعتقد، أنني أشعر أكثر، لأني أستطيع الشعور الحزن دون الفراغ. إني أشعر بالحزن تجاه خيبات الأمل في العمل، تجاه العلاقات التي دمرت، تجاه الاحتباس الحراري. هذه هي الأشياء التي أشعر الحزن تجاهها الآن. فسألت نفسي، إذاً، ما هي النتيجة؟ كيف لهؤلاء الناس الذين يعيشون حياة أفضل حتى مع اكتئاب أشد أن يتخطوا الأمر؟ ما هي آلية المرونة؟ و ما وجدته خلال الوقت هو أن الأشخاص الذين ينفون تجربهم، الذين يقولون: \"لقد كنت أعاني من الاكتئاب منذ زمن طويل و لا أريد التفكير بالأمر مرة أخرى و أنا لن أنظر إليه و سوف أستمر في حياتي،\" من المفارقة، هؤلاء هم أكثر الأشخاص مستعبدين من قبل مرضهم. إن دفع الاكتئاب بعيداً يقويه. بينما أنت تختبئ منه، هو ينمو. و الأشخاص الذين يتحسنوا هم هؤلاء القادرين على تحمل حقيقة أنهم مصابين بهذه الحالة. هؤلاء الذين يتحملون اكتئابهم هم الأشخاص الذين يصلون للمرونة. فقال لي فرانك روساكوف، \"إن استطعت أن أعيد الكَرَّة، أعتقد أنني سوف أتعامل مع الوضع بشكل مختلف، بشكل غريب، إنني ممتن لما مررت به. إنني ممتن لوجودي بالمستشفى 40 مرة. لقد علمني الكثير عن الحب، و علاقتي بوالدي و بأطبائي كانت عزيزة للغاية علي، و سوف تكون دوماً كذلك.\" و قالت ماجي روبنز: \"كنت متطوعة في عيادة للإيدز، و كنت فقط أتكلم و أتكلم و أتكلم، و كان الناس الذين أتعامل معهم ليسوا متفاعلين كثيراً، و اعتقدت: 'هذا تصرف ليس لطيف جداً أو متعاون من قبلهم.' ثم أدركت، أدركت أنهم لن يقوموا بأكثر من الحديث لبضعة دقايق في بداية الحديث القصير. إنه موقف حيث لم أكن مصابة بالإيدز و لم أكن أحتضر، لكني استطعت تحمل حقيقة أنهم كانوا كذلك. إن حاجاتنا هي أعظم ثرواتنا. لقد تعلمت أن أعطي كل الأمور التي أحتاجها.\" إن تقدير الاكتئاب عند الشخص لا يمنع الانتكاس، إلا أنه يغير المنظور للنكسة و حتى النكسة نفسها تصبح أسهل في التقبّل. إنها ليست مسألة إيجاد معنى عميق و الإقرار بأن اكتئابك هو ذو معنى. إنها في البحث عن هذا المعنى و التفكير، حينما يصيبك مرة أخرة: \"إنه سوف يكون رهيب لكني سوف أتعلم من تجربتي.\" لقد تعلمت من اكتئابي مدى قوة الشعور، كيف أنه يمكن أن يكون أكثر واقعية من الحقائق، و قد وجدت أن هذه التجربة قد ساعدتني على اختبار مشاعر إيجابية بطريقة مكثفة و مركزة بشكل أكبر. إن ضد الاكتئاب ليس السعادة، بل الحيوية، و في هذه الأيام، إن حياتي حيوية، حتى في الأيام التي أكون حزين بها. لقد شعرت بذلك المأتم في ذهني، و جلست بجانب التمثال الضخم على حافة العالم، لقد اكتشفت شيء بداخلي و هي الروح التي لم أكونها قبل ذلك اليوم 20 سنة مضت عندما باغتتني جهنم بزيارة. أعتقد أنني بينما كرهت كوني مكتئب و أكره أن أكتئب مرة أخرى، فقد وجدت طريقة لأحب الاكتئاب. إنني أحبه لأنه أجبرني على إيجاد البهجة و التعلق بها. إنني أحبه لأني في كل يوم أقرر، في بعض الأحيان بشجاعة، و في البعض الآخر بعكس المنطق، أن أتعلق بشدة بأسباب الحياة. و إنها، باعتقادي، لنشوة ذات امتياز كبير.",R.drawable.sleeman);
        my_legend.add(p1);
        my_legend.add(p2);
        my_legend.add(p3);


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
                            Intent a = new Intent(depression_legends_title.this, MainActivity.class);
                            startActivity(a);
                        }

                        if (drawerItem.getIdentifier ()==2){
                            Intent b = new Intent(depression_legends_title.this,test_start.class);
                            startActivity(b);
                        }

                        if (drawerItem.getIdentifier ()==3){
                            Intent c = new Intent(depression_legends_title.this,depression_doctors_list.class);
                            startActivity(c);
                        }

                        //if (drawerItem.getIdentifier ()==4){
                            //Intent d = new Intent(depression_legends_title.this,depression_legends_title.class);
                            //startActivity(d);
                        //}

                        if (drawerItem.getIdentifier ()==5){
                            Intent e = new Intent(depression_legends_title.this,contact_us.class);
                            startActivity(e);
                        }
                        if(drawerItem.getIdentifier ()==6){
                            Intent f = new Intent(depression_legends_title.this,settings.class);
                            startActivity(f);
                        }

                        return false;
                    }
                })
                .build();


        //conneting it to the adapter

        RecyclerView rv = findViewById(R.id.legends_recycler);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        legends_adapter adapter = new legends_adapter(my_legend,this);
        rv.setAdapter(adapter);
    }
}