package com.example.mymemorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mymemorygame.models.BoardSize
import com.example.mymemorygame.utils.DEFAULT_ICON
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var boardSize: BoardSize = BoardSize.MEDIUM


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chosenImages = DEFAULT_ICON.shuffled().take(boardSize.getNumPairs())
        val randomizedImages = (chosenImages + chosenImages).shuffled()

        rcvBoard.adapter = MemoryBoardAdapter(this, boardSize, randomizedImages)
        rcvBoard.setHasFixedSize(true)
        rcvBoard.layoutManager = GridLayoutManager(this, boardSize.getWidth())
    }
}