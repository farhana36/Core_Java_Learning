package breakcase;
//Understand concept of break
public class break_wolabel {
    public static void main(String[] args) {
        for(int i =1; i<=10; i++)
        {
            if (i==8)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("End of Break");
    }
}
