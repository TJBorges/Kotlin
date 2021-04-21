fun main(args: Array<String>) {
    
    
    fun parseHexInt(value: String): Int {
        
        var returnInt = when(value){
            "A" -> 10
            "1F" -> 31
            "0" -> 0
            else -> 0
        }
        
        return returnInt
    }
    
    var value = parseHexInt("0")
    
    println(value)
    
}