package screen

class ShoppingCategory {
     fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        for (category in categories) {
            println(category)
        }

        var selectedCategory = readLine()

        while(selectedCategory.isNullOrBlank()){
            println("값을 입력해주세요")
            selectedCategory = readLine()
        }

         if(selectedCategory== "#"){
             //TODO 1. 장바구니 이동
         }
         else {
            if(categories.contains(selectedCategory)){

            }
             else{
                showErrorMessage(selectedCategory)
            }
         }
    }

    private fun showErrorMessage(selectedCategory: String?) {
        println("[${selectedCategory}] : 존재하지 않는 카테고리입니다. 다시 입력해주세요")
        showCategories()
    }
}