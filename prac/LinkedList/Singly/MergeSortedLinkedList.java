package LinkedList.Singly;

public class MergeSortedLinkedList {
    int val;
    MergeSortedLinkedList next;

    public MergeSortedLinkedList(int val) {
        this.val = val;
        this.next = null;
    }

    public MergeSortedLinkedList mergeTwoLists(MergeSortedLinkedList list1, MergeSortedLinkedList list2) {

        if (list1 == null && list2 == null) return null;
        else if (list1 == null && list2 !=null) return list2;
        else if (list2 == null && list1 != null) return list1;

        MergeSortedLinkedList dummy = new MergeSortedLinkedList(0);
        MergeSortedLinkedList tail = dummy;

        while (list1 !=null && list2 !=null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) {
             tail.next = list1;
        } else {
            tail.next = list2;
        }

        return dummy.next;
        
    }

    //Using Recursion
 /*    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
        
    }*/
    
}
