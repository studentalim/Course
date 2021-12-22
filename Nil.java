public class Nil implements ImmutableList {
   public Nil() {}

   public boolean equals(final Object other) {
      return other instanceof Nil;
   } // equals
   
   public String toString() {
      return "Nil";
   } // toString

   public int hashCode() {
      return 0;
   } // hashCode
   
   public int length() {
      return 0; 
   }
   
   public int sum() {
      return 0;
   }
   
   
   // [1,2].append(3) >> returns [1,2,3]
   // Cons(1, Cons(2, Nil)).append(3) >> returns Cons( 1, Cons(2, Cons(3, Nil)))
   //
   // Other: Con (3, Nil)
   // Head: 1
   // Tail: Cons(2, Nil)
   // This: Cons(1, Cons(2, Nil))
   //
   // Cons(1, Cons(2, Nil)).append(3) <==>
   //  Cons(1, Cons(2, Cons(3, Nil)) <==>
   //   <==> Cons(1, Cons(2, Nil) <==>
   //    <==> Cons(1,Nil)
   public ImmutableList append(final ImmutableList other) {
      return other; //return "to append" list
      //return this; // return empty list
   }
   
   public boolean contains(final int value) {
      return false;
   }
   
} // Nil
    
