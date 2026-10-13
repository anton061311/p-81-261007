
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
