package baseball.model;


//게임의 상태를 지정하는 열거형 클래스
public enum GameStatus {


    //상태는 게임중(1), 종료(0)로 분리한다.
    PLAYING(1),

    END(0),
    ;

    //command 변수 선언
    private final int command;

    //게임의 상태를 관리하는 GameStatus는 command의 값에 따라 변경될 예정.
    GameStatus(int command){
        this.command = command;
    }

    //게임의 상태 초기화 메서드 init()생성
    public static GameStatus init() {
        //게임의 상태는
        return GameStatus.PLAYING;
    }

    public boolean isEndGame() {
        return this == END;
    }


}
