package baseball.model;

import java.util.stream.IntStream;

public class Board {

    //질문1, 여기서 strikeCount/ballCount는 각각 private int strikeCount로 선언하였음.
    //그런데 인텔리J가 final 클래스 변경 추천함.
    private final int strikeCount;
    private final int ballCount;

    //Board는 유저에게 입력받은 값 + 만들어진 3개 값을 받아와서 Strike 와 ball 을 카운트 해야한다.

    //전광판Board는 필드값 strike,ball점수를 가지고 있다.
    private Board(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public int ballCount() {
        return ballCount;
    }

    public int strikeCount() {
        return strikeCount;
    }


    //게임 클리어 조건
    public boolean isGameClear() {
        return strikeCount == 3;
    }


    //낫싱 조건
    public boolean isNothing() {
        return strikeCount == 0 && ballCount == 0;
    }


    //스트라이크와 볼 카운트를 가진 새 객체 Board 반환
    public static Board from(int strikeCount, int ballCount) {
        return new Board(strikeCount, ballCount);
    }






}
