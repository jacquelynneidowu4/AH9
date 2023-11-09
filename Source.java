/*class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }*/

  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
        if(head==null)return null;
      // todo
        Node<T>prev=null;
        Node<T>next=null;
        Node<T>curr=head;


        while(curr!=null){
            //keep track of next because once you change curr's next pointer, you will
            //no longer have access to it's previous next pointer
            next=curr.next;
            //in order to reverse, point curr's next pointer in the apposite direction
            curr.next=prev;
            //prev is now equal to curr so we can keep appending from the opposite end
            prev=curr;
            //curr is not equal to next so that we can keep reversing
            curr=next;

        }
      return prev;
    }
      public static <T> boolean isUnivalueList(Node<T> head, T val) {
        if(head==null)return false;
       // if(head.val!=val)return false;

          // todo
            Node<T> ptr=head;

          while(ptr!=null){
              if(ptr.val!=val)return false;
              ptr=ptr.next;
          }
          return true;
      }
      public static <T> boolean isUnivalueListRecursive(Node<T> head, T val) {

        //here are the base cases
          //if head is null, there is no list
          if(head==null)return false;
          //this case allows us to decide whether we keep going or not
          if(head.val!=val)return false;
          //once we reach the end of the list, the condition is satisfied if we
          //are on the last node with matching value
          //are on the last node with matching value
          if(head.val==val && head.next==null)return true;

          return isUnivalueList(head.next, val);

          // todo

      }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y

        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;
    
       // reverseList(x); // y -> x

        // Printing solution
        Node<String> head = Source.reverseList(a);
        System.out.println(isUnivalueList(head, "y"));
        System.out.println(isUnivalueListRecursive(head, "x"));

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;            
        }
    }
  }