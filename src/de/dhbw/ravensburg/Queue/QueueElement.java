package de.dhbw.ravensburg.Queue;

public class QueueElement <T> {

    private T value;
    private QueueElement <T> next;

    public QueueElement(T value) {
        this.value = value;
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

    public QueueElement setNext(T value) {
        next = new QueueElement<T>(value);
        return next;
    }

    public int count(){
        if (next == null) {
            return 1;
        } else {
            return next.count() +1;
        }

    }
    public T getElement(int i){
        i--;
        if(i==0){
            return(value);
        }
        else{
            if(next != null){
                return next.getElement(i);
            }else{
                return null;
            }
        }
    }
    public QueueElement add(int index, T value){
        index--;
        if(index == 0) {
            QueueElement sub = new QueueElement<>(value);
            sub.next = this;
            return sub;
        }else{
            next.add(index, value);
            return this;
        }
    }
    public QueueElement<T> removeCertain(T value){
        Index--;
        if(value==0) {
            return next;
        } else{
            next.removeCertain(value);
            return this;
        }
    }

}
