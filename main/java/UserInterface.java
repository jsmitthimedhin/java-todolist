
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
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String taskToAdd = scanner.nextLine();
                todoList.add(taskToAdd);
            } else if (command.equals("list")) {
                todoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                String taskToRemove = scanner.nextLine();
                int taskToRemoveNumber = Integer.parseInt(taskToRemove);
                todoList.remove(taskToRemoveNumber);
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}
