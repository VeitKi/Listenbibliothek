package de.dhbw.ravensburg.Interface;

public interface List <T>{


        public boolean isEmpty();
        public int size();
        public void addElement(T value);
        public void addOtherList(List list);
        public void removeAll();
        public boolean contains(T value);
        public boolean containsAll(List list);
        public void removeCertain(T value);
        public T[] returnAsArray();

        public String toString();

}
