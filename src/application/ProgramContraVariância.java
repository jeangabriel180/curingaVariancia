package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramContraVariância {
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        //supertipo de number é objeto
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);

        //Number x = myNums.get(0);
    }
}
