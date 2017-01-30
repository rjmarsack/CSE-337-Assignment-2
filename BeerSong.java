
package beersong;

public class BeerSong {

    public static void main(String[] args) {
        BeerSong beers= new  BeerSong();
        beers.Ninety_Nine_Bottles_of_Beer();
    }
   private void Ninety_Nine_Bottles_of_Beer()
    {
        for(int count =99;count>0;count--)
        {
            int temp=count-1;
            System.out.println(count + " bottles of beer on the wall, "+ count+" bottles of beer\n" +
"take one down,	pass it around,"+ temp +" bottles of beer on the wall.");
        }
               
    }
}
