package de.dhbw.ravensburg.Queue;

public class QueueElement <T> {

    private T value;
    private QueueElement <T> next;

    public QueueElement(T value, QueueElement<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public QueueElement<T> getNext() {
        return next;
    }

    public void setNext(QueueElement<T> next) {
        this.next = next;
    }

}
