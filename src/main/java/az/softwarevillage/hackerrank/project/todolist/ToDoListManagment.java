package az.softwarevillage.hackerrank.project.todolist;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManagment {
    ArrayList<ToDoList> toDoLists=new ArrayList<>();
    ToDoList tdl=new ToDoList();
    public void add(String exercise){

        toDoLists.add(new ToDoList(exercise.toLowerCase(), tdl.isSolved()));
    }
    public ArrayList<ToDoList> showAll(){
        return toDoLists;
    }
    public void delete(String exercise){
        for (int i=0;i<toDoLists.size();i++){
            if (toDoLists.get(i).getExercise().equals(exercise)){
                toDoLists.remove(i);
            }
        }

    }
public  void solved(String exercise){
    for (int i=0;i<toDoLists.size();i++){
        if (toDoLists.get(i).getExercise().equals(exercise)){
            toDoLists.get(i).setSolved(true);
        }}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    ToDoListManagment tm=new ToDoListManagment();
        while (true) {
            System.out.println("Choose menu:1 add exercise,2 show all exercises,3 marked as solved,4 delete exercise 5 Exit System ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("add exercise");
                    tm.add(sc.next());
                    break;
                case 2:
                    System.out.println(  tm.showAll());
                    break;
                case 3:
                    System.out.println("selecet exercise");
                  tm.solved(sc.next());
                    break;
                case 4:
                    System.out.println("selecet exercise");
                   tm.delete(sc.next());
                    break;
                case 5:
                    System.out.println("See you later");
                    System.exit(0);
                    break;
                default:
                    System.out.println("No such operation was found");
            }
        }


    }
}
