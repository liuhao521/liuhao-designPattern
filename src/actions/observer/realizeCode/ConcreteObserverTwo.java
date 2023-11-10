package actions.observer.realizeCode;


public class ConcreteObserverTwo implements Observer{
    @Override
    public void update(Message message) {
        // TODO 获取消息通知，执行自己的逻辑
        System.out.println("观察者2 执行");
        tt("");
    }

    public static void tt(String s){

    }
}
