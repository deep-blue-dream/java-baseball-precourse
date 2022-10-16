package baseball.service;

import baseball.model.Board;
import baseball.model.GameStatus;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class InputService {

    private static final String GAME_SET_MESSAGE = "3개의 숫자 모두 정답! 게임 끝";

    private static final String INPUT_GAME_CONTINUE_OR_QUIT_MESSAGE = "게임을 새로 시작하려면 1을, 종료하려면 2를 입력";

    //유저의 입력받는 값을 String으로 받으면 안됨.
    //하지만 readLine은 String으로 반환하므로 중간에 숫자 List로 변환한다.
    public static List<Integer> inputUserNumbers() {
        System.out.println("숫자를 입력해주세요 : ");
        //유저에게 값 입력받은 것을  inputNumbers에 담은 뒤
        String inputNumbers = Console.readLine();
        //정수로 변환, 각 자리로 나눈 뒤 map형식으로 정수 변환
        return Arrays.stream(inputNumbers.split(""))
                .map(Integer::new)
                .collect(Collectors.toList());
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
