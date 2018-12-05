package com.makentoshe.uselessactions

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var viewHolder: ViewHolder
    private val dataCheck = DataCheck()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewHolder = ViewHolder(this)

        findViewById<Button>(R.id.cancel).setOnClickListener(::onCancelButtonClicked)
        findViewById<Button>(R.id.next).setOnClickListener(::onNextButtonClicked)
    }

    private fun onNextButtonClicked(ignore: View) {
        try {
            dataCheck.checkFields(viewHolder)
        } catch (exception: IllegalStateException) {
            //block calls when at least one field was not filled
            showErrMessage(exception.message!!)
            return
        }
        setContentView(R.layout.activity_main_next)
    }

    /**
     * Same as back button
     */
    private fun onCancelButtonClicked(ignore: View) = onBackPressed()

    /**
     * Displays error message with text [message] on the red background.
     */
    private fun showErrMessage(message: String) = showMessage(message, Color.RED)

    /**
     * Displays message with text [message] on the green background.
     */
    private fun showOkMessage(message: String) = showMessage(message, Color.GREEN)

    /**
     * Displays message with text [message] on the background with the [color].
     */
    private fun showMessage(message: String, color: Int) {
        //create toast
        val toast = Toast.makeText(this, message, Toast.LENGTH_LONG)
        //add filter to the toast background - makes it red
        toast.view.background.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
        //and show
        toast.show()
    }
}