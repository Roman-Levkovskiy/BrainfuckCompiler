package BrainfuckPac;
import java.util.ArrayList;
import java.util.Scanner;

public class Brainfuck {
    public static void main (String[] args){
        //ввод строки
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();


        //Сетап массива для обработки и итератора на 0
        Array array = new Array();
        ArrayList<Action> actionList = new ArrayList<>();


        //вызов класса-компилятора, который работает со строкой
        Compiler compiler = new Compiler();
        actionList = compiler.compile(string, actionList);


        //вызов класса-обработчика команд, вывод чаров
        Executor executor = new Executor();
        executor.doIt(actionList, array);

    }
}











