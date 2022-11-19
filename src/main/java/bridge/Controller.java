package bridge;

public class Controller {
    public void run(){
        int bridgeLength=0;
        System.out.println(MessageView.START_GAME_MESSAGE);
        bridgeLength = getBridgeSize();
        BridgeMaker bridgeMaker = new BridgeMaker(new BridgeNumberGenerator);
        bridgeMaker.makeBridge(bridgeLength);
        
    }

    private int getBridgeSize(){
        InputView inputView = new InputView();
        System.out.println(MessageView.PRINT_BRIDGE_INPUT_MESSAGE);
        return inputView.readBridgeSize();
    }

    private void moveBridge(){

    }
    private void printBridgeResult(){

    }
}
