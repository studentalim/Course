public class Cons implements ImmutableList {
   // ---BEGIN INSTANCE VARIABLES---
   public final int head;
   public final ImmutableList tail;
   // ---END INSTANCE VARIABLES---

   public Cons(final int head, final ImmutableList tail) {
      this.head = head;
      this.tail = tail;
   } // Cons

   public boolean equals(final Object other) {
      if (other instanceof Cons) {
         final Cons otherCons = (Cons)other;
         return head == otherCons.head && tail.equals(otherCons.tail);
      } else {
         return false;
      }
   } // equals
   
   public String toString() {
      return "Cons(" + head + ", " + tail.toString() + ")";
   } // toString

   public int hashCode() {
      return sum();
   } // hashCode
   
   public int length() {
      int restofthelist = tail.length();
      return restofthelist + 1;
   }
   
   public int sum() {
      int headoflist = head;
      int tailoflist = tail.sum();
      int sumoflist = headoflist + tailoflist;
      return sumoflist;
   }
   
   // [1,2].append(3) >> returns [1,2,3]
   // Cons(1, Cons(2, Nil)).append(3) >> returns Cons( 1, Cons(2, Cons(3, Nil)))
   //
   // Other: Cons(3, Nil)
   // Head: 1
   // Tail: Cons(2, Nil)
   // This: Cons(1, Cons(2, Nil))
   //
   // Cons(1, Cons(2, Nil)).append(3) <==>
   //  Cons(1, Cons(2, Cons(3, Nil)) <==>
   //   <==> Cons(1, Cons(2, Nil) <==>
   //    <==> Cons(1,Nil)
   public ImmutableList append(final ImmutableList other) {
      ImmutableList newTail = tail.append(other);
      return new Cons(head, newTail);
      // can be used also
      //return new Cons(head, tail.append(other));
     
   }
   
   public boolean contains(final int value) {
      /* if (head == value){
         return true;
      }else if(tail == null){
         return false;
      }
      return tail.contains(value);
      return equal(value);
      return true; */
      return head == value || tail.contains(value);
   }
   
} // Cons
