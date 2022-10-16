package baseball.service;

import baseball.model.Board;
import baseball.model.GameStatus;
import camp.nextstep.edu.missionutils.Console;



public class InputService {

    private static final String GAME_SET_MESSAGE = "3개의 숫자 모두 정답! 게임 끝";

    private static final String INPUT_GAME_CONTINUE_OR_QUIT_MESSAGE = "게임을 새로 시작하려면 1을, 종료하려면 2를 입력";

    public String InputService() {
        System.out.println("숫자를 입력해주세요 : ");
        String userInputNumbers = Console.readLine();
        return userInputNumbers;
    }

    public static GameStatus createCommand(Board board) {
        //게임 클리어 상태가 아니라면, gameStatus는 start상태
        if (!board.isGameClear()) {
            return GameStatus.start();
        }
        //게임 클리어상태(스트라이크3개)면 진행
        //게임 클리어 선언+게임 재시작/종료 커맨드 입력 요청
        System.out.println(GAME_SET_MESSAGE);
        System.out.println(INPUT_GAME_CONTINUE_OR_QUIT_MESSAGE);
        //입력받은 값을 Int로 변환하여 리턴한다.
        return GameStatus.createCommand(Integer.parseInt(Console.readLine()));
    }


}
