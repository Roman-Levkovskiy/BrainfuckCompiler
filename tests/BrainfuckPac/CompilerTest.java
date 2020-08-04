package BrainfuckPac;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CompilerTest {
    Compiler compiler = new Compiler();
    String string = "+++-->>+<++.";
    ArrayList<Action> actionList = new ArrayList<>();

    @Test
    public void test(){
        actionList.add(new Plus());
        actionList.add(new Plus());
        actionList.add(new Plus());
        actionList.add(new Minus());
        actionList.add(new Minus());
        actionList.add(new Next());
        actionList.add(new Next());
        actionList.add(new Plus());
        actionList.add(new Prev());
        actionList.add(new Plus());
        actionList.add(new Plus());
        actionList.add(new Out());

            assertEquals(actionList, compiler.compile(string, actionList));

    }
}
