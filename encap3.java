class employe {
    private int id;
    private String name;
    private int salary;

    public void setid(int id){
        this.id=id;
    }
    public int getid(){
        return id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setsalary(int salary) {
        this.salary = salary;
    }

    public int getsalary() {
        return salary;
    }
}

public class encap3 {
    public static void main(String[] args) {
        employe obj = new employe();
        employe obj1 = new employe();
        obj.setid(7899);
        System.out.println(obj.getid());
        obj1.setName("radhika");
        System.out.println(obj1.getName());
        obj1.setsalary(46738);
        System.out.println(obj1.getsalary());

    }
}
