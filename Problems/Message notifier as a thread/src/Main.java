class MessageNotifier extends Thread {

    protected String string;
    protected int reps;

    public MessageNotifier(String msg, int repeats) {
        this.string = msg;
        this.reps = repeats;
    }

    @Override
    public void run() {
        for(int i = 0; i < reps; i++) {
            System.out.println(string);
        }
    }
}