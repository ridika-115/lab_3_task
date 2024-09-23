package Source;

public class FizzyPrinter {
    public static int n;
//    public FizzyPrinter()
//    {
//        this.n = n;
//    }

    public static String printFizzy(int n)
    {
        if(n%3==0 && n%5==0 && n%7==0)
        {
            return "FizzBuzzBang";
        }
        else if(n%3==0 && n%5==0)
        {
            return "FizzBuzz";
        }
        else if(n%5==0)
        {
            return "Buzz";
        }
        else if(n%7==0)
        {
            return "Bang";
        }

        else if(n%3==0)
        {
            return "Fizz";
        }
        else
        {
            return "Boom";
        }
    }

    public static void main(String[] args)
    {
        printFizzy(15);
    }
}