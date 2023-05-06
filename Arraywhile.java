




class Arraywhile
{
      public static void main(String Arg[])
    {
    
      Scanner sobj = new Scanner(System.in);
      int iSize = sobj.nextInt();

      int Arr[] = new int [iSize];
      
      System.out.println("Enter the elements:");
      
      int iCnt = 0;
      while(iCnt < iSize)
      {
        Arr[iCnt] = sobj.nextInt();
      }
       
       
       System.out.println("Elements of array are: ");
       
       while(iCnt < iSize)
      {
        System.out.println(Arr[iCnt]);
        iCnt++;
      }

    }

}