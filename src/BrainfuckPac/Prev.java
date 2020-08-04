package BrainfuckPac;

//класс для перемещения в предыдущую ячейку
public class Prev extends Action {
    @Override
    public void execute(Array array) {
        if (array.getPosition()>0) {
            array.setPosition(array.getPosition() - 1);
        }
    }
    @Override
    public String toString(){
        return ("Prev");
    }
}
