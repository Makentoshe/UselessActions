package com.makentoshe.uselessactions

import android.widget.TextView

/**
 * Class checks view holder.
 */
class DataCheck {

    /**
     * Checks all fields. If at least one field was not filled the exception will be thrown.
     */
    fun checkFields(viewHolder: ViewHolder) {
        checkField(viewHolder.passportFirstNameEditText)
        checkField(viewHolder.passportLastNameEditText)
        checkField(viewHolder.birthdayEditText)
        checkField(viewHolder.loginEditText)
        checkField(viewHolder.mailEditText)
        checkField(viewHolder.passwordEditText)
        checkField(viewHolder.repeatPasswordEditText)
        checkField(viewHolder.secretQuestionEditText)
        checkField(viewHolder.secretAnswerEditText)
        checkField(viewHolder.phoneNumberEditText)
        checkField(viewHolder.countryEditText)
        checkField(viewHolder.cityEditText)
        checkField(viewHolder.streetEditText)
        checkField(viewHolder.houseEditText)
    }

    /**
     * Throws exception if field was not filled.
     */
    private fun checkField(textView: TextView) {
        if (textView.text.isBlank())
            throw IllegalStateException("Some fields were not filled.")
    }
}