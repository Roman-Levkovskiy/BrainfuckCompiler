package BrainfuckPac;

//класс, уменьшающий значение текущей ячейки
public class Minus extends Action {
    @Override
    public void execute(Array array) {
        array.array[array.getPosition()]--;
    }

    @Override
    public String toString(){
        return ("Minus");
    }
}
