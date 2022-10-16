package baseball.exceptions;

public class OwnerEndStatusException extends RuntimeException{

    public OwnerEndStatusException() {
        System.out.println("게임이 종료된 상태입니다.");
    }
}
