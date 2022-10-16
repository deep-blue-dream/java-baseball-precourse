package baseball.service;

import baseball.model.Board;

public class OutputService {

    private OutputService() {
    }


    //출력 양식 설정
    public static void outputService(Board board) {

        //둘 다 없을 때
        if (board.isNothing()) {
            System.out.println("낫싱입니다.");
        }
        //볼 갯수가 0개일 때 (스트라이크는 0개가 아님)
        if (board.ballCount() == 0) {
            System.out.printf("%d스트라이크", board.strikeCount());
        }
        //스트라이크 갯수가 0개일 때 (볼 갯수는 0개가 아님)
        if (board.strikeCount() == 0) {
            System.out.printf("%볼", board.ballCount());
        }
        //스트라이크, 볼 갯수가 0개 넘었을 때
        System.out.printf("%d 스트라이크" + " " + "%d 볼" , board.strikeCount(), board.ballCount());
    }

}
