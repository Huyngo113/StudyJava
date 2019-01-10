/*
 * tham trị: Sau hàm ko đổi
 * tham biến: Sau hàm thay đổi(mảng, lớp, interface)
 * kq.isNaN: kiểm tra nó có phải chính nó khai báo phải viết hoa chữ cái đầu như dưới.
 */
package Ex.Day5.Slide6;
import java.util.Scanner;
/**
 *
 * @author Ngo Huy
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.print("b = ");
        float b = sc.nextFloat();
        Double kq=MycasioLib.thuong(a, b);
        System.out.println(kq);
        if (!kq.isNaN()){
            System.out.println("aaa");}else {System.out.println("ko dk chia cho 0");}
    }
    
}
