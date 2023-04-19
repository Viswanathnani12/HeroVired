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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<lists.length;i++)
        {
            while(lists[i]!=null)
            {
                a.add(lists[i].val);
                lists[i]=lists[i].next;
            }
            
        }
        Collections.sort(a);
        if(a.size()==0)
        {
            ListNode ans=new ListNode();
            return ans.next;
        }
        ListNode ans=new ListNode(a.get(0));
        ListNode h=ans;
        for(int i=1;i<a.size();i++)
        {
            ans.next=new ListNode(a.get(i));
            ans=ans.next;
        }
        return h;
    }
}
