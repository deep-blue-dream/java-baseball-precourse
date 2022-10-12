# 윤종섭의 자바 뿌수기

## 과제 - 숫자 야구 게임

### 🔍 진행방식

- 미션은 **기능 요구사항, 프로그래밍 요구사항, 과제 진행 요구사항** 세 가지로 구성되어 있다.
- 세 개의 요구사항을 만족하기 위해 노력한다. 특히 기능을 구현하기 전에 기능 목록을 만들고, 기능 단위로 커밋 하는 방식으로 진행한다.

### ✉️ 과제 기록 방법

- 기능 구현을 완료한 후 GitHub을 통해 기록할 예정.(아래는 참고했던 제출 방법-우테코 프리코스)
  - GitHub을 활용한 제출 방법은 [프리코스 과제 제출 문서](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 를 참고해 제출한다.
  - 자세한 방법은 [링크](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse#제출-가이드) 를 참고한다.
- 내 경우 나의 git repository에 지속적인 관리 예정.

### TODOLIST (10.12기준 4번까지 진행 예정.)
1. 게임 진행 구현 (시작-초기화, 재시작, 종료)
   1. 게임 진행 구현 - 테스트 준비 필요(구현 확인 절차 피욜)
2. 게임 준비 구현 - 객체:(Owner-상대, Numbers-게임도구, result - 결과(점수판-스트라이크/볼))
   1. Owner 객체 생성 (속성 - GameStatus, Numbers), (메서드 - 게임 준비, 게임 재시작, 게임 종료)
   2. Numbers 객체 생성 (속성 - 배열타입? or 개별 숫자? ) (메서드 - 숫자 갱신(재시작시 새롭게 바뀌어야함))
      1. 랜덤으로 만들어지는 숫자임.제공해주는 메서드 분석 필요함
      2. 배열타입일 경우 각 자리의 값을 인덱싱해야한다
      3. 개별 숫자일 경우 속성이 숫자(value)와 자리(first/second/third)가 되어야한다.
   3. result 객체 생성 - 전광판이라고 해도 좋을 듯 - Numbers와 입력된 값의 판정을 내려줘야한다.(속성 - 스트라이크, 볼) (메서드 - 점수 반환, 라운드종료판단)
3. 게임 준비 구현 - 메서드 : (랜덤 숫자 만들기, 스트라이크 파악, 볼 파악)
4. 입력 구현 (유저가 입력하는 숫자 받기)
5. 결과 보여주기 메서드 (정답 나올때까지 반복 - 스트라이크/볼 출력)
6. 오류처리하기

### 과제 진행시 유의사항

1. git-flow 전략을 사용하여 git을 관리한다.
   1. 참고사이트 
      1. [링크](https://techblog.woowahan.com/2553/)
      2. [링크](https://velog.io/@kw2577/Git-branch-%EC%A0%84%EB%9E%B5)
      3. [링크](https://inpa.tistory.com/entry/GIT-%E2%9A%A1%EF%B8%8F-github-flow-git-flow-%F0%9F%93%88-%EB%B8%8C%EB%9E%9C%EC%B9%98-%EC%A0%84%EB%9E%B5)
   2. 우선 이해한 내용 정리하면 git을 활용한 전략이 다양하며 그 중에서 이번 과제는 git-flow전략을 사용한다.
      1. gitflow에는 5가지의 branch가 존재한다
         1. **master** : 기준이 되는 브랜치 - 제품 배포
         2. **develop** : 개발이 진행되는 브랜치 - 개발자들은 작업이 완료된 코드를 이곳에 Merge한다
         3. **feature** : 단위기능별 브랜치 - 단위기능이 완료되면 develop branch에 Merge한다
         4. **release** : 품질검사 브랜치 - 배포되는 master branch에 push 전 QA가 진행되는 브랜치
         5. **hotfix** : master branch가 배포된 이후 발견된 버그를 긴급 수정하기 위한 branch

        - master와 develop 기준으로 큰 맥락이 존재하며 나머지는 세부적 코드 개발/ 통합 / 테스트 / 긴급 수정 등을 진행한다. 
   3. 추가 기록 예정
   4. 


2.  Java 코딩 컨벤션을 준수하며 과제를 진행한다[링크](https://naver.github.io/hackday-conventions-java/)
  1. 파일 공통요건
     1. 파일 인코딩: UTF-8 준수
     2. 새줄 문자는 LF 
     3. 코드의 마지막은 새줄로 종료
  2. 이름(Naming)명명 방식
     1. 식별자에는 영문/숫자/언더바만 허용
     2. 가급적 발음만 쫒아가는 것이 아닌 단어의 의미를 통해 유추하도록 구성
     3. 대문자를 통한 약어를 정의할 경우 명시할 것
     4. **패키지 이름은 소문자로 구성한다**
     5. **클래스/인터페이스 이름은 대문자 카멜표기법을 적용한다**
     6. **클래스 이름은 명사형으로 표기한다**
     7. **인터페이스 이름은 형용사형으로 표기한다**
     8. **테스트 클래스는 Test로 종료한다**
     9. **메서드 이름은 소문자 카멜표기법을 적용한다**
     10. **메서드 이름은 동사/전치사로 시작한다**
     11. 상수는 대문자와 언더바로 구성한다
     12. 변수에 소문자 카멜표키법을 적용한다.
     13. 변수에는 1글자 이름을 사용을 금지한다.
  3. 선언방식(클래스/필드/메서드/변수/import)
     1. *** 각 파일은 1개의 탑레벨 클래스가 존재한다(Solid의 단일책임원칙과 동일) ***
     2. import시에 *(와일드카드)사용은 Static일 경우에만 사용한다.
     3. 제한자 선언 순서를 지킨다 (public - proteted - private - abstract - static - final)
     4. 어노테이션 선언 이후에는 새줄을 사용한다
     5. 한 줄에는 한 문장만
     6. 하나의 선언문은 하나의 변수만
     7. 배열은 타입 뒤에 선언한다
     8. long타입은 숫자 뒤에 'L'을 대문자로 붙여서 가독성을 높인다.
     9. 특수문자 전용 선언 방식을 활용한다(\n,\b,\f 등등)
  4. 들여쓰기 방식
     1. 탭을 활용한다(스페이스와 구별)
     2. 탭의 크기는 스페이스 4개와 동일하다.
     3. 클래스,메서드,제어문 등의 코드 블럭이 생기면 들여쓰기를 활용한다.
  5. 중괄호 방식(클래스/메서드 선언 및 조건/반복문 등 코드 블럭을 감싸는 중괄호 방식)
     1. 기본
        1. 줄의 마지에 시작 중괄호
        2. 시작 중괄호 이후 새줄 삽입
        3. 새줄 부터 블럭코드
        4. 블럭 종료 후 새줄 삽입
        5. 새줄 부터 닫는 중괄호
     2. else, catch, finally, while는 닫는 중괄호와 같은 줄에 선언한다.
     3. 내용이 없는 블럭을 선언할 경우 같은 줄에서 중괄호 닫는것을 허용한다.
     4. 조건/반복문에 중괄호를 필수로 사용한다.
     5. 이후 컨벤션은 추가예정

---
트러블 슈팅 기록

1. 인코딩 이슈
   - 발견은 기본 main어플리케이션에 주석을 달면서 시작.
   - while문 작성 이후 시작을 해보려고 하니 빌드자체가 오류가 났었다. 
   - 오류 메시지는 unmappable character for encoding MS949
   - 검색결과 [링크](https://velog.io/@sc_shin/Gradle-%EC%82%AC%EC%9A%A9-%EC%8B%9C-%EC%9D%B8%EC%BD%94%EB%94%A9-%EC%98%A4%EB%A5%98-%EC%B2%98%EB%A6%AC)
   - 이곳을 참고해서 해결했다.
   - build.gradle 파일에 옵션 추가하는 내용 기록
```java
compileJava.options.encoding = 'UTF-8'

tasks.withType(JavaComile) {
   options.encoding = 'UTF-8'
}
```

이후 새로 빌드해보니 빌드가 제대로 구현되는 것을 확인.
스크린샷들로 정리를 하였으나 이건 추후에 업로드하겠다.


2. 


---
