package OOP.Phone;

public class Phone {
    String name;
    String brand;
    String price;


    public Phone(){};

    public Phone(String name){

    }
    public Phone(String name, String brand){

    }

    // void : Khong tra ve, khong co return
    // neu dung void thi chi viec goi phuong thuc
    // return : chu y kieu du lieu return
    // neu dung return thi phai in ra
    public int getInfo(){
       return 1 + 1;
    }
    public void sum(){
        System.out.println("1");
    }

}
