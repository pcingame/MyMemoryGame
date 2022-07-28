package com.example.mymemorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mymemorygame.models.BoardSize
import com.example.mymemorygame.models.MemoryCard
import com.example.mymemorygame.models.MemoryGame
import com.example.mymemorygame.utils.DEFAULT_ICON
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainA"
    }

    private var boardSize: BoardSize = BoardSize.MEDIUM


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val memoryGame = MemoryGame(boardSize)

        rcvBoard.adapter = MemoryBoardAdapter(
            this,
            boardSize,
            memoryGame.cards,
            object : MemoryBoardAdapter.CardClickListener {
                override fun onCardClicked(position: Int) {
                    Log.i(TAG, "onCardClicked: $position")
                }

            })
        rcvBoard.setHasFixedSize(true)
        rcvBoard.layoutManager = GridLayoutManager(this, boardSize.getWidth())
    }
}