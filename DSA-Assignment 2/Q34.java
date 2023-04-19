/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode h1=head;
        ArrayList<Integer> a=new ArrayList<>();
        if(head==null)
            return head;
        while(h1!=null)
        {
            a.add(h1.val);
            h1=h1.next;
        }
        for(int i=0;i<a.size()-1;i=i+2)
        {
            int t=a.get(i);
            a.set(i,a.get(i+1));
            a.set(i+1,t);
        }
        ListNode n=new ListNode(a.get(0));
        ListNode h=n;
        for(int i=1;i<a.size();i++)
        {
            n.next=new ListNode(a.get(i));
            n=n.next;
        } 
        return h;
    }
}
