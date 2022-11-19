package bridge;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(List<String> upBridge,List<String> downBridge) {
        printUpMap(upBridge);
        printDownMap(downBridge);
    }
    private void printUpMap(List<String> upBridge){
        System.out.print("[");
        for(int i=0; i<upBridge.size();i++){
            String userSelect = upBridge.get(i);
            if(i>0){
                System.out.print("|");
            }
            System.out.print(userSelect);
        }
        System.out.println("]");
    }
    private void printDownMap(List<String> downBridge){
        System.out.print("[");
        for(int i=0; i<downBridge.size();i++){
            String userSelect = downBridge.get(i);
            if(i>0){
                System.out.print("|");
            }
            System.out.print(userSelect);
        }
        System.out.println("]");
    }
    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(boolean isSuccess,int Attempts) {
        if(isSuccess)
            System.out.println(MessageView.PRINT_GAME_SUCCESS +"실패");
        else if(!isSuccess)
            System.out.println(MessageView.PRINT_GAME_SUCCESS +"성공");

        System.out.println(MessageView.PRINT_GAME_ATTEMPTS+Attempts);

    }
}
