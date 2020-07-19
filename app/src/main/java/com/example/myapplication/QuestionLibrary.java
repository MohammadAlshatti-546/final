package com.example.myapplication;


public class QuestionLibrary {


        //array of questions


        public static String mQuestions[] = {

                "تجد صعوبة في التركيز بالمهام اليومية",
                "لا تجد أي متعة في الحياة",
                "تفكر في إيذاء نفسك أو الانتحار",
                "تأكل كثيرا جدا ، أو قليلا جدا",
                "مليء بالطاقة العصبية , أو تتحرك أقل من المعتاد",
                "تنام كثيرا , أو تعاني من الأرق",
                "هل أنت قاس مع نفسك , أو تنتقد نفسك بإفراط",
                "تشعر بالإحباط أو عدم الثقة",
                "تشعر بالخمول",
        };


        //array of options


        private String mChoices[][] = {

                {"ابدا", "في بعض الاحيان", "غالبا", "دائما"},
                {"ابدا", "في بعض الاحيان", "غالبا", "دائما"},
                {"ابدا", "في بعض الاحيان", "غالبا", "دائما"},
                {"ابدا", "في بعض الاحيان", "غالبا", "دائما"},
                {"ابدا", "في بعض الاحيان", "غالبا", "دائما"},
                {"ابدا", "في بعض الاحيان", "غالبا", "دائما"},
                {"ابدا", "في بعض الاحيان", "غالبا", "دائما"},
                {"ابدا", "في بعض الاحيان", "غالبا", "دائما"},
                {"ابدا", "في بعض الاحيان", "غالبا", "دائما"}
        };




        public String getQuestion(int a) {
                String question = mQuestions[a];
                return question;
        }

        public String getChoice1(int a) {
                String choice0 = mChoices[a][0];
                return choice0;
        }

        public String getChoice2(int a) {
                String choice1 = mChoices[a][1];
                return choice1;
        }
        public String getChoice3(int a) {
                String choice2 = mChoices[a][2];
                return choice2;
        }
        public String getChoice4(int a) {
                String choice3 = mChoices[a][3];
                return choice3;
        }




}