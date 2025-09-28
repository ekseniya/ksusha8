class Task {

    protected TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private String description;

    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public TaskPriority getPriority() {
        return this.priority;
    }

    public String getDescription() {
        return description;
    }
}

enum TaskPriority {
    HIGH,
    MEDIUM,
    LOW
}