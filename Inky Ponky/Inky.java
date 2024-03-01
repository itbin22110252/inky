public class Inky
{
    
    public static void main(String[] args)

    {
    String pinky="donkey";
    Inky ponky=new Inky(pinky); //Created object call Ponky
    
    String blinky="pinky";
    String rinky="monky";
    Inky ponky2=new Inky(pinky,blinky,rinky); //Created object call Ponky2
    }

public Inky(String pinky)
    {
        System.out.println("\nThe variable of Pinky is "+pinky+".");
        }

public Inky(String pinky,String rinky,String blinky)
    {
        System.out.println("\n"+blinky +" "+ pinky);
        System.out.println(pinky+" " + rinky);
        System.out.println(blinky+" " + pinky+" " +rinky);
        }
}