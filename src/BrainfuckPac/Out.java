package BrainfuckPac;

//класс для вывода из текущей ячейки
public class Out extends Action {
    @Override
    public void execute(Array array) {
        System.out.print((char)array.array[array.getPosition()]);
    }
    @Override
    public String toString(){
        return ("Out");
    }
}
