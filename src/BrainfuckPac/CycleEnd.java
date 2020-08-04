package BrainfuckPac;

import java.util.ArrayList;

public class CycleEnd extends Action {

    public ArrayList<Action> actionList;

    public CycleEnd(ArrayList<Action> actionList){
        this.actionList=actionList;
    }


    @Override
    public void execute(Array array) {
        while (array.array[array.getPosition()]!=0)
        for (int i=0; i<actionList.size(); ++i){
            actionList.get(i).execute(array);
        }
    }
}