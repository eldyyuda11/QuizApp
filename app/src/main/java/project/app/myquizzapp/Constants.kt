package project.app.myquizzapp

object Constants {
    const val USER_NAME: String ="user_name"
    const val TOTAL_QUESTIONS :String = "total_question"
    const val  CORRECT_ANSWERS: String ="correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionsList= ArrayList<Question>()
        val que1 = Question(
            1,"What country does flag belong to?",R.drawable.ic_flag_indonesia,
            "Brunei","Australia","Indonesia","Monaco",
            3
        )
        questionsList.add(que1)
        val que2 = Question(
            2,"What country does flag belong to?",R.drawable.ic_flag_czechia,
            "Slovakia","Czehia","Mozambik","Mexico",
            2
        )
        questionsList.add(que2)
        val que3 = Question(
            3,"What country does flag belong to?",R.drawable.ic_flag_germany,
            "Germany","Canada","Belgium","Monaco",
            1
        )
        questionsList.add(que3)
        val que4 = Question(
            4,"What country does flag belong to?",R.drawable.ic_flag_elsavador,
            "Papua Nugini","Filipina","Bermuda","El Savador",
            4
        )
        questionsList.add(que4)
        val que5 = Question(
            5,"What country does flag belong to?",R.drawable.ic_flag_mozambik,
            "Mozambik","Iran","Ukraine","Kazakstan",
            1
        )
        questionsList.add(que5)
        val que6 = Question(
            6,"What country does flag belong to?",R.drawable.ic_flag_spain,
            "Vantikan","Spain","Kwait","India",
            2
        )
        questionsList.add(que6)
        val que7 = Question(
            7,"What country does flag belong to?",R.drawable.ic_flag_australia,
            "South Africa","Kongo","Australia","China",
            3
        )
        questionsList.add(que7)

        val que8 = Question(
            8,"What country does flag belong to?",R.drawable.ic_flag_turkmenistan,
            "Brunei","Australia","Indonesia","TUrkmenistan",
            4
        )
        questionsList.add(que8)
        val que9 = Question(
            9,"What country does flag belong to?",R.drawable.ic_flag_usa,
            "USA","Australia","English","Hungary",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            10,"What country does flag belong to?",R.drawable.ic_flag_canada,
            "Rusia","Mesir","Canada","Monaco",
            3
        )
        questionsList.add(que10 )
        return questionsList
    }
}