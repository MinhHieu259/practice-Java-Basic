
import java.util.Scanner;

public class PTBac2 {
    public static void ptbac2(double a, double b, double c)
    {
        if(a==0)
            if(b==0 && c==0)
                System.out.println("Phương trình có vô số nghiệm");
        else
                if(b==0 && c!=0)
                    System.out.println("Phương trình vô nghiệm");
        else
                    System.out.println("Phương trình có nghiệm:"+(-c/b));
        else
        {
            double delta=b*b-4*a*c;
            if(delta<0)
            {
                System.out.println("Phương trình vô nghiệm");
            }
            else 
                if(delta==0)
                {
                    System.out.println("Phương trình có nghiệm kép:x1=x2="+(-b/2*a));
                }
            else
                {
                    double x1=(-b-Math.sqrt(delta))/(2*a);
                    double x2=(-b+Math.sqrt(delta))/(2*a);
                    System.out.println("Phương trình có 2 nghiệm phân biệt:x1="+x1+" và x2="+x2);
                }
        }
    }
    public static void main(String[] args) {
        do
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập hệ số a:");
        double a=sc.nextDouble();
        System.out.println("Nhập hệ số b:");
        double b=sc.nextDouble();
        System.out.println("Nhập hệ số c:");
        double c=sc.nextDouble();
        ptbac2(a,b,c);
            System.out.println("Bạn có muốn làm tiếp không ? (c/k)");
            String line=new Scanner(System.in).nextLine();
            if(line.equalsIgnoreCase("k"))
                break;
        }
        while(true);
        System.out.println("Cảm ơn bạn đã sử dụng phần mềm!!!");
    }
}
