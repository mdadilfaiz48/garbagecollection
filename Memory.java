public class Memory {
    static int count =0;
    public static void main(String[] args){
        for(int i = 0; i<10000000; i++){
            Memory m = new Memory();
            m = null;
        }
    }
    public void finalize(){
        count++;
        System.out.println("finalize method called"+count);
    }
}
