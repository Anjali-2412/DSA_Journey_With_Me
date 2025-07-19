package Day20;
class ListNode{
	int val;
	 ListNode next;

	    ListNode(int val) {
	        this.val = val;
	    }
	
}
public class MergeTwoSortedLinkedList {
	
	 public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
	        if (head1 == null || head2 == null) {
	            return (head1 == null) ? head2 : head1;
	        }

	        if (head1.val <= head2.val) {
	            head1.next = mergeTwoLists(head1.next, head2);
	            return head1;
	        } else {
	            head2.next = mergeTwoLists(head1, head2.next);
	            return head2;
	        }
	    }
	
	public static void main(String[] args) {
		 // Creating List 1: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Creating List 2: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Merging
        ListNode merged = mergeTwoLists(list1, list2);

        // Printing the merged list directly
        System.out.print("Merged List: ");
        while (merged != null) {
            System.out.print(merged.val + " -> ");
            merged = merged.next;
        }
        System.out.println("null");
    

	}

}
