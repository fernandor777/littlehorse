package io.littlehorse.jlib.common.exception;

public class TaskExecutionError extends Exception {

    private Exception parent;

    public TaskExecutionError(Exception parent) {
        this.parent = parent;
    }

    public Exception getParent() {
        return parent;
    }
}
