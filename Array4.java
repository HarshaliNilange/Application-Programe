
class Array4
{

    public static void main(String Arg[])
    {
    
      Scanner sobj = new Scanner(System.in);
      int iSize = sobj.nextInt();

      int Arr[] = new int [iSize];
      
      System.out.println("Enter the elements:");
      int iCnt = 0;
            //1        //2           //3
      for(iCnt =0; iCnt < iSize; iCnt++)
      {
        
        Arr[iCnt] = sobj.nextInt(); //4

      }
      
      System.out.println("Elements of array are: ");
      
      for(iCnt =0; iCnt < iSize; iCnt++)
      {
        System.out.println(Arr[iCnt]);
      }

    
    }

}