package com.example.kiosk

interface MenuSelect {
    fun menuItem(index: Int)
}

data class BurgerType(val name: String, val price: Double)

//버거 정보 만들기
class BurgerMenu : MenuSelect {

    //버거 정보 넘기기
    private val burgerList = listOf(
        BurgerType("ShackBurger", 6.9),
        BurgerType("Smoke Burger", 8.9),
        BurgerType("Shroom Burger", 9.4),
        BurgerType("Cheese Burger", 6.9),
        BurgerType("HamBurger", 5.4),
    )

    override fun menuItem(index: Int) {

        if (index in 1..burgerList.size) {
            val selected = burgerList[index - 1]
            println("${selected.name}을 선택하셨습니다.")

        } else {
            println("다시")
        }
    }

    fun showMenu() {
        println("[Bugers Menu]")
        burgerList.forEachIndexed { index, burgerMenu ->
            println("${index + 1}. ${burgerMenu.name}| W ${burgerMenu.price}|")
        }
        println("0. 뒤로가기")

        val burgerSelect = readln().toInt()
        when (burgerSelect) {
            0 -> return
            else -> menuItem(burgerSelect)
        }
    }
}
    //버거 선택
//    override fun burgerMenu() {
//        println("[ Burgers Menu")
//        for(burgerList)
////            "[ Burgers MENU ]\n" +
////                    "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
////                    "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
////                    "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
////                    "4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
////                    "5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
////                    "0. 뒤로가기      | 뒤로가기"
//
//        var burgerSelect = readln().toInt()
//
//        when (burgerSelect) {
//            1 -> println("를 선택하셨습니다 잠시만 기다려주세요")
//            2 -> println("SmokeShack를 선택하셨습니다 잠시만 기다려주세요")
//            3 -> println("Shroom Burger를 선택하셨습니다 잠시만 기다려주세요")
//            4 -> println("Cheesburger를 선택하셨습니다 잠시만 기다려주세요")
//            5 -> println("Hamburger를 선택하셨습니다 잠시만 기다려주세요")
//            0 -> return
//        }
//    }




// 0312 해야할 일. 다른 것도 클래스 화
// 첫 화면에서 이상한 숫자 누르면 다시 입력하라는 메시지 출력
// 다음 화면에서 이상한 숫자 누르면 다시 입력하라는 메시지 출력 - 첫 화면이 아니라 현재 화면에서 입력


//0번