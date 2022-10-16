package baseball.exceptions;

public class InputNumberSizeException extends IllegalArgumentException{

    public InputNumberSizeException() {
        System.out.println("3개의 숫자를 입력해주세요");
    }

}
