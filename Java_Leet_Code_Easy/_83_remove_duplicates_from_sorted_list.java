package Java_Leet_Code_Easy;

public class _83_remove_duplicates_from_sorted_list {

	class ListNode {
		int val;
		ListNode next;
	}

	public static void main(String[] args) {
		_83_remove_duplicates_from_sorted_list cs = new _83_remove_duplicates_from_sorted_list();
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode currentNode = head;
		while (currentNode != null) {
			if (currentNode.next != null && currentNode.val == currentNode.next.val) {
				currentNode.next = currentNode.next.next;
			} else {
				currentNode = currentNode.next;
			}
		}
		return head;
	}
}
