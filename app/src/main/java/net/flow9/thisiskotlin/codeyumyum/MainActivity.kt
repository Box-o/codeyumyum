package net.flow9.thisiskotlin.codeyumyum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Level 1 - 기초 문법, 계산기
// 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들고, 클래스를 이용하여 연산을 진행하고 출력하기

/* 시도 1 -> 수를 대입해서 계산할려고 함 = 실패
fun main() {
    println("----------------------------------------")
    println("----------------- 계산기 -----------------")
    println("----------------------------------------")

    var answer : Double = 0

    println("[A][?][B]")
    //println("A에 대입될 수를 입력해 주세요.")
    //var inputNum1: Int = readLine()!!.toInt()
    var inputNum1 : Int = 5
    //입력값이 null이 아니라고 해준다 !!
    //println("[${inputNum1}][?][B]")
    //println("?에 대입될 연산자를 입력해 주세요.")
    //var operator: String? = readLine()
    var operator : String = "+"
    //println("[${inputNum1}][${operator}][B]")
    //println("B에 대입될 수를 입력해 주세요.")
    //var inputNum2: Int = readLine()!!.toInt()
    var inputNum2 : Int = 10
    //println("${inputNum1}${operator}${inputNum2}=")

    if (operator == "+"){
        answer = inputNum1.toDouble() + inputNum2.toDouble()
    }else if (operator == "-"){
        answer = inputNum1.toDouble() - inputNum2.toDouble()
    }else if (operator == "*" || operator == "x"){ //논리합 둘 줄 하나만 만족하면 실행
        answer = inputNum1.toDouble() * inputNum2.toDouble()
    }else if (operator == "/" || operator == "%"){ //논리합 둘 줄 하나만 만족하면 실행
        answer = inputNum1.toDouble() % inputNum2.toDouble()
    }else{
        println("연산자가 유효하지 않습니다.")
    }
    println("${inputNum1}${operator}${inputNum2} = ${answer} 입니다.")
}
*/

/* 시도 2 -> 수를 대입하지 않고, 지정 값을 계산해 Double로 answer가 나오지만 정상적인 계산
// 조원들도 level 1은 변수에 수를 지정했다고 한다
fun main() {
    println("----------------------------------------")
    println("----------------- 계산기 -----------------")
    println("----------------------------------------")

    var answer : Double = 0.0

    println("[A][?][B]")

    var inputNum1 : Int = 5
    var operator : String = "+"
    var inputNum2 : Int = 10

    //여기서 ?에 대입된 연산자에 따라 게산식을 만들어야 한다
    if (operator == "+"){
        answer = (inputNum1 + inputNum2).toDouble()
    }else if (operator == "-"){
        answer = (inputNum1 - inputNum2).toDouble()
    }else if (operator == "*"){
        answer = (inputNum1 * inputNum2).toDouble()
    }else if (operator == "/"){
        answer = inputNum1.toDouble() / inputNum2.toDouble()
    }else{
        println("연산자가 유효하지 않습니다.")
    }
    println("${inputNum1}${operator}${inputNum2} = ${answer} 입니다.")
}
 */

/*
// 시도 3 -> ??
fun main() {
    println("----------------------------------------")
    println("----------------- 계산기 -----------------")
    println("----------------------------------------")

    var answer : Int = 0

    println("[A][?][B]")

    var inputNum1 : Int = 5
    var operator : String = "+"
    var inputNum2 : Int = 10

    when(operator){
        //"+" -> println("${inputNum1}${operator}${inputNum2} = ${inputNum1+inputNum2}")
        "+" -> answer = (inputNum1+inputNum2)
    }
}
*/

// Level 2 - 기초 문법, 계산기
// Lv1에서 만든 Calculator 클래스에 출력 이후 추가 연산을 가능하도록 코드를 추가하고, 연산 진행 후 출력하기

class Calculator {
    var firstNum : Int = "0"
    var secondNum : Int = "0"
    var operator : String = "+"

    var result : Int = 0

    fun main() {
        when(operator) {
            "+" -> {
                result = firstNum + secondNum
            }
            "-" -> {
                result = firstNum - secondNum.
            }
            "*" -> {
                result = firstNum * secondNum
            }
            "/" -> {
                var temp : Double = result.toDouble()
                temp = (firstNum / secondNum).toDouble()
                result = temp
            }
            else -> {
                println("연산자가 유효하지 않습니다.")
            }
        }
        println("계산완료? ${firstNum}${operator}${secondNum} = ${result}")
    }


}

fun main() {
    println("----------------------------------------")
    println("----------------- 계산기 -----------------")
    println("----------------------------------------")

}