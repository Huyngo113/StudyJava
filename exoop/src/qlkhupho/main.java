/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkhupho;

import java.util.Scanner;
import static qlkhupho.khupho.dsHoDan;

/**
 *Để quản lý các hộ dân trong một khu phố, người ta quản lý các thông tin như sau:
- Với mỗi hộ dân, có các thuộc tính:
+ Số thành viên trong hộ ( số người)
+ Số nhà của hộ dân đó. ( Số nhà được gắn cho mỗi hộ dân)
+ Thông tin về mỗi cá nhân trong hộ gia đình.
- Với mỗi cá nhân, người ta quản lý các thông tin như: họ và tên, ngày  sinh, nghề nghiệp.
* Yêu cầu:
1. Hãy xây dựng lớp Nguoi để quản lý thông tin về mỗi cá nhân.
2. Xây dựng lớp KhuPho để quản lý thông tin về các hộ gia đình.
3. Viết các phương thức nhập, hiển thị thông tin cho mỗi cá nhân.
4. Cài đặt chương trình thực hiện các công việc sau:
- Nhập vào một dãy gồm n hộ dân (n - nhập từ bàn phím).
- Hiển thị ra màn hình thông tin về các hộ trong khu phố năm nay có người mừng thượng thọ (80 tuổi)
 * @author Ngo Huy
 */
public class main {
    public static void main(String[] args) {
        khupho ql = new khupho();
        Scanner sc = new Scanner(System.in);
        ql.nhapHoDan();
        System.out.println("Nhap nam mung tho: ");
        int nam=sc.nextInt();
        ql.mungTho(nam);
    }

}
