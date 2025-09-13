public class FinalizeDemo {

    static  FinalizeDemo s;

    public static void main(String[] args) throws InterruptedException {
        FinalizeDemo f = new FinalizeDemo();
        System.out.println(f.hashCode());
        f = null;// one object eligible for garbage collector.
        System.gc();
        Thread.sleep(5000);
        System.out.println(s.hashCode());
        s = null;// two object eligible for garbage collector.
        System.gc();
        Thread.sleep(10000);
        System.out.println("end of main");
    }
    public void finalize(){
        System.out.println("finalize method called");// here finalize method call only one time but clean two object.
        s = this;
    }
}
