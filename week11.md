# 11주차 과제 : Enum

### Enum이란?

- 열거체라고 해서 enumeration type이다.
- 클래스처럼 보이게 하는 상수 
  - 상수이기 때문에 equals함수가 아닌 '=='로 비교가 가능하다!!
- 서로 관련 있는 상수들을 모아 심볼릭한 명칭의 집합으로 정의한 것
- Enum 클래스형을 기반으로 한 클래스형 선언
- 새로운 열거형을 선언하면, 내부적으로 Enum 클래스형 기반의 새로운 클래스형이 만들어짐



장점

- 문자열과 비교해서 자동완성, 오타검증, 텍스트 리팩토링 등 여러가지 지원을 받는 것이 가능
- 허용 가능한 값들을 제한할 수 있음
- 열거체를 비교할 떄 실제 값뿐만 아니라 타입까지도 체크
- 열거체의 상숫값이 재정의되더라도 다시 컴파일 할 필요가 없음



### Enum을 정의하는 방법

주의 : enum 열거형으로 지정된 상수는 대문자를 사용하며, 마지막에 ; 을 붙히지 않는다!

1. 하나의 자바 파일로 만들어서 선언

![enum1](./img/enum1.png)

파일 생성할 떄 enum파일 선택하게되면 원래의 class 자리에 enum이 들어감

사용할 때는 

 ![enum2](./img/enum2.png)

Enum으로 정의할 때 사용한 이름(subject) 을 String이나 int와 같은 타입으로 두고 사용



2. 클래스 안에서 선언하기

![enum3](./img/enum3.png)

필요할때 enum 키워드를 사용해서 원하는 요소들을 집어넣어주고 사용



3. 클래스 밖에서 선언하기

   ![enum4](./img/enum4.png)





선언을 하고 나서 사용은 이렇게 한다

![enum5](./img/enum5.png)

![enum6](./img/enum6.png)

데이터 타입처럼 선언하고, enum이름.enum요소 방식으로 넣어서 사용할 수 있다



### enum이 제공하는 메소드

- values() : 모든 enum의 요소들을 배열으로 생성

  - values함수를 이용해서 enum의 요소들을 모두 출력하는 예시

  - ![enum7](./img/enum7.png)
  - ![enum8](./img/enum8.png)

- valueOf() : 문자열로 enum 요소의 이름을 찾아서 요소의 이름을 리턴
  - ![enum9](./img/enum9.png)
  - ![enum10](./img/enum10.png)

- name() : 호출된 값의 이름을 String으로 리턴
- ordinal() : 해당 값이 enum이 정의된 순서를 정수값으로 리턴
- compareTo(E o ) : enum과 지정된 객체의 순서를 비교, 지정된 객체보다 작은 경우, 음의 정수, 동일하면 0, 크면 양의 정수 리턴
- equals(Object other) : 지정된 객체가 enum 정수와 같은경우, true를 리턴



### java.lang.Enum

Enum 클래스는 모든 자바 열거체의 공통된 조상 클래스

Enum 클래스에는 열거체를 조작하기 위한 다양한 메소드가 있음

![enum11](./img/enum11.png)

유일한 생성자

protected Enum(String name, int ordinal) : 유일한 생성자로 프로그래머는 이 생성자를 호출할 수 없음

열거형 선언에 대한 응답으로 컴파일러에서 내보낸 코드를 사용



### EnumSet











#### 참고

---

https://www.opentutorials.org/module/1226/8025

https://limkydev.tistory.com/66

https://parkadd.tistory.com/50