package com.example.kiosk

interface DrinksMenuSelect {
    fun drinksItem(index: Int)
}

data class DrinksInfo(val name: String, val price: Double)
class DrinksMenu : DrinksMenuSelect {

    val drinksList = listOf(
        DrinksInfo("Coke", 6.9),
        DrinksInfo("Sprite", 8.9),
        DrinksInfo("Zero Coke", 6.9),
        DrinksInfo("Zero Sprite", 6.9),
        DrinksInfo("Vanilla Shake", 6.9)
    )

    // 음료 메뉴 선택 기능
    override fun drinksItem(index: Int) {
    }

    // 선택한 음료 정보 띄우는 기능
    //음료 메뉴 보여주는 기능
    fun showDrinksMenu() {
        println("[Drinks Menu]")

        for (index in drinksList.indices) {
            val drinksmenu = drinksList[index]
            println("${index + 1}. ${drinksmenu.name} | W${drinksmenu.price}|")
        }
        println("0. 뒤로가기")
        val drinksSelect = readln().toInt()
        when (drinksSelect) {
            0 -> return
            else -> drinksItem(drinksSelect)
        }


    }
}

//class Drinks {
//        fun drinksMenu() {
//            println(
//                "[ Drinks MENU ]\n" +
//                        "1. Coke                | W 6.9 |\n" +
//                        "2. Sprite              | W 8.9 |\n" +
//                        "3. Zero Coke           | W 9.4 |\n" +
//                        "4. Zero Sprite         | W 6.9 |\n" +
//                        "5. Vanilla Shake       | W 5.4 |\n" +
//                        "0. 뒤로가기       | 뒤로가기"
//            )
//            var drinksSelect = readln().toInt()
//            when (drinksSelect) {
//                1 -> println("Coke를 선택하셨습니다 잠시만 기다려주세요")
//                2 -> println("Sprite를 선택하셨습니다 잠시만 기다려주세요")
//                3 -> println("Zero Coke를 선택하셨습니다 잠시만 기다려주세요")
//                4 -> println("Zero Sprite를 선택하셨습니다 잠시만 기다려주세요")
//                5 -> println("Vanilla Shake를 선택하셨습니다 잠시만 기다려주세요")
//                0 -> return
//            }
//        }
//    }