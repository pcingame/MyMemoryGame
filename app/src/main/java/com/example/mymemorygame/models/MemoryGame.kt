package com.example.mymemorygame.models

import com.example.mymemorygame.utils.DEFAULT_ICON

class MemoryGame(
    private val boardSize: BoardSize
) {
    val cards: List<MemoryCard>
    val numPairFound = 0

    init {
        val chosenImages = DEFAULT_ICON.shuffled().take(boardSize.getNumPairs())
        val randomizedImages = (chosenImages + chosenImages).shuffled()
        cards = randomizedImages.map { MemoryCard(it) }
    }
}