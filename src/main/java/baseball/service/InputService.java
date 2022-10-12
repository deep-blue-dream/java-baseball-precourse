package baseball.service;

import camp.nextstep.edu.missionutils.Console;



public class InputService {

    private static final String GAME_SET_MESSAGE = "3개의 숫자 모두 정답! 게임 끝";

    private static final String INPUT_GAME_CONTINUE_OR_QUIT_MESSAGE = "게임을 새로 시작하려면 1을, 종료하려면 2를 입력";

    public String InputService() {
        System.out.println("숫자를 입력해주세요 : ");
        String userInputNumbers = Console.readLine();
        return userInputNumbers;
    }


}
