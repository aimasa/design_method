package cn.zhy.design.method_build;

public class Publish extends subject {
    private String massage;

    public Publish() {
    }

    public Publish(String massage) {
        this.massage = massage;
    }

    @Override
    public void addObserves(Observe observe) {
        observes.add(observe);
    }

    @Override
    public void deleObserves(Observe observe) {
        // TODO Auto-generated method stub
        observes.remove(observe);
    }

    @Override
    public void notified() {
        // TODO Auto-generated method stub
        for (Observe observe : observes) {
            observe.update(massage);
        }
    }

}
