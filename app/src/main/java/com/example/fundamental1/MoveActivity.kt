package com.example.fundamental1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        val dataActivity: TextView = findViewById(R.id.move_with_data)

        val movObjectData: TextView = findViewById(R.id.move_object)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

//        getwith data class getparcelalbe
        val objectPerson = intent.getParcelableExtra<Person>(EXTRA_PERSON) as Person


        val text = "Name $name, your age : $age "
        val objectper =
            "name ${objectPerson.name}, kance age : ${objectPerson.age}, kance address : ${objectPerson.address}, kance email : ${objectPerson.email}"
        dataActivity.text = text
        movObjectData.text = objectper

    }
}