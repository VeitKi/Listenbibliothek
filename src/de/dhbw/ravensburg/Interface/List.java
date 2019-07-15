package de.dhbw.ravensburg.Interface;

/**
 *
 * @param <T> Type of the list
 */
public interface List <T extends Comparable>  {

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
         * Removes certain element
         * @param value element to remove
         */
        void removeCertain(T value);


        /**
         * Returns list as Array
         * @return the list as array
         */
        Object[] returnAsArray();


}
