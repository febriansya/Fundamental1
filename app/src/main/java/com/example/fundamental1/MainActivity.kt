package com.example.fundamental1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.button_move_to_activity)
        btnMoveActivity.setOnClickListener(this)
        val btnMoveAvtivityWithData: Button = findViewById(R.id.button_move_to_activity_with_data)
        btnMoveAvtivityWithData.setOnClickListener(this)
        val btnMoveActivityWithDataObject: Button = findViewById(R.id.btn_move_activity_with_object)
        btnMoveActivityWithDataObject.setOnClickListener(this)

        val btnMoveDialNumber: Button = findViewById(R.id.btn_dial_number)
        btnMoveDialNumber.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.button_move_to_activity -> {
                val intent = Intent(this@MainActivity, OnlyMoveActivity::class.java)
                startActivity(intent)
            }
            R.id.button_move_to_activity_with_data -> {
                val intent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                intent.putExtra(MoveWithDataActivity.EXTRA_NAME, "yan febriansyah")
                intent.putExtra(MoveWithDataActivity.EXTRA_AGE, 12)
                startActivity(intent)
            }
            R.id.btn_move_activity_with_object -> {

                val person = Person(
                    name = "yan febriansyah",
                    12,
                    "kawo",
                    "yangagah23@gmai.com",
                    "jln.kawo, batunyala"
                )
                val intent = Intent(this@MainActivity, MoveActivity::class.java)
                intent.putExtra(MoveActivity.EXTRA_PERSON, person)
                startActivity(intent)
            }
            R.id.btn_dial_number -> {
                val phoneNumber = "081803767462"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}