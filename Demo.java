public class Demo {
    public static void main(String[] args){
//     String s = new String("adil");  //String class has finalized method so here call only main method.
       Demo s = new Demo();  // here call finalize method
        s = null; // eligible for garbage collector.
        System.gc();
        System.out.println("end of main");
    }
    public void finalize(){
        System.out.println("finalize method call");
    }
}
