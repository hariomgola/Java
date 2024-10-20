package Java_Leet_Code_Medium;

public class _2_add_two_numbers {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		boolean isL1pending = true;
		boolean isL2pending = true;
		while (l1.next != null || l2.next != null) {
			int _temp = 0;
			if (isL1pending && l1.next == null) {
				_temp += l1.val;
				l1 = l1.next;
				if (l1 == null) {
					isL1pending = false;
				}
			}
			if (isL2pending && l2.next == null) {
				_temp += l2.val;
				l2 = l2.next;
				if (l2 == null) {
					isL2pending = false;
				}
			}
			System.out.println(">>>>" + _temp);
		}
		return new ListNode();
	}

}
