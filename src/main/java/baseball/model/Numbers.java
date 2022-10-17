package baseball.model;

import baseball.exceptions.InputNumberRangeException;
import baseball.exceptions.InputNumberSizeException;
import baseball.exceptions.UserInputDoubleNumbersException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//추후에 다시 리팩터링할 예정.
public class Numbers {
    //3자리 배열 생성
//    int ownerNumbers[] = new int[3];
//    int index = 0;

    private static List<Numbers> inputUserNumbers;

    private static int number;

    private static Map<Integer, Numbers> hashNumbers = new HashMap<>();


    static {
        IntStream.rangeClosed(1,3)
                .forEach(number -> hashNumbers.put(number, new Numbers(inputUserNumbers, number)));
    }

    private Numbers(List<Numbers> inputUserNumbers, int number){
        this.inputUserNumbers = inputUserNumbers;
        this.number = number;
    }


    public static Numbers from(int number) {
        //숫자 범위 확인하기
        checkNumberRange(number);
        //입력받은 값을 hash 처리한다.
        return hashNumbers.get(number);
    }


    private static void checkNumberRange(int number) {
        //hash된 number값에 키와 값이 있는지 확인. 없으면 오류처리
        if (!hashNumbers.containsKey(number)) {
            throw new InputNumberRangeException();
        }
    }

    /*private static boolean checkRandomNumbers(int arr[], int index) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == index) {
                return true;
            }
        }
        return false;
    }*/

    
    //유저가 입력한 숫자의 예외체크 후 해시처리해서 반환
    public static Numbers createCheckNumbers(List<Integer> inputNumbers) {
        checkInputSize(inputNumbers.size());
        checkDoubleNumbers(inputNumbers);

        List<Numbers> userNumbers = integerToUserNumbers(inputNumbers);
        return new Numbers(userNumbers, number);

    }

    private static void checkInputSize(int size) {
        if (size != 3) {
            throw new InputNumberSizeException();
        }
    }

    private static void checkDoubleNumbers(List<Integer> inputNumbers) {
        if (checkDistinctCount(inputNumbers) != 3) {
            throw new UserInputDoubleNumbersException();
        }
    }

    private static long checkDistinctCount(List<Integer> inputNumbers){
        return inputNumbers.stream()
                .distinct()
                .count();
    }

    private static List<Numbers> integerToUserNumbers(List<Integer> inputNumbers) {
        return inputNumbers.stream()
                .map(Numbers::from)
                .collect(Collectors.toList());
    }

    private boolean isStrike(int index, Numbers userInputNumbers, Map<String,Integer> ownerNumbers){
        //
        return ownerNumbers.get(index).equals(userInputNumbers.inputUserNumbers.get(index));

    }
    public int checkStrikeCount(Numbers userInputNumbers, Map<String,Integer> ownerNumbers) {
        return (int) IntStream.range(0, 3)
                .filter(index -> isStrike(index, userInputNumbers, ownerNumbers))
                .count();
    }


    private boolean isBall(int index, Numbers userInputNumbers, Map<String,Integer> ownerNumbers){
        return ownerNumbers.get(index).equals(userInputNumbers.inputUserNumbers.get(index));
    }


    public int checkBallCount(Numbers userInputNumbers, Map<String,Integer> ownerNumbers) {
        return (int) IntStream.range(0,3)
                .filter(index -> isBall(index, userInputNumbers, ownerNumbers))
                .count();
    }



    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Numbers that = (Numbers) object;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

}
