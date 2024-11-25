
program{
   let void simpleFunction(){
        var boolean flag = true
        var number value = 10
        if(flag){
            value = value + 5
        }else{
            value = value - 5
        }
    }

    let number addNumbers(number a, number b){
        var number c= a + b
        return c
    }

    let number sumLoop(){
        var number sum = 0
        for (var number i = 0; i < 5; i = i + 1){
            sum = sum + i
        }
        return sum
    }

 
}
