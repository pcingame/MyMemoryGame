package com.example.mymemorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcvBoard.adapter = MemoryBoardAdapter(this, 8)
        rcvBoard.setHasFixedSize(true)
        rcvBoard.layoutManager = GridLayoutManager(this, 2)
    }
}