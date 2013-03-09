
package laba_2p;

public class Laba_2p {

    public static void main(String[] args)
    {
       StringBuffer text =  new StringBuffer ("The original and reference implementation Java compilers, virtual               \n"
            + "machines, and class libraries were developed by Sun from 1991 and first released                  \n"
            + "in 1995. As of May 2007, in compliance with the specifications of the Java                        \n"
            + "Community Process, Sun relicensed most of its Java technologies under the GNU                     \n"
            + "General Public License. ");
       String bufText = "Super ";
 //вывод текста до изменений 
       System.out.println("**************************************************************************************\n" + text);
 //вставить подстроку в определенную позицию 
       int i = 0;
       int pos1;
       while ((pos1 = text.indexOf("ava", i)) != -1) 
       {
            pos1 += 4;
            text.insert(pos1, bufText);
            i = pos1;
       }
 //вывод текста после изменений 
       System.out.println("*************************************************************************************\n" + text);  
    }
}
