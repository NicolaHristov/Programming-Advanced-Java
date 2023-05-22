package StackOfStrings;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class StackOfStrings {
    //Create a class Stack that can store only strings and has the following functionality:
    //•	Private field: data: ArrayList<String>
    //•	Public method: push(String item): void
    //•	Public method: pop(): String
    //•	Public method: peek(): String
    private ArrayList<String> data;

    public void push(String item){
        data.add(item);
    }

    public String pop(){
       return data.remove(data.size()-1);
    }
    public String peek(){
        return data.get(data.size()-1);
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

}
