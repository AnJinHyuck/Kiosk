package com.example.kiosk

import kotlinx.coroutines.selects.select

class Kiosk() {

}

fun main() {

    mainScreen()
}

fun mainScreen() {
    while (true) {
        println(
            "[ SHAKESHACK MENU ]\n" +
                    "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                    "2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                    "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                    "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                    "0. 종료            | 프로그램 종료"
        )
        println("원하는 메뉴를 선택하세요")
        var selectMenu = readln().toInt()

        when (selectMenu) {

            1 -> Burger().burgerMenu()
            2 -> FrozenCustard().frozenCustard()
            3 -> Drinks().drinksMenu()
            4 -> Beer().beerMenu()
            0 -> break
        }
    }
}
/*
1차 코딩
다른 클래스 0에서 return을 안해서 값을 다시 입력받아야 하는 오류 발생했었음
 */