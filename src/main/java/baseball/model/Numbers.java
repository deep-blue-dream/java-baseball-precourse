package baseball.model;
import camp.nextstep.edu.missionutils.Randoms;


//추후에 다시 리팩터링할 예정.
public class Numbers {
    //3자리 배열 생성
    int ownerNumbers[] = new int[3];
    int numberStartIndex = 0;


    private static boolean checkRandomNumbers(int arr[], int index) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == index) {
                return true;
            }
        }
        return false;
    }




}
