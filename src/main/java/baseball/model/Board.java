package baseball.model;

public class Board {

    //질문1, 여기서 strikeCount/ballCount는 각각 private int strikeCount로 선언하였음.
    //그런데 인텔리J가 final 클래스 변경 추천함.
    private final int strikeCount;
    private final int ballCount;

    //전광판Board는 필드값 strike,ball점수를 가지고 있다.
    private Board(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public boolean isGameClear() {
        return strikeCount == 3;
    }
}
