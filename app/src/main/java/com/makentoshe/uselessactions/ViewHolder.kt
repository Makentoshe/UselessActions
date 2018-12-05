package com.makentoshe.uselessactions

import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Class contains UI views for fast and easy access.
 */
class ViewHolder(activity: AppCompatActivity) {
    val passportFirstNameEditText = activity.findViewById<TextView>(R.id.first_name)
    val passportLastNameEditText = activity.findViewById<EditText>(R.id.last_name)
    val birthdayEditText = activity.findViewById<EditText>(R.id.birthday)
    val loginEditText = activity.findViewById<EditText>(R.id.login)
    val mailEditText = activity.findViewById<EditText>(R.id.mail)
    val passwordEditText = activity.findViewById<EditText>(R.id.password1)
    val repeatPasswordEditText = activity.findViewById<EditText>(R.id.password2)
    val secretQuestionEditText = activity.findViewById<EditText>(R.id.question)
    val secretAnswerEditText = activity.findViewById<EditText>(R.id.answer)
    val phoneNumberEditText = activity.findViewById<EditText>(R.id.phone)
    val countryEditText = activity.findViewById<EditText>(R.id.country)
    val cityEditText = activity.findViewById<EditText>(R.id.city)
    val streetEditText = activity.findViewById<EditText>(R.id.street)
    val houseEditText = activity.findViewById<EditText>(R.id.house)
}