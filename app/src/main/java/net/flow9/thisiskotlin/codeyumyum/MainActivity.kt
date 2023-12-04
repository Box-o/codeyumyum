package net.flow9.thisiskotlin.codeyumyum

import android.hardware.camera2.CameraExtensionSession.StillCaptureLatency
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

// Level 1 - 기초 문법, 계산기
// 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들고, 클래스를 이용하여 연산을 진행하고 출력하기

/*//시도 1 -> 수를 대입해서 계산할려고 함 = 실패
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

/*//시도 2 -> 수를 대입하지 않고, 지정 값을 계산해 Double로 answer가 나오지만 정상적인 계산 = 성공
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

/*//시도 3 -> ??
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

/*//시도 4 -> 수를 대입하지 않고 지정 값을 계산해 Int로 rex가 나오지만 소수점 생략함, 프로퍼티에 인스턴스화 = 성공
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
*/

//시도 5 -> 수를 대입하지 않고 지정 값을 계산해 Int로 rex가 나오지만 소수점 생략함, 헤더에 프라이머리 생성자 = 성공

class Calculator(num1:Int, num2:Int, oper:String){
    //프로퍼티 초기화, 임시값 및 파라미터 부여
    var num1 = num1
    var num2 = num2
    var oper = oper
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
    var temp = Calculator(13,23,"*")
    //클래스의 생성자와 프로퍼티에 값을 부여한다, 생성자와 프로퍼티가 연결되어 있어 생성자에 값을 부여하면 프로퍼티에 들어간다
    temp.cal()
    temp.calWhen()
    //클래스의 계산기능인 cal메서드를 호출해서 계산한다
}








/*fun main() {
    open class Parents1 {
        var hello: String = "부모클래스 텍스트"
        fun sayHello() {
            println("inheritance, ${hello}")
        }
    }

    class Masefse1 : Parents1() {
        fun myHello() {
            hello = "자식클래스 텍스트"
            sayHello()
        }
    }
}*/

/*

fun main() {
    var bird = Bird("새")
    var chicken = Chicken("닭", 2)
    var sparrow = Sparrow("참새", "갈색")
    var pigeon = Pigeon("비둘기", "서울")

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}

open class Bird(name:String) {
    var name: String = ""

    init {
        // this는 현재 클래스의 상태변수를 의미합니다
        // var name: String = ""
        this.name = name
    }

    open fun fly() {
        println("${name}은 날아요~")
    }

}

class Chicken(name: String, age: Int) : Bird(name) {
    var age:Int = 0

    init {
        this.age = age
    }

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${age}살의 ${name}가 날아봅니다~ 꼬끼오!")
    }
}

class Sparrow(name: String, color: String) : Bird(name) {
    var color:String = ""

    init {
        this.color = color
    }

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${color}의 ${name}이 날아봅니다~ 짹짹!")
    }
}

class Pigeon(name: String, address: String) : Bird(name) {
    var address: String = ""

    init {
        this.address = address
    }

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${address} 살고있는 ${name}가 날아봅니다~ 구구!")
    }
}



*/

/*
open class Parent {
    var hello: String = "안녕하세요"
    fun sayHello(){
        Log.d("inheritance", "${hello}")
    }
}

class Child: Parent(){
    fun myHello() {
        hello = "Hello!"
        sayHello()
    }
}

 */

/* 데이터 클래스 사용해보기
data class UserData(var name: String, var age: Int){
    init{
        println("init은 프라이머리 생성자 초기화")
        println("나는${name}~ 꿈을 꾸는 ${age}살 ${name}~")
    }
fun main(){
    var name = "문어"
    var age = 3
}
*/

/*
// 정의 - 주로 코드 블록(클래스 스코프)을 사용하지 않고 간단하게 작성합니다.
data class UserData(val name: String, var age: Int)
// 생성 - 일반 class의 생성자 함수를 호출하는 것과 동일합니다.
var userData = UserData("Michael", 21)

fun main() {

// name은 val로 선언되었기 때문에 변경 불가능합니다.
   // userData.name = "Sindy" // (X)
// age는 var로 선언되었기 때문에 변경 가능합니다.
    userData.age = 18 // (O)

}
*/

//----------------메모----------------//
//         다시 해볼 필요 있음!!!         //

/* 수정 전 방식, 이거 왜 안되는지 모르겠음 -> 해결
class Calculator {
    //질문 1 : 여러개의 프로퍼티를 사용하려면 프라이머리 생성자를 꼭 생성해 줘야 하는가?
    var num1 : Int = 1
    var num2 : Int = 2
    var oper : String = "*"
    //깃북 클래스에서는 이런 식으로 사용했고 정상작동 했는데 왜?
    //-> 아래 fun을 main으로 작성하면 정상작동함


    var res : Int = 0

    ...중략...
//클래스 호출을 하려면 아래 코드를 fun main으로 감싸던가, 클래스를 fun 안으로 넣으면 된다 뭔차인지는 모르겠음
var temp = Calculator()
temp.num1 = 100
temp.num2 = 5
temp.oper = "*"

temp.cal()


//깃북 클래스 실습에는 이게 있었음 -> 기본 프로젝트 생성시 자동작성되는 것
//메인 클래스에 기본fun을 자동 작성된 것
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