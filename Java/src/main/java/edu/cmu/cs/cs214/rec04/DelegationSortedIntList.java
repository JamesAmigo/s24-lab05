package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{
    // Write your implementation below with API documentation
    private SortedIntList list;
    private int totalAdded;

    /** 
     * Constructor for DelegationSortedIntList. Initializes the list and totalAdded count.
     * 
     */
    public DelegationSortedIntList() {
        list = new SortedIntList();
        totalAdded = 0;
    }

    /** 
     * Adds an element to the sorted list and updates the totalAdded count.
     * 
     * @param num the number to be added to the list
     * @return true if the number was added to the list, false otherwise
     */
    public boolean add(int num) {
        boolean result = list.add(num);
        if(result) {
            totalAdded++;
            return true;
        }
        else
            return false;
    }

    /** 
     * Adds all elements from the given list to the sorted list and updates the totalAdded count.
     * 
     * @param nums the list of numbers to be added to the list
     * @return true if the numbers were added to the list, false otherwise
     */
    public boolean addAll(IntegerList nums) {
        boolean result = list.addAll(nums);
        if(result) {
            totalAdded += nums.size();
            return true;
        }
        else
            return false;
    }

    /** 
     * Returns the element at the index in the list.
     * 
     * @param index the index of the element to be returned
     * @return the element at the index
     */
    public int get(int index) {
        return list.get(index);
    }

    /** 
     * Removes the first occurrence of the specified element from the list.
     * 
     * @param num the number to be removed from the list
     * @return true if the number was removed from the list, false otherwise
     */
    public boolean remove(int num) {
        return list.remove(num);
    }

    /** 
     * Removes all elements from the list that are contained in the specified list.
     * 
     * @param nums the list of numbers to be removed from the list
     * @return true if the numbers were removed from the list, false otherwise
     */
    public boolean removeAll(IntegerList nums) {
        return list.removeAll(nums);
    }

    /** 
     * Returns the number of elements in the list.
     * 
     * @return the number of elements in the list
     */
    public int size() {
        return list.size();
    }

    /** 
     * Returns the total number of elements added to the list. Does not decrease when elements are removed.
     * 
     * @return the total number of elements added to the list
     */
    public int getTotalAdded() {
        return totalAdded;
    }

}