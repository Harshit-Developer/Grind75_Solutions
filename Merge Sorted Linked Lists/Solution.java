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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode output = new ListNode(0);
        ListNode output_temp = output;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                output_temp.next=list1;
                list1=list1.next;
            }
            else{
            output_temp.next=list2;
            list2=list2.next;  
            }
            output_temp = output_temp.next;
        }

        if(list1!=null){
            output_temp.next = list1;
        }


         if(list2!=null){
            output_temp.next = list2;
        }


        return output.next;
    }
}