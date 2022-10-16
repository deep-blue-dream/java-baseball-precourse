package baseball.model;


import java.util.Arrays;
import java.util.Map;

//게임의 상태를 지정하는 열거형 클래스
public enum GameStatus {


    
    //게임시작 초기값으로 0
    START (0),
    //게임 재시작, 1 들어오면 재시작
    RESTART(1),
    //2 들어오면 게임 종료
    END(2),
    ;

    //command 변수 선언
    private final int command;

    //게임의 상태를 관리하는 GameStatus 는 command 의 값에 따라 변경될 예정.
    GameStatus(int command){
        this.command = command;
    }

    //owner 에게 게임 start status 부여한다.
    public static GameStatus start() {
        return GameStatus.START;
    }

    //입력된 커맨드를 받아 게임Status를 변경하는 메서드
    public static GameStatus createCommand(int inputCommand) throws IllegalArgumentException {
        return Arrays.stream(values())
                .filter(gameStatus -> gameStatus.command == inputCommand)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    //사용자가 입력하는 값(command)가 2일 경우 게임 종료가 될 예정.
    public boolean isEndGame() {
        return this == END;
    }

    //사용자가 입력하는 값 (command)가 1일 경우 게임 재시작이 될 예정.
    public boolean reStartGame() {
        return this == RESTART;
    }


}
