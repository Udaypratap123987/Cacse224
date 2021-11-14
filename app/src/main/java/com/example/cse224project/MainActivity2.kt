package com.example.cse224project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.CheckBox
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var rg_gender : RadioGroup
    lateinit var rb_male : RadioButton
    lateinit var rb_female : RadioButton
    lateinit var rb_other : RadioButton

    lateinit var cb_playing : CheckBox
    lateinit var cb_coding : CheckBox
    lateinit var cb_watching : CheckBox
    lateinit var cb_singing: CheckBox
    lateinit var btb_submit : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca2question)
        rg_gender = findViewById(R.id.radiogroup) as RadioGroup
        rb_male = findViewById(R.id.radioButton) as RadioButton
        rb_female = findViewById(R.id.radioButton2) as RadioButton
        rb_other = findViewById(R.id.radioButton3) as RadioButton

        cb_playing = findViewById(R.id.ch1) as CheckBox
        cb_coding = findViewById(R.id.ch2) as CheckBox
        cb_watching = findViewById(R.id.ch3) as CheckBox
        cb_singing = findViewById(R.id.ch4) as CheckBox

        btb_submit = findViewById(R.id.button) as  Button


        cb_playing.setOnClickListener{
            if(cb_playing.isChecked)
                Toast.makeText(this@MainActivity2,"You checked Playing Cricket",Toast.LENGTH_SHORT).show()
            if(!cb_playing.isChecked)
                Toast.makeText(this@MainActivity2,"You Unchecked Playing Cricket",Toast.LENGTH_SHORT).show()
        }
        cb_coding.setOnClickListener{
            if(cb_coding.isChecked)
                Toast.makeText(this@MainActivity2,"You checked coding",Toast.LENGTH_SHORT).show()
            if(!cb_coding.isChecked)
                Toast.makeText(this@MainActivity2,"You Unchecked coding",Toast.LENGTH_SHORT).show()
        }
        cb_watching.setOnClickListener{
            if(cb_watching.isChecked)
                Toast.makeText(this@MainActivity2,"You checked Watching Movie",Toast.LENGTH_SHORT).show()
            if(!cb_watching.isChecked)
                Toast.makeText(this@MainActivity2,"You Unchecked Watching Movie",Toast.LENGTH_SHORT).show()
        }
        cb_singing.setOnClickListener{
            if(cb_singing.isChecked)
                Toast.makeText(this@MainActivity2,"You checked Singing",Toast.LENGTH_SHORT).show()
            if(!cb_singing.isChecked)
                Toast.makeText(this@MainActivity2,"You Unchecked Singing",Toast.LENGTH_SHORT).show()
        }
        rb_male.setOnClickListener{
            Toast.makeText(this@MainActivity2,"You selected Male",Toast.LENGTH_SHORT).show()
        }
        rb_female.setOnClickListener{
            Toast.makeText(this@MainActivity2,"You selected Female",Toast.LENGTH_SHORT).show()
        }
        rb_other.setOnClickListener{
            Toast.makeText(this@MainActivity2,"You selected Other",Toast.LENGTH_SHORT).show()
        }

    }
}