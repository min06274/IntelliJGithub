package screen

object ScreenStack {
    private val screenStack = mutableListOf<Screen>()

    fun push(screen: Screen) {
        screenStack.add(screen)
        println("현재 stack 에 있는 아이템들 입니다.")
        for(stack in screenStack){
            println(stack)
        }
    }

    fun pop() {
        screenStack.removeLastOrNull()
    }

    fun peek(): Screen? {

        println("해당이 peek됨 ${screenStack.lastOrNull()}")
        return screenStack.lastOrNull()
    }
}

sealed class Screen