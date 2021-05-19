
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class TodoList {
    private ArrayList<String> todoList;
    
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        todoList.add(task);
        
    }
    
    public void print() {
        int i =1;
        String allItems = "" ;
        for(String list: todoList) {
            if(i<todoList.size()) {
                allItems = allItems + i + ": " + list + "\n";
            } else {
                allItems = allItems + i + ": " + list;
            }
            i++;
        }
        System.out.println(allItems);
    }
 
    
    public void remove(int number) {
        todoList.remove(number-1);
    }
}
