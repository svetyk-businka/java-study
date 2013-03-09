
package laba_2;

public class Main
{
    public static void main(String[] args)
    {
     Laba_2 text1 = new Laba_2();
     System.out.printf("Текст до изменений : \n"+
                       "*************************************************"
                       + "***********************************\n" );
     text1.showText();
     text1.insertText(); 
     System.out.printf("Текст после изменений :\n"+
                       "*************************************************"
                       + "***********************************\n" );
     text1.showText();
    } 
}
