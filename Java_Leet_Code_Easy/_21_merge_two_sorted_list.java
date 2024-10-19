package Java_Leet_Code_Easy;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class _21_merge_two_sorted_list {

	public static void main(String[] args) {
		_21_merge_two_sorted_list cs = new _21_merge_two_sorted_list();
		cs.mergeTwoLists(null, null);
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		return new ListNode();
	}
}
