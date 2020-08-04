package BrainfuckPac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.function.IntConsumer;

public class Compiler{
    int count=0;
    public ArrayList<Action> compile(String string, ArrayList<Action> ActionList){

        Stack<ArrayList<Action>> stack = new Stack<>();            //поток, в который записываются данные
        stack.add(ActionList);

        HashMap<Character, IntConsumer> actionsMap = new HashMap<>();
        actionsMap.put('+', value -> stack.peek().add(new Plus()));
        actionsMap.put('-', value -> stack.peek().add(new Minus()));
        actionsMap.put('.', value -> stack.peek().add(new Out()));
        actionsMap.put('>', value -> stack.peek().add(new Next()));
        actionsMap.put('<', value -> stack.peek().add(new Prev()));
        actionsMap.put('[', value -> {

            ArrayList<Action> list = new ArrayList<>();
            stack.peek().add(new CycleEnd(list));
            stack.add(list);

            //((CycleEnd)stack.peek().get(stack.peek().size()-1)).actionList=stack.peek();

        });
        actionsMap.put(']', value -> {
            stack.pop();
        });

        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (actionsMap.containsKey(c)) {
                actionsMap.get(c).accept(i);
            } else {
                if (c != ' ') {
                    System.out.println(c + " is not a symbol!");
                }
            }
        }

        return ActionList;
    }
}