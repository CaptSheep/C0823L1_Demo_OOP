package OOP.Phone;

public class Phone {
    public static String name ;
    public static String brand;
    public void  Phone(){};
    public void  Phone(String name, String brand){
       this.name = name;
       this.brand = brand;
   };

    public static String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void getInfo(){
       System.out.println("This is a phone");
   }
}
