package net.flow9.thisiskotlin.codeyumyum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

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

/* 시도 2 -> 수를 대입하지 않고, 지정 값을 계산해 Double로 answer가 나오지만 정상적인 계산 = 성공
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

/*시도 3 -> ??
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
                result = firstNum - secondNum
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

//시도 4 -> 수를 대입하지 않고 지정 값을 계산해 Int로 rex가 나오지만 소수점 생략함 = 성공


class Calculator(){
    //프로퍼티 초기화, 임시값 및 파라미터 부여
    var num1 : Int = 0
    var num2 : Int = 0
    var oper : String = "+"
    //인터넷에서 헤더의 프라이머리 생성자와 프로퍼티를 연결해야 한다고 함

    var res : Int = 0

    init {
        println("init은 프라이머리 생성자 초기화")
        //초기화는 값을 대입해 인스턴스를 생성했다는 말인지?
        //인터넷에는 불리언값을 사용해 참이 아닌경우 class가 실행되지 않게 하는 것 같다
    }
    fun cal() {
        if(oper == "+"){
            res = num1 + num2
        }else if(oper == "-"){
            res = num1 - num2
        }else if(oper == "*"){
            res = num1 * num2
        }else if(oper == "/"){
            res = num1 / num2
        }else {
            println("유효하지 않는 연산자 입니다.")
        }
        println("----------------- 계산기 -----------------")
        println("if조건문 계산공식:${num1}${oper}${num2}")
        println("계산결과:${res}")
        println(" ")

    }
    fun calWhen() {
        when(oper) {
            "+" -> res = num1 + num2
            "-" -> res = num1 - num2
            "*" -> res = num1 * num2
            "/" -> res = num1 / num2
            else -> println("유효하지 않는 연산자 입니다.")
        }
        println("----------------- 계산기 -----------------")
        println("when조건문 계산공식:${num1}${oper}${num2}")
        println("계산결과:${res}")
        println(" ")

    }
}

fun main() {
    //fun 이름을 main으로 하면 작동하고 다른걸로 하면 작동안함 왜?
    //main은 하나만 있어야 하고, 여러개 사용할 수 없다.
    //main하고 원하는 거 쓸 수 있다.
    var temp = Calculator()
    temp.num1 = 2
    temp.num2 = 3
    temp.oper = "*"
    //클래스의 생성자와 프로퍼티에 값을 부여한다, 생성자와 프로퍼티가 연결되어 있어 생성자에 값을 부여하면 프로퍼티에 들어간다
    temp.cal()
    temp.calWhen()
    //클래스의 계산기능인 cal메서드를 호출해서 계산한다
}



/* 수정 전 방식, 이거 왜 안되는지 모르겠음
class Calculator {
    //질문 1 : 여러개의 프로퍼티를 사용하려면 프라이머리 생성자를 꼭 생성해 줘야 하는가?
    var num1 : Int = 1
    var num2 : Int = 2
    var oper : String = "*"
    //깃북 클래스에서는 이런 식으로 사용했고 정상작동 했는데 왜?


    var res : Int = 0

    ...중략...

var temp = Calculator()
temp.num1 = 100
temp.num2 = 5
temp.oper = "*"

temp.cal()


//깃북 클래스 실습에는 이게 있었음
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
*/


/* 이것도 왜 안되는지 모르겠음 -> 이건 fun 이름을 main으로 바꾸면 됨
fun export() {
    var temp = Calculator()
    temp.num1 = 100
    temp.num2 = 5
    temp.oper = "*"

    temp.cal()
}
*/



