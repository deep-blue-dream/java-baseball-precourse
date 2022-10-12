package baseball;
import baseball.model.Owner;
import baseball.model.Numbers;
import baseball.service.InputService;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;

import static baseball.service.InputService.createCommand;

public class Application {
    
    //숫자 중복 체크 메서드
    public static boolean checkRandomNumbers(int arr[], int index) {
        //배열을 순회하면서 동일한 값이 있을경우 true 값 반환
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                //true가 반환되면 do while문은 다시 돌게 된다.
                return true;
            }
        } return false;
    }
    
    
    public static void main(String[] args) {

        
        //랜덤으로 값 만들어주는 메서드
        //오너의 숫자를 3자리 빈 배열 생성
        int[] ownerNumbers = new int[3];
        int index = 0;
        //배열에 값이 다 찰 때까지 반복
        for(int i = 0; i < ownerNumbers.length; i++) {
            do {
                //랜덤 값 생성해서 넣기
                index = Randoms.pickNumberInRange(1,9);
                //중복시 while 재시작
                }while(checkRandomNumbers(ownerNumbers, index));
            ownerNumbers[i] = index;
        }
        //출력해봄.
        System.out.println(Arrays.toString(ownerNumbers));

        //게임 진행자 Owner 생성(시작 status 가지고 생성)
        Owner owner = Owner.haveStartStatus();
        //오너와 함께 게임을 하자.
        gamePlay(owner);
    }



    //gamePlay 메서드명 변경
    private static void gamePlay(Owner owner){
        //게임 진행 로직 while 을 통해서 게임의 진행상황을 반복시킬 예정.
        //정답이 나오지 않으면 (Strike == 3) Status 는 변경되지 않는다.

        // 오너가 가진 isGameFinished()메서드를 통해서 true/false 적용예정.
        // 게임 종료가 참이 되면 부정으로 false 되므로 while 종료.
        // 게임 종료가 거짓이라면 부정으로 true 반복
        while (!owner.isGameFinished()) {
            //게임 진행내용 적을 예정.
            //1. 오너가 게임 준비할 예정, 오너는 3개 숫자 준비하는 과정을 거친다.
            //2. 유저는 3개의 값을 입력받는 메서드를 준비해온다.
            //3. 점수를 판정한다.
            //4. 결과를 보여준다.
            //5. 입력받는 값에 따라서 오너는 게임 종료할지 말지를 상태를 변경한다.



            //게임 종료
        }
    }

}
