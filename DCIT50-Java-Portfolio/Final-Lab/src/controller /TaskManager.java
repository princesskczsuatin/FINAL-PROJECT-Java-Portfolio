package controller;
import model.Task;
import java.util.ArrayList;
public class TaskManager {

    private ArrayList<Task> tasks;
    public TaskManager() {
        tasks = new ArrayList<>();
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
    public ArrayList<Task> getTasks() {
        return tasks;
    }
    public void updateTask(int index, Task updatedTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, updatedTask);
        }
    }
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }
    public int generateTaskId() {
        return tasks.size() + 1;
    }
}
