package ui;
import controller.TaskManager;
import model.Task;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MainWindow extends JFrame {
    private TaskManager taskManager;
    private JTable table;
    private DefaultTableModel tableModel;
    private TaskForm taskForm;
    public MainWindow(TaskManager taskManager) {
        this.taskManager = taskManager;
        setTitle("To-Do List");
        setSize(680, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(e -> openTaskForm());
        tableModel = new DefaultTableModel(
                new Object[]{"Task ID", "Task Name", "Task Description", "Status"}, 0
        );

        table = new JTable(tableModel);
        add(addButton, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
    private void openTaskForm() {
        if (taskForm == null || !taskForm.isDisplayable()) {
            taskForm = new TaskForm(this, taskManager);
            taskForm.setVisible(true);
        }
    }
    public void refreshTable() {
        tableModel.setRowCount(0);
        for (Task task : taskManager.getTasks()) {
            tableModel.addRow(new Object[]{
                    task.getTaskId(),
                    task.getTaskName(),
                    task.getTaskDescription(),
                    task.getStatus()
            });
        }
    }
}
