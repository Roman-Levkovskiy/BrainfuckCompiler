package BrainfuckPac;

//класс, переходящий на следующую ячейку
public class Next extends Action {
    @Override
    public void execute(Array array) {
        if (array.getPosition()<array.array.length-1) {
            array.setPosition(array.getPosition() + 1);
        }
    }

    @Override
    public String toString(){
        return ("Next");
    }
}
