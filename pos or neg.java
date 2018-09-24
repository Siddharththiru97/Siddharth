
public static void main(String[] args)
 {
 int number;
 Scanner s=new Scanner(System.in);
 number=s.nextInt();
        if(number > 0)
        {
            System.out.println(" Positive");
        }
        else if(number < 0)
        {
            System.out.println(" Negative ");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
	
