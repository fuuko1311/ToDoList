public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Wake up");
        toDoList.addTask("Sleep");
        toDoList.markAsCompleted("Wake up");
        toDoList.removeTask("Sleep");
    }
}
