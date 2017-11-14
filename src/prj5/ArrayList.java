package prj5;

import java.util.Arrays;
import list.ListInterface;

/**
 * 
 * @author Ian Connerney (Ianco)
 *
 * @param <E>
 */

public class ArrayList<T> implements ListInterface<T> {
    private T[] list;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 100;
    private boolean initialized = false;


    /**
     * standard constructor
     */
    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }


    /**
     * overloaded constructor for capacity
     * 
     * @param capacity
     *            to set list to
     */
    public ArrayList(int capacity) {
        @SuppressWarnings("unchecked")
        T[] tempList = (T[])new Object[capacity + 1];
        list = tempList;
        numberOfEntries = 0;
        initialized = true;
    }


    /**
     * adds an entry to the array
     * 
     * @param anEntry
     *            to be added
     */
    public void add(T anEntry) {
        add(numberOfEntries + 1, anEntry);
    }


    public T remove(int givenPosition) {
        checkInitialization();
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            T result = list[givenPosition];
            if (givenPosition < numberOfEntries) {
                removeGap(givenPosition);
            }
            numberOfEntries--;
            return result;
        }
        else {
            throw new IndexOutOfBoundsException(
                "Illegal position given to remove operation");
        }
    }


    /**
     * helper method for remove (above)
     * 
     * @param givenPosition
     *            position to remove gap from
     */
    private void removeGap(int givenPosition) {
        assert ((givenPosition >= 1) && (givenPosition < numberOfEntries));
        int removedIndex = givenPosition;
        int lastIndex = numberOfEntries;
        for (int i = removedIndex; i < lastIndex; i++) {
            list[i] = list[i + 1];
        }
    }


    /**
     * @return T index replaced
     * @param givenPosition
     *            position to replace with
     * @param newEntry
     *            entry to add in
     * @throws IndexOutOfBoundsException()
     *             if index
     */
    public T replace(int givenPosition, T newEntry) {
        checkInitialization();
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            T originalEntry = list[givenPosition];
            list[givenPosition] = newEntry;
            return originalEntry;
        }
        else {
            throw new IndexOutOfBoundsException(
                "Illegal position given to replace operation");
        }
    }


    /**
     * toArray method
     * 
     * @return list array
     */
    public T[] toArray() {
        checkInitialization();

        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            result[i] = list[i + 1];
        }
        return result;
    }


    /**
     * gets length
     * 
     * @return int arrayList length
     */
    public int getLength() {
        return numberOfEntries;
    }


    /**
     * @return boolean if arrayList is empty
     * 
     */
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }


    /**
     * makes sure capacity is large enough, there is space in the array
     * doubles capacity if there is no space left
     */
    private void ensureCapacity() {
        int capacity = list.length - 1;
        if (numberOfEntries >= capacity) {
            int newCapacity = 2 * capacity;
            checkCapacity(newCapacity);
            list = Arrays.copyOf(list, newCapacity);
        }
    }


    /**
     * 
     * @param newCapacity
     *            capacity to check
     * @throws IllegalStateException
     *             if newCapacity is larger than max
     */
    private void checkCapacity(int newCapacity) {
        if (newCapacity > MAX_CAPACITY) {
            throw new IllegalStateException();
        }

    }


    /**
     * @param givenPosition
     *            position to retrieve entry from
     * @return T entry at givenPosition
     */
    public T getEntry(int givenPosition) {
        checkInitialization();
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            assert !isEmpty();
            return list[givenPosition];
        }
        else {
            throw new IndexOutOfBoundsException(
                "Illegal position given to getEntry operation");
        }
    }


    public boolean contains(T anEntry) {
        checkInitialization();
        boolean found = false;
        int index = 1;
        while (!found && (index <= numberOfEntries)) {
            if (anEntry.equals(list[index])) {
                found = true;
            }
            index++;
        }
        return found;
    }


    /**
     * @param newPosition
     *            position to add entry to
     * @param anEntry
     *            entry to be added
     * @throws IndexOutOfBoundsException
     *             if newPosition is out of list bounds
     */
    public void add(int newPosition, T anEntry) {
        checkInitialization();
        if (newPosition <= numberOfEntries + 1 && newPosition >= 1) {
            if (newPosition <= numberOfEntries) {
                makeRoom(newPosition);
            }
            list[newPosition] = anEntry;
            numberOfEntries++;
            ensureCapacity();
        }
        else {
            throw new IndexOutOfBoundsException(
                "Given position of add's new entry is out of bounds");
        }

    }


    /**
     * 
     * @param newPosition
     *            to make room at
     */
    private void makeRoom(int newPosition) {
        assert (newPosition <= numberOfEntries + 1 && newPosition >= 1);
        int newIndex = newPosition;
        int lastIndex = numberOfEntries;

        for (int i = lastIndex; i >= newIndex; i--) {
            list[i + 1] = list[i];
        }
    }


    /**
     * checks to make sure array has been initialized
     * 
     * @throws IndexOutOfBoundsException
     *             if it hasnt
     */
    public void checkInitialization() {
        if (!initialized) {
            throw new IndexOutOfBoundsException("ArrayList is not initialized");
        }
    }
    /**
     * clears the list
     * creates a new list with the same capacity
     */
    public void clear() {
        @SuppressWarnings("unchecked")
        T[] tempList = (T[])new Object[list.length-1];
        list = tempList;
        numberOfEntries = 0;
        initialized = true;
     }

}
