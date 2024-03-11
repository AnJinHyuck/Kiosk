package com.example.kiosk

class Beer {
    fun beerMenu() {
        println(
            "[ Beer MENU ]\n" +
                    "1. Cass                | W 6.9 |\n" +
                    "2. Cloud               | W 8.9 |\n" +
                    "3. beer1               | W 9.4 |\n" +
                    "4. beer2               | W 6.9 |\n" +
                    "5. beer3               | W 5.4 |\n" +
                    "0. 뒤로가기       | 뒤로가기"
        )
        var beerSelect = readln().toInt()

        when (beerSelect) {
            1 -> println("Cass를 선택하셨습니다 잠시만 기다려주세요")
            2 -> println("Cloud를 선택하셨습니다 잠시만 기다려주세요")
            3 -> println("beer1을 선택하셨습니다 잠시만 기다려주세요")
            4 -> println("beer2를 선택하셨습니다 잠시만 기다려주세요")
            5 -> println("beer3를 선택하셨습니다 잠시만 기다려주세요")
            0 -> return
        }
    }
}