class rectangle{
    private double length;
    private double width;
    public void setlength(float length){
        this.length =length;
    }

    public void setwidth(float width){
        this.width =width;
    }
    public double getarea(){            
        return length*width;
    }
    public double getperimeter(){
        return 2*(length+width);
    }
}
public class encaps5 {
    public static void main(String[] args) {
        rectangle obj = new rectangle();
        obj.setlength(8);       
        obj.setwidth(4);
        System.out.println(obj.getarea());
        System.out.println(obj.getperimeter());

        
    }
    
}
