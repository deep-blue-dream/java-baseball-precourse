package baseball.exceptions;

public class UserInputDoubleNumbersException extends IllegalArgumentException{
    public UserInputDoubleNumbersException(){
        System.out.println("중복된 숫자를 입력하셨습니다.");
    }
}
