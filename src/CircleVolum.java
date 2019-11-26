public class CircleVolum extends Thread implements ISubscriber{
    private double input;
    private void circleVolume() {
        System.out.println("Volume of circle="+3.14*input*input*input*(4/3));
    }
    public void run() {
        circleVolume();
    }
    public void notifySubscriber(Topic topic) {
        input = (double)topic.getValue();
        this.start();
    }
}
