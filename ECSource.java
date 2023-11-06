class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head, String value) {
    if (head == null) {
      return true;
    }
    if (head.val != value) {
      return false;
    }
    return isUnivalueList(head.next, value);
  }

  public static void main(String[] args) {
        Node<String> z = new Node<>("z");
        // z

        // Printing solution
        System.out.println((ECSource.isUnivalueList(z, z.val)));
    }
}
