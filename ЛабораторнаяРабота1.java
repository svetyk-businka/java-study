package лабораторная.работа.pkg1;
import java.lang.Math;

public class ЛабораторнаяРабота1 {

    public short twoD[][];
    
    public static void main(String[] args) 
    {
        ЛабораторнаяРабота1 laba = new ЛабораторнаяРабота1();
        laba.ShowDeveloperName();
        laba.InitArray(5,5);
        laba.ShowArray();
        laba.SortArray((int)laba.GetRandomValue()%laba.twoD.length);
        laba.ShowArray();
    }
    
    public void ShowDeveloperName()
    {
        System.out.println("Developer: Antipenko S.I.");
    }
    
    private double GetRandomValue()
    {
        double randomValue=0;
        randomValue= Math.random() * 100;    
        return randomValue;
    }
    
    public void InitArray(int sizeX,int sizeY)
    {
        twoD = new short [sizeX][sizeY];
        
        // initialization with values
        for (int i = 0; i < twoD.length; i++)
        {
            for (int j = 0; j < twoD[i].length; j++)
            {
                twoD[i][j] = (short) GetRandomValue();
            }
        }
    }   
    
    public void ShowArray()
    {
        System.out.println(" Array :");
        for (int i = 0; i < twoD.length; i++)
        {
            for (int j = 0; j < twoD[i].length; j++)
            {
                System.out.print(twoD[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void SortArray(int k)
    {
        System.out.println("\nColumn = " + k + "\n");
        
        for (int m = 0; m < twoD.length; m++)
        {
            for (int i = 0; i < twoD.length-1; i++)
            {          
				if(twoD[i][k]> twoD[i+1][k])
				{  
					for(int j = 0; j < twoD.length; j++ )
					{    
						short buf= twoD[i][j];
						twoD[i][j]=twoD[i+1][j];
						twoD[i+1][j]=buf;
					 }    
				}
            }
        }  
    }
}





