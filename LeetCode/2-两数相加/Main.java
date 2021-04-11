public class Main {
    public static void main(String[] args) {
        // ListNode first = new ListNode(8);
        // ListNode second = new ListNode(7);

         ListNode first = new ListNode(8, new ListNode(9));
         ListNode second = new ListNode(7, new ListNode(1));

        ListNode sum = new Solution().addTwoNumbers(first, second);

        while (sum != null) {
            System.out.print(sum.val + ",");
            sum = sum.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next  = next;
        }

    }

    static class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null || l2 == null) {
                throw new IllegalArgumentException();
            }


            ListNode fr = l1;
            ListNode sr = l2;
            ListNode root = new ListNode(-1);
            ListNode cursor = root;
            int carry = 0;

            while (fr != null || sr != null || carry != 0) {
                int frVal = fr != null ? fr.val : 0;
                int srVal = sr != null ? sr.val : 0;
                int sum = frVal + srVal + carry;

                cursor.next = new ListNode(sum % 10);
                cursor = cursor.next;
                carry = sum / 10;

                if (fr != null) {
                    fr = fr.next;
                }

                if (sr != null) {
                    sr = sr.next;
                }

            }


            return root.next;

        }

    }

}

