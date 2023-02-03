package data

//class가 아닌 object로 한것은 장바구니 아이템들은
//프로젝트 전역(Package(폴더)가 달라도)에서 상품 data를 저장하는 class이므로
//항상 같은 값이 유지 되어야하기 때문에
//싱글턴 객체로 만드는 것이 적합하다고 생각

object CartItems {
    private val mutableProducts = mutableMapOf<Product,Int>()
    val products:Map<Product,Int> = mutableProducts

    fun addProduct(product:Product){
        mutableProducts[product]?.let{
            mutableProducts[product] = it+1
        }?: kotlin.run{
            mutableProducts[product] = 1
        }

    }
}