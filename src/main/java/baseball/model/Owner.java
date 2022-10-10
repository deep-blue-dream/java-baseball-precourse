package baseball.model;


//Owner는 게임 진행자. 만약 게임을 종료하겠다고 선언시 main에게 false값을 전달할 수 있도록 한다.
public class Owner {

    //게임 진행자는 3 자리의 숫자(도구)를 보유한다.
    private int gameNumbers;
    private GameStatus gameStatus;


    //Owner를 생성한다.
    //객채 오너는 2개의 값을 가지고 있다. 게임에 필요한 3자리 숫자
    //게임 진행 상태를 확인하는 gameStatus
    public Owner(int gameNumbers, GameStatus gameStatus) {
        this.gameNumbers = gameNumbers;
        this.gameStatus = gameStatus;
    }

    public Owner() {

    }

    public boolean isGameFinished() {
        return gameStatus.isEndGame();
    }


}
