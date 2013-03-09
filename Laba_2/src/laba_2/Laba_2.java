package laba_2;

public class Laba_2
{
    public StringBuffer text = new StringBuffer("The original and reference implementation Java compilers, virtual               \n"
            + "machines, and class libraries were developed by Sun from 1991 and first released                  \n"
            + "in 1995. As of May 2007, in compliance with the specifications of the Java                        \n"
            + "Community Process, Sun relicensed most of its Java technologies under the GNU                     \n"
            + "General Public License. ");
    public String textBuf = "Super ";
   
    public void showText() 
    {
        System.out.println(text);
        System.out.println();
    }

    public void insertText()
    {
        int i = 0;
        int pos1;
        while ((pos1 = text.indexOf("ava", i)) != -1) 
        {
            pos1 += 4;
            text.insert(pos1, textBuf);
            i = pos1;
        }
    }
}
