package com.example.kiosk

interface CustardMenuSelect {
    fun custardItem(index: Int)
}

data class CustardInfo(val name: String, val price: Double)
class FrozenCustardMenu : CustardMenuSelect {

    val custardList = listOf(
        CustardInfo("Vanilla", 6.9),
        CustardInfo("Strawberry", 8.9),
        CustardInfo("Blueberry", 9.4),
        CustardInfo("Chocolate", 6.9),
        CustardInfo("Yogurt", 5.4)
    )

    override fun custardItem(index: Int) {
        if (index in 1..custardList.size) {
            val selected = custardList[index - 1]
            println("${selected.name}을 선택하셨습니다.")
        } else {
            println("다시")
        }
    }

    fun showCustardMenu() {
        println("[ Frozen Custard MENU ]")
        custardList.forEachIndexed { index, custardMenu ->
            println("${index + 1}. ${custardMenu.name}| W ${custardMenu.price} |")
        }
        println("0. 뒤로가기")
        val custardSelect = readln().toInt()
        when (custardSelect) {
            0 -> return
            else -> custardItem(custardSelect)
        }
    }

//    fun frozenCustard() {
//        println(
//            "[ Frozen MENU ]\n" +
//                    "1. Vanilla       | W 6.9 | 바닐라 아이스크림\n" +
//                    "2. Strawberry    | W 8.9 | 딸기 아이스크림\n" +
//                    "3. Blueberry     | W 9.4 | 블루베리 아이스크림\n" +
//                    "4. Chocolate     | W 6.9 | 초코 아이스크림\n" +
//                    "5. Yogurt        | W 5.4 | 요거트 아이스크림\n" +
//                    "0. 뒤로가기       | 뒤로가기"
//        )
//        var frozenCustardSelect = readln().toInt()
//        when (frozenCustardSelect) {
//            1 -> println("Vanilla를 선택하셨습니다. 잠시만 기다려주세요.")
//            2 -> println("Strawberry를 선택하셨습니다. 잠시만 기다려주세요.")
//            3 -> println("Blueberry를 선택하셨습니다. 잠시만 기다려주세요.")
//            4 -> println("Chocolate를 선택하셨습니다. 잠시만 기다려주세요.")
//            5 -> println("Yogurt를 선택하셨습니다. 잠시만 기다려주세요.")
//            0 -> return
//        }
//    }
}