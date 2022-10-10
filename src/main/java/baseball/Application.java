package baseball;
import baseball.model.Owner;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        //게임 진행자 Owner 생성
        Owner owner = new Owner();
        //오너와 함께 게임을 하자.
        gameStart(owner);
    }

    //게임 메서드 생성
    private static void gameStart(Owner owner){

        boolean gameJudge = true;

        while (gameJudge == true) {
                //게임 진행내용 적을 예정.

                //게임 종료
                break;
        }
    }

}
