public class SingleLinkedListDemo1 
{ 
Node head; 
int size; 
class Node{ 
int data; 
Node next; 
Node(int data){ 
this.data = data; 
this.next = null; 
size++; 
}  
 
Node(int data,Node temp){ 
this.data = data; 
this.next = temp; 
size++; 
} 
} 
int getSize(){ 
return this.size; 
} 
void printList(){ 
if(head==null){ 
System.out.println("list is empty"); 
} 
else 
{ 
Node currNode = head; 
while(currNode!=null) 
{ 
System.out.print(currNode.data+" => "); 
currNode = currNode.next; 
} 
System.out.println("null"); 
} 
} 
void addLast(int data) 
{ 
Node newNode = new Node(data); 
if(head==null) 
{ 
head = newNode; 
return; 
} 
else 

 
{ 
Node currNode = head; 
while(currNode.next!=null) 
{ 
currNode = currNode.next; 
} 
currNode.next = newNode; 
} 
} 
void deleteFirst(){ 
if(head==null) 
{ 
System.out.println("List is empty"); 
return; 
} 
else 
{ 
size--; 
head=head.next; 
} 
} 
void deleteLast() 
{ 
if(head==null){ 
System.out.println("list is empty"); 
return; 
} 
else if(head.next==null) 
{ 
head=null; 
return; 
} 
else 
 

{ 
size--; 
Node temp1=head,temp2=head.next; 
while(temp2.next!=null) 
{ 
temp2 = temp2.next; 
temp1 = temp1.next; 
} 
temp1.next = null; 
} 
} 
//by using this method we delete first match element. 
void deleteElement(int data) 
{ 
Node temp = head; 
if(temp==null){ 
System.out.println("empty"); 
return; 
} 
else if(temp.data == data){ 
head = head.next; 
size--; 
return; 
} 
while(temp.next!=null) 
{ 
if(temp.next.data == data){ 
temp.next = temp.next.next; 
size--; 
return; 
} 
else 
{ 
 
temp = temp.next; 
} 
} 
} 
//by using this method we all mathch element. 
void deleteElements(int data) 
{ 
Node temp = head; 
if(temp==null) 
{ 
System.out.println("empty"); 
return; 
} 
else if(temp.data == data) 
{ 
head = head.next; 
size--; 
} 
else 
{ 
while(temp.next!=null){ 
if(temp.next.data == data) 
{ 
temp.next = temp.next.next; 
size--; 
} 
else if(temp.next!=null) 
{ 
temp = temp.next; 
} 
} 
} 
} 
//delete element at particular position 
void deleteElementAtPos(int pos){ 
Node temp = head; 
int i=0; 
if(temp==null){ 
System.out.println("empty"); 
return; 
} 
else if(pos==0){ 
head = head.next; 
size--; 
return; 
} 
else 
{ 
while(temp.next!=null && i<pos){ 
if(i==pos-1) 
{ 
temp.next = temp.next.next; 
size--; 
return; 
} 
i++; 
temp = temp.next; 
} 
} 
} 
public static void main(String[] args) 
{ 
SingleLinkedListDemo1 slld=new SingleLinkedListDemo1(); 
slld.addLast(121); 
slld.addLast(122); 
slld.addLast(123); 
 
slld.addLast(125); 
slld.addLast(125); 
slld.addLast(125); 
slld.addLast(126); 
slld.printList(); 
System.out.println("Size= "+slld.getSize()); 
slld.deleteFirst(); 
slld.printList(); 
System.out.println("Size= "+slld.getSize()); 
slld.deleteLast(); 
slld.printList(); 
System.out.println("Size= "+slld.getSize()); 
slld.deleteElement(125); 
slld.printList(); 
System.out.println("Size= "+slld.getSize()); 
slld.deleteElements(125); 
slld.printList(); 
System.out.println("Size= "+slld.getSize()); 
slld.deleteElementAtPos(1); 
slld.printList(); 
System.out.println("Size= "+slld.getSize()); 
} 
} 
