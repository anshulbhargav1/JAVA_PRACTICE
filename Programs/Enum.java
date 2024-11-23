enum Apple{
    A(500),B(300),C(200);
    private final int price;
    Apple(int price){
        this.price = price;
    }
    public int getInstance(){
        return price;
    }
}

public class Enum {
    public static void main(String[] args){
        System.out.println("A grade price : " + Apple.A.getInstance());
        System.out.println("B grade price : " + Apple.B.getInstance());
        System.out.println("C grade price : " + Apple.C.getInstance());

    }
}



