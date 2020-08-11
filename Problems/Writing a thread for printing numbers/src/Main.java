class NumbersThread extends Thread {

    protected int from;
    protected  int to;

    public NumbersThread(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for(int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }
    // you should override some method here
}