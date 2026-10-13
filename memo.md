
## 2026.10.07, WED
# 3
public class Main {
public static void main(String[] args) {
final int number = 10; // 정수형 변수 선언
String message = "Hello, Java!"; // 문자열 변수 선언

        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }
}
final 붙이는 게 무조건 중요하다

코틀린 언어의 정체성은 불변성이다. 불변성을 되게 중요하게 보고 만들었다.

# 10
자바는 Null Point Exception에 매우 취약하다.
코틀린의 기본 기조는 Not Null이다. Null을 물음표로 표현현다.
자바와 코틀린에서 null을 처리하는 방법을 비교합니다.
코틀린은 ?을 사용하여 nullable 타입을 명시하고, ?. 연산자를 사용하여 안전하게 접근합니다.

# 12, data class
Java에서는 직접 구현해야 하지만,
Kotlin에서는 data class를 사용하여 자동으로 equals(), toString() 등을 생성할 수 있다. 

# 13, extension functions
Java에서는 별도의 유틸리티 클래스를 만들어야 하지만,
Kotlin에서는 기존 클래스에 새로운 함수를 추가할 수 있는 확장함수 기능을 제공한다.

# 14, default parameter
Java에서는 오버로딩을 사용해야 하지만,
Kotlin에서는 기본 매개변수를 제공해, 오버로딩 없이 기본값을 설정할 수 있다.

# 15, singleton
싱글톤은 싱글톤 안에서만 만들 수 있다.

Java에서는 static이나 enum을 활용해야 하지만,
Kotlin에서는 object를 사용해 간단하게 싱글톤을 만들 수 있다. 

# 16, string template
Java에서는 + 연산자나 String.format()을 사용하지만,
Kotlin은 문자열 내부에 변수 값을 쉽게 삽입할 수 있는 문자열 템플릿 기능을 제공한다.
${name.length}

# 17, Exception
Java와 Kotlin의 예외 처리는 유사하지만, 
Kotlin에서는 try를 표현식으로 사용할 수 있다.
또한, checked exception이 없기 때문에 throws 선언이 필요 없다.

checked Exception -> try - catch 필수. 안 하면 컴파일이 안 됨

# 18, when
------------------------------------------------------------------------

## 2026.10.08, THR
# 19, Collection Filtering
Java에서는 Stream API를 활용해야 하지만,
Kotlin에서는 filter 함수를 사용하여 간결하게 리스트를 필터링할 수 있다.

# 20, forEach and map
Java에서는 Stream API를 사용해야 하지만,
Kotlin에서는 map이 기본적으로 제공된다.

# 21, Elvis ?:
Java에서는 if-else 또는 Optional을 사용해야 하지만
Kotlin에서는 ?:(엘비스 연산자)를 사용하여 null인 경우 기본값을 제공할 수 있다.

# 22, is vs instanceof
자바에서는 instanceof를 사용하여 타입을 체크한 후 명시적으로 캐스팅해야 합니다.
코틀린에서는 is를 사용하며, 스마트 캐스트 기능을 제공하여 자동 캐스팅됩니다.

# 23,apply, let, also, run, with (Scope method) - @@
Java에서는 메서드 체이닝을 직접 구현해야 하지만,
Kotlin에서는 apply, let, also, run, with 같은 스코스 함수를 제공하여 객체 조작을 간결하게 만든다.

# 24, apply
apply는 객체를 생성한 후 내부 속성을 설정할 때 사용합니다.
마지막에 해당 객체를 반환하므로, 객체 초기화에 유용합니다.

# 25, let
let은 null이 아닌 경우 특정 로직을 실행할 때 유용하다.
또한, 리턴값을 변환하여 새로운 값으로 사용할 수도 있다.
주로 안전 호출(?.)과 함께 사용된다.

# 26, also
also는 객체를 유지하면서 추가적인 작업을 수애할 때 사용한다.
로그 출력이나 디버깅에 자주 활용된다.
* apply -> this를 받고 객체를 반환
* let -> it을 받고 람다의 결과값 반환
* also -> it을 받고 객체를 반환

# 27, run
run은 일회성 작업을 수행한 후 결과를 반환할 때 유용하다.
객체 생성 없이 특정 블록을 실행할 수도 있다.

# 28, with
with은 객체를 컨텍스트로 가져와 여러 작ㅇ버을 수행한 후 결과를 반환한다.
Kotlin에서는 with(객체) { } 형식으로 사용되며, 객체를 수정하는 것이 아니라 작업만 수행하는 점이 apply와 다릅니다.


# 29, 

# 30, 

# 31,

# 32,

# 33,

# 34,

# 35,

# 36,

# 37,

# 38,

# 39,

# 40, 
