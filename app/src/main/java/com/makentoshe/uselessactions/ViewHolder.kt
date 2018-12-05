package com.makentoshe.uselessactions

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Class contains UI views for fast and easy access.
 */
class ViewHolder(activity: AppCompatActivity) {
    val passportFirstNameEditText = activity.findViewById<TextView>(R.id.first_name)
    val passportLastNameEditText = activity.findViewById<TextView>(R.id.last_name)
    val birthdayEditText = activity.findViewById<TextView>(R.id.birthday)
    val loginEditText = activity.findViewById<TextView>(R.id.login)
    val mailEditText = activity.findViewById<TextView>(R.id.mail)
    val passwordEditText = activity.findViewById<TextView>(R.id.password1)
    val repeatPasswordEditText = activity.findViewById<TextView>(R.id.password2)
    val secretQuestionEditText = activity.findViewById<TextView>(R.id.question)
    val secretAnswerEditText = activity.findViewById<TextView>(R.id.answer)
    val phoneNumberEditText = activity.findViewById<TextView>(R.id.phone)
    val countryEditText = activity.findViewById<TextView>(R.id.country)
    val cityEditText = activity.findViewById<TextView>(R.id.city)
    val streetEditText = activity.findViewById<TextView>(R.id.street)
    val houseEditText = activity.findViewById<TextView>(R.id.house)
}