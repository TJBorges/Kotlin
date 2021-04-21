fun main(args: Array<String>) {

    var values = arrayOf(1,100,11,15,12)
    
        var result = 0
        var number1 = 0
        var number2 = 0
    
        for (i in values.indices) {
         for (j in values.indices){
              if(values[i] != values[j] && values[i] + values[j] > result){
                number1 = values[i]
                number2 = values[j]
                  result = values[i] + values[j]
                }
             }
        }
        print("$number1 + $number2 = $result")
}