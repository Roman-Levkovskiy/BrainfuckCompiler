package BrainfuckPac;

//класс для увеличения значения в текущей ячейке
public class Plus extends Action {
    @Override
    public void execute(Array array) {
        array.array[array.getPosition()]++;
    }
    @Override
    public String toString(){
        return ("Plus");
    }
}
