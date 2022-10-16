package baseball.model;


import baseball.exceptions.OwnerEndStatusException;

import java.util.Map;

//Owner는 게임 진행자. 만약 게임을 종료하겠다고 선언시 main에게 false값을 전달할 수 있도록 한다.
public class Owner {

    //게임 진행자는 3 자리의 숫자(도구)를 보유한다.
    private Map<String, Integer> numbers;


    private Numbers answerNumbers;

    //게임 진행자는 게임 진행 status를 보유한다.
    private GameStatus gameStatus;


    //Owner를 생성한다.
    //객채 오너는 2개의 값을 가지고 있다. 게임에 필요한 3자리 숫자
    //게임 진행 상태를 확인하는 gameStatus
    public Owner(Map<String, Integer> numbers, GameStatus gameStatus) {
        this.numbers = numbers;
        this.gameStatus = gameStatus;
    }


    //게임시작 상태를 가지기 위한 생성자 함수
    public Owner(GameStatus gameStatus){
        this.gameStatus = gameStatus;
    }

    //오너가 게임시작 상태를 가지고 생성된다. (기본생성자 필요 없어짐)
    public static Owner haveStartStatus(Map<String, Integer> numbers){
        Owner owner = new Owner(numbers, GameStatus.start());
        return owner;
//        return new Owner(GameStatus.start());
    }

    //Owner가 가진 종료 메서드 boolean 타입으로 0,1만 반환한다.
    //gameStatus가 가진 메서드 isEndGame으로 값을 반환하게 할 예정.
    public boolean isGameFinished() {
        return gameStatus.isEndGame();
    }

    public boolean reStartGame() {
        return gameStatus.reStartGame();
    }


    //게임 스테이터스 변경하는 메서드
    public void changeGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Owner ready(){
        if (gameStatus.isEndGame()) {
            throw new OwnerEndStatusException();
        }
        if (gameStatus.reStartGame()) {

            return haveStartStatus(numbers);
        }
        return this;
    }

    private Owner(Numbers answerNumbers, GameStatus gameStatus){
        this.answerNumbers = answerNumbers;
        this.gameStatus = gameStatus;
    }
    public Board playGame(Numbers userNumbers) {
        int strikeCount = answerNumbers.checkStrikeCount(userNumbers);
        int ballCount = answerNumbers.checkBallCount(userNumbers);
        return Board.from(strikeCount, ballCount);
    }

}
