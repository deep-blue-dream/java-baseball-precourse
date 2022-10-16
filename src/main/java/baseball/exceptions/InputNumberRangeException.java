package baseball.exceptions;


//잘못된 값 입력 예외 출력
public class InputNumberRangeException extends IllegalArgumentException {
    
    public InputNumberRangeException() {
        System.out.println("1에서 9 사이 값만 입력해주세요");
    }
}
