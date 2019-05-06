package de.dhbw.ravensburg.Interface;

public interface List <T>{

        /**
         * Checks if the list is empty
         * @return returns true if the list is empty
         */
        boolean isEmpty();


        /**
         * Checks the number of elements in the list
         * @return returns the number of elements in the list
         */
        int size();


        /**
         * Adds an element to the list
         * @param value the value added to the list
         */
        void addElement(T value);


        /**
         * Adds all objects from an other list to the current one
         * @param list objects are added from this list to the current one
         */
        void addOtherList(List list);


        /**
         * Removes all objects from the list
         */
        void removeAll();


        /**
         * Checks if the list contains a certain element
         * @param value value to check for
         * @return returns true if the list contains the element
         */
        boolean contains(T value);


        /**
         * Checks if the committed list contains the same elements as the current list
         * @param list do the elements of this list accord to the current one?
         * @return returns true if the committed list contains the same elements as the current list
         */
        boolean containsAll(List list);


        /**
         * Removes certain element
         * @param value element to remove
         */
        void removeCertain(T value);


        /**
         * Returns list as Array
         * @return the list as array
         */
        T[] returnAsArray();



        String toString();

}
