# 12주차 과제 : 애노테이션

- [@retention](https://github.com/retention)
- [@target](https://github.com/target)
- [@documented](https://github.com/documented)
- 애노테이션 프로세서



### 애노테이션이란

Annotation은 *주석* 이라는 의미를 가지고 있다. 하지만 /나 /*와 같은 주석과는 확실히 다르다

- 컴파일 과정에서 코드를 어떻게 컴파일 할 것인지, 실행 과정에서 코드를 어떻게 처리할 것인지를 알려주는 정보

- annotation이 붙은 코드는 annotation에 관한 정보가 구현된 것에 따라서 연결되는 방향이 결정된다

- 전체 소스코드에서 비지니스 로직에는 영향을 주지는 않지만 해당 타겟의 연결 방법이나 소스코드의 구조를 변경할 수 있다.

  = 이 속성을 어떤 용도로 사용할껀지, 이 클래스에게 어떤 역할을 줄껀지를 결정해서 붙여주는 것

- annotation은 소스코드에 메타데이터를 삽입하는 것이기 때문에 잘 이용한다면 구독성 뿐만 아니라 체계적인 소스코드를 구성하는데 도움을 준다

  * 메타 데이터란 -> 데이터를 위한 데이터를 의미하며, 데이터에 대한 설명을 의미하는 데이터(자신의 정보를 가지고 있는 데이터)



#### 사용법

패키지명이나 클래스 선언, 메소드 선언, 필드 선언, 인자값 선언 위에다가

@이름(인자)

방식으로 넣어주고 만약 인자가 없을경우에는 (인자) 부분은 빼고 사용하는 것도 가능하다



#### 선언방법

```java
@Retention(용도)
@Target(범위)
public @interface ExAnnotation{
  //타입 요소명() default값;
  String value(); // String형 기본 요소
  int value2() default 5; //int형 요소 초기값 5
}
```

이렇게 annotation은 멤버를 가지는 것이 가능하며, 타입, 이름, dafault값을 설정하는 것이 가능하다

만약 default값을 따로 정해주지 않는다면 기본 요소가 된다



#### 사용방법

```java
@ExAnnotation(value = "Hello", value2 = 1);
```

```java
@ExAnnoation("Hello");
```

- 만약 annotation 안에 있는 요소의 값에 default값이 설정되어 있다면, 값을 따로 설정하지 않아도 되지만(int) default값이 없는 경우에는 값을 설정해줘야 함(String)















### 참고사이트

---

https://www.nextree.co.kr/p5864/

https://coding-factory.tistory.com/575