package com.example.kiosk

class Drinks {
        fun drinksMenu() {
            println(
                "[ Drinks MENU ]\n" +
                        "1. Coke                | W 6.9 |\n" +
                        "2. Sprite              | W 8.9 |\n" +
                        "3. Zero Coke           | W 9.4 |\n" +
                        "4. Zero Sprite         | W 6.9 |\n" +
                        "5. Vanilla Shake       | W 5.4 |\n" +
                        "0. 뒤로가기       | 뒤로가기"
            )
            var drinksSelect = readln().toInt()
            when (drinksSelect) {
                1 -> println("Coke를 선택하셨습니다 잠시만 기다려주세요")
                2 -> println("Sprite를 선택하셨습니다 잠시만 기다려주세요")
                3 -> println("Zero Coke를 선택하셨습니다 잠시만 기다려주세요")
                4 -> println("Zero Sprite를 선택하셨습니다 잠시만 기다려주세요")
                5 -> println("Vanilla Shake를 선택하셨습니다 잠시만 기다려주세요")
                0 -> return
            }
        }
    }