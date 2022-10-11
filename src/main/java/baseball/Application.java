package baseball;
import baseball.model.Owner;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        //게임 진행자 Owner 생성(시작 status 가지고 생성)
        Owner owner = Owner.haveStartStatus();

        //오너에게 게임 도구 장착(3자리 숫자)


        //오너와 함께 게임을 하자.
        gameStart(owner);
    }

    //게임 메서드 생성
    private static void gameStart(Owner owner){


        //오너가 가진 isGameFinished()메서드를 통해서 true/false 적용예정.
        while (!owner.isGameFinished()) {
            //게임 진행내용 적을 예정.


            //정답입니다. -> 이후 하단 게임 종료 로직 진행 예정
            
            
            
            System.out.print("1,2를 눌러볼까요? : ");
            String num = readLine();

            //1은 게임 다시시작
            if (num.equals("1")) {
                System.out.println("게임을 재시작하는 로직");

                //2는 게임 종료
            } else if (num.equals("2")) {
                System.out.println("게임을 종료하는 로직");
                break;
            } else {
                System.out.println("예외처리하는 로직");
            }



            //게임 종료
//            gameJudge = owner.isGameFinished();
        }
    }

}
