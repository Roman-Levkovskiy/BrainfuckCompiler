package BrainfuckPac;//Класс, проходящий по списку команд и выполняющий его

import java.util.ArrayList;

public class Executor {
    public void doIt(ArrayList<Action> actionList, Array array){


        while (actionList.size() > array.getCount()){           //как говорилось ранее, в качетсве итератора используется конец массива,
                                                            // чтобы его можно было передавать в качестве аргумента, не боясь потерять данные
            actionList.get(array.getCount()).execute(array);

            array.setCount(array.getCount()+1);
        }
    }
}
