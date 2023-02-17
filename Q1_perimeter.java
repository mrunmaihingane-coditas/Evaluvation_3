class Rectangle{

    Rectangle(int l, int b){

    }

}
class calculation extends Rectangle{
    calculation(int l, int b) {
        super(l, b);
        System.out.println("Perimeter: "+ 2*(l*b));
        System.out.println("area: " + l*b);
    }


}




public class Q1_perimeter {
    public static void main(String[] args) {
               Rectangle rectangle = new calculation(1,4);

    }
}
//Perimeter: 8
//area: 4
//
//Process finished with exit code 0