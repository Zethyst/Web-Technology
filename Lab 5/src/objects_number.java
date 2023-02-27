public class objects_number{

    static int count;
  
    objects_number() {
      count++;
    }
  
    public static void main(String args[]) {
      objects_number ob1 = new objects_number();
      objects_number ob2 = new objects_number();
      objects_number ob3 = new objects_number();
      System.out.println("Number of objects created is "+count);
    }
  }