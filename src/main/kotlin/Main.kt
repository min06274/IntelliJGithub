fun main(args: Array<String>) {

    println("안녕하세요, Shoppi 에 오신 것을 환영합니다!")
    println("쇼핑을 계속 하시려면 이름을 입력해주세요 :)")

    val name = readLine()

    println("""
        감사합니다. 반갑습니다, ${name}님
        원하시는 카테고리를 입력해주세요.
        ***=============================***
    """.trimIndent())

    val categories = arrayOf("패션","전자기기","반려동물용품")
    for(category in categories)
    {
        println(category)
    }

    var ch: String? = null


    while(true) {
        ch = readLine()
        when {
            !ch.isNullOrBlank() -> {
                when {
                    ch == "패션" -> {
                        println("패션")
                        break
                    }

                    ch == "전자기기" -> {
                        println("전자기기")
                        break
                    }

                    ch == "반려동물용품" -> {
                        println("반려동물용품")
                        break
                    }
                    else ->{
                        println("카테고리에서 다시 입력해주세요")
                        continue
                    }
                }
            }
            ch.isNullOrBlank()->{
                println("공백은 입력이 안됩니다 다시 입력해주세요")
                continue
            }


        }

    }
}