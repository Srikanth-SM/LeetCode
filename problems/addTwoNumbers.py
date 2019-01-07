# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        total=head=tail=None
        carry=0
        
        if l1 and not l2:
                total=l1
        elif l2 and not l1:
            total=l2
        else:
            sum=0
            while True:
                if l1:
                    sum+=l1.val
                    l1=l1.next
                if l2:
                    sum+=l2.val
                    l2=l2.next
                
                sum=(sum+carry)
                # print s
                carry=(sum)/10
                sum=sum%10
                print sum,carry
                
                if tail==None:
                    head=tail=total=ListNode(sum)
                else:
                    tail.next=ListNode(sum)
                    tail=tail.next
                sum=0
                if l1==None and l2==None and carry==0:
                    break
               
                
        return total
                
                
                
            
            
            
                
            
        
