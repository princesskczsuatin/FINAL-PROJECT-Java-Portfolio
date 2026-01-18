package ui;
import controller.TaskManager;
import model.Task;
import javax.swing.*;
import java.awt.*;
public class TaskForm extends JFrame {
    private JTextField txtId, txtName;
    private JTextArea txtDescription;
    private JComboBox<String> cmbStatus;
    private TaskManager taskManager;
    private MainWindow mainWindow;
    public TaskForm(MainWindow mainWindow, TaskManager taskManager) {
        this.mainWindow = mainWindow;
        this.taskManager = taskManager;
        setTitle("Add Task");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JPanel panel = new JPanel(new GridLayout(8, 1));
        txtId = new JTextField(String.valueOf(taskManager.generateTaskId()));
        txtId.setEditable(false);
        txtName = new JTextField();
        txtDescription = new JTextArea(2, 18);
        cmbStatus = new JComboBox<>(new String[]{
                "NOT_STARTED", "ONGOING", "DONE"
        });
        panel.add(new JLabel("Task ID"));
        panel.add(txtId);
        panel.add(new JLabel("Task Name"));
        panel.add(txtName);
        panel.add(new JLabel("Task Description"));
        panel.add(new JScrollPane(txtDescription));
        panel.add(new JLabel("Status"));
        panel.add(cmbStatus);
        JButton btnSave = new JButton("Save Task");
        btnSave.addActionListener(e -> saveTask());
        add(panel, BorderLayout.CENTER);
        add(btnSave, BorderLayout.SOUTH);
    }

    private void saveTask() {
        if (txtName.getText().isEmpty() || txtDescription.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required.");
            return;
        }
        Task task = new Task(
                Integer.parseInt(txtId.getText()),
                txtName.getText(),
                txtDescription.getText(),
                Task.Status.valueOf(cmbStatus.getSelectedItem().toString())
        );
        taskManager.addTask(task);
        mainWindow.refreshTable();
        dispose();
    }
}
