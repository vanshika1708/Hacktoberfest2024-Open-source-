
 struct ListNode {
int val;
 ListNode *next;
 ListNode() : val(0), next(nullptr) {}
   ListNode(int x) : val(x), next(nullptr) {}
     ListNode(int x, ListNode *next) : val(x), next(next) {}
 }
 
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        // Create a dummy node to act as the start of the merged list
        ListNode* dummy = new ListNode();
        ListNode* current = dummy;

        // Traverse both lists
        while (list1 != nullptr && list2 != nullptr) {
            if (list1->val <= list2->val) {
                current->next = list1;
                list1 = list1->next;
            } else {
                current->next = list2;
                list2 = list2->next;
            }
            current = current->next;
        }

        // If one of the lists is not yet exhausted, append the rest of it
        if (list1 != nullptr) {
            current->next = list1;
        } else if (list2 != nullptr) {
            current->next = list2;
        }

        // Return the merged list, which starts at dummy->next
        return dummy->next;
    }
};
