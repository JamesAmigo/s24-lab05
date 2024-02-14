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

    public DelegationSortedIntList() {
        list = new SortedIntList();
        totalAdded = 0;
    }

    public boolean add(int num) {
        boolean result = list.add(num);
        if(result) {
            totalAdded++;
            return true;
        }
        else
            return false;
    }

    public boolean addAll(IntegerList nums) {
        boolean result = list.addAll(nums);
        if(result) {
            totalAdded += nums.size();
            return true;
        }
        else
            return false;
    }

    public int getTotalAdded() {
        return totalAdded;
    }

}