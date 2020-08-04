package BrainfuckPac;

public class Array {
    public int[] array = new int [30000];
    private int count=0;
    private int position=0;

    public void setCount(int count) {
            this.count = count;
    }

    public void setPosition(int position) {
            this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public int getCount() {
        return count;
    }
}
