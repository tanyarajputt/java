class book{
    void read(){
        System.out.println("read book");
    }
}
class novel extends book{
    void storyline(){
        System.out.println("storyline");
    }
}
public class single1 {
    public static void main(String[] args) {
        novel obj=new novel();
        obj.read();
        obj.storyline();
    }
    
}
