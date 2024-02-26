package com.example.testingcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.testingcompose.model.ScrambleWord
import com.example.testingcompose.viewmodel.UnscrambleWordViewModel

class MainActivity2 : AppCompatActivity() {

    lateinit var unscrambleWordViewModel : UnscrambleWordViewModel
    lateinit var t1 : TextView
    lateinit var t2 : TextView
    lateinit var t3 : TextView
    lateinit var t4 : TextView
    lateinit var t5 : TextView
    lateinit var t6 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        t1 = findViewById(R.id.textView)
        t2 = findViewById(R.id.textView2)
        t3 = findViewById(R.id.textView3)
        t4 = findViewById(R.id.textView4)
        t5 = findViewById(R.id.textView5)
        t6 = findViewById(R.id.textView6)

        val a : String = t1.text.toString()
        val b : String = t2.text.toString()
        val c : String = t3.text.toString()
        val d : String = t4.text.toString()
        val e : String = t5.text.toString()
        val f : String = t6.text.toString()

        val n = ScrambleWord(a,b,c,d,e,f)
        unscrambleWordViewModel.insert(n)


    }
}