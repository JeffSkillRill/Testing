package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "999*999/999*7 ?",

           "6993",
           "7000",
           "6997",
           "2022",
           1
       )
       var question2 = QuestionData(
           2,
           "4+8*7/5-99*751 ?",

           "74333.8",
           "-7433.8",
           "-8000.21",
           "-9997",
           2
       )
       var question3 = QuestionData(
           3,
           "2000-9 ?",

           "1991",
           "1993",
           "1998",
           "1990",
           1
       )
       var question4 = QuestionData(
           4,
           "2+9*7+6-55+66 ?",

           "78",
           "79",
           "75",
           "44",
           3
       )

       var question5 = QuestionData(
           5,
           "666-78/78+6+4-99+312 ?",

           "888",
           "887",
           "122",
           "897",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}