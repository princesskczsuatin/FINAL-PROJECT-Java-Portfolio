package model;
public class Task extends AbstractTask {
    public enum Status {
        NOT_STARTED,
        ONGOING,
        DONE
    }
    private Status status;
    public Task(int taskId, String taskName, String taskDescription, Status status) {
        super(taskId, taskName, taskDescription);
        this.status = status;
    }

    @Override
    public String getStatus() {
        return status.name();
    }
    @Override
    public void setStatus(String status) {
        this.status = Status.valueOf(status);
    }
    public Status getStatusEnum() {
        return status;
    }
    public void setStatusEnum(Status status) {
        this.status = status;
    }
}
