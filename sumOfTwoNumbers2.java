import java.util.Scanner;
public class sumOfTwoNumbers2
  {
    int x, y, z;
    void insert(int a, int b)
      {
        x = a;
        y = b;
      }
    void addition()
      {
        z = x+y;
        System.out.println(z);
      }
      public static void main(String[] args)
        {
          int x, y;
          Scanner obj = new Scanner(System.in);
          x = obj.nextInt();
          y = obj.nextInt();
          sumOfTwoNumbers2 obja = new sumOfTwoNumbers2();
          obja.insert(x, y);
          obja.addition();
        }
  }
