## 8주차 과제 : 인터페이스

인터페이스란 : 서로 다른 하드웨어 장치들이 데이터를 주고 받을 수 있는 규격을 의미



### 인터페이스 정의하는 방법

interface 키워드를 사용해서 클래스를 선언하듯이 선언한다

```java
interface PhoneInterface{
	public static final int BUTTONS = 20;
	abstract public void sendCall();
	abstract public void receiveCall();
}
```

특징 

- 인터페이스의 멤버는 누구나 접근할 수 있도록 public 타입이다

- 지정하든 생략하든 상수는 모두 public static final 타입(생략가능)

- 지정하든 생략하든 메소드는 모두 abstract public 타입이다(생략가능)

- 객체를 생성할 수 없다

  - ```java
    new PhoneInterface()
    ```

  - 이렇게 위에서 인터페이스로 선언한 PhoneInterface를 객체로 생성하면 오류남

- 다른 인터페이스에 상속될 수 있다



### 인터페이스 상속

인터페이스간의 상속을 받을 수 있고, extends 키워드를 사용해서 새로운 규격을 추가한 새로운 인터페이스를 생성 할 수 있다.

```java
interface MobilePhoneInterface extends PhoneInterface{
	void snedSMS();
	void receiveSMS();
}
```

- 기존의 인터페이스를 상속하고 새로운 추상 메소드를 추가함
- 결론적으로 MobilePhoneInterface는 Buttons 상수, sendCall(), receiveCall(), sendSMS(), receiveSMS() 이렇게 5개의 멤버를 가지게 된다

- 추가적으로 인터페이스의 다중 상속을 허용한다

  - ```
    interface MusicPhoneInterface extend MobilePhoneInterface, MP3Interface
    ```

  - 

### 인터페이스 구현하는 방법, 인터페이스 레퍼런스를 통해 구현체를 사용하는 방법

인터페이스의 구현이란 인터페이스의 추상 메소드를 모두 구현한 클래스를 작성하는 것

implements 키워드와 함께 사용

```java
class SamsungPhone implements MobilePhoneInterface{
	public void sendCall(){...}
  public void receiveCall(){...}
  public void sendSMS(){...}
  
  public int getButtons(){...}
}
```

- 위에서의 정의하는 단계에서 구현해둔 MobilePhoneInterface를 implement메소드를 사용

- implement하게되면 인터페이스의 모든 메소드를 구현해야한다 => 만약 추상 메소드 중 하나라도 빠트린다면 컴파일 오류

- 추가적으로 getButtons()메소드를 추가 / 추가적인 메소드를 추가할 수 있음





- 인터페이스의 기본 메소드 (Default Method), 자바 8
- 인터페이스의 static 메소드, 자바 8
- 인터페이스의 private 메소드, 자바 9

