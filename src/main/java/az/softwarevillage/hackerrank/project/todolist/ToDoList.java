package az.softwarevillage.hackerrank.project.todolist;

public class ToDoList {
   private String exercise;
    private  boolean solved;

    public  boolean isSolved() {

        return solved;
    }
public ToDoList(){

}
    public  void setSolved(boolean solved) {
        this.solved=solved;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public ToDoList(String exercise,boolean solved) {
        this.exercise = exercise;
        this.solved=solved;
    }

    @Override
    public String toString() {
        return
                "exercise='" + exercise + '\'' +",is solved?=" + isSolved();
    }
}
