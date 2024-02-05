package exam.ticket11;



class LinkedIntList {
    ListNode first;
    public void firstLast() {
        if (first == null || first.next == null) {
            return;
        }

        ListNode last = first;
        while (last.next != null) {
            last = last.next;
        }

        last.next = first;
        first = first.next;
        last.next.next = null;
    }

    public void printList() {
        ListNode current = first;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.first = new ListNode(10);
        list.first.next = new ListNode(11);
        list.first.next.next = new ListNode(12);
        list.first.next.next.next = new ListNode(13);
        list.printList();
        list.firstLast();
        list.printList();

    }
}
