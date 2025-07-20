package Day21;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
		next =null;
	}
}


public class MergeSortedListsUsingHelperMethod {
	public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
		return mergeHelper(head1, head2);
	}
	 private ListNode mergeHelper(ListNode head1, ListNode head2) {
	        if (head1 == null || head2 == null) {
	            return head1 == null ? head2 : head1;
	        }

	        if (head1.val <= head2.val) {
	            head1.next = mergeHelper(head1.next, head2);
	            return head1;
	        } else {
	            head2.next = mergeHelper(head1, head2.next);
	            return head2;
	        }
	    }

	    // Test the code
	    public static void main(String[] args) {
	        ListNode l1 = new ListNode(1);
	        l1.next = new ListNode(3);
	        l1.next.next = new ListNode(5);

	        ListNode l2 = new ListNode(2);
	        l2.next = new ListNode(4);
	        l2.next.next = new ListNode(6);

	        MergeSortedListsUsingHelperMethod  sol = new MergeSortedListsUsingHelperMethod ();
	        ListNode merged = sol.mergeTwoLists(l1, l2);

	        // Print the merged list
	        while (merged != null) {
	            System.out.print(merged.val + " ");
	            merged = merged.next;
	        }
	    }

}
