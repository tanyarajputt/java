class device{
    void poweron(){
        System.out.println("power on");
    }
}
class laptop extends device{
    void boot(){
        System.out.println("onnnn");
    }
}
class gaminglaptop extends laptop{
    void startgame(){
        System.out.println("start game");
    }
}
public class multiinhari1 {
    public static void main(String[] args) {
        device obj=new device();
        obj.poweron();
        laptop obj1=new laptop();
        obj1.boot();
        obj1.poweron();
        gaminglaptop obj2=new gaminglaptop();
        obj2.poweron();
        obj2.boot();
        obj2.startgame();
    }
    
}
