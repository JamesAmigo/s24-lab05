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

public class DelegationSortedIntList {
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
     * Returns the total number of elements added to the list.
     * 
     * @return the total number of elements added to the list
     */
    public int getTotalAdded() {
        return totalAdded;
    }

}