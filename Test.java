import java.util.Arrays;
import java.util.HashSet;

public class Test {

    static void printUniqueHeightMethod1(int arr[])
    {
        if (arr.length > 50)
        {
            System.out.println("Not Supported");
        }
        else{
            HashSet<Integer> heightSet = new HashSet<>();
            boolean negFlag = false;

            for (int i=0; i<arr.length; i++)
            {   if(arr[i] <=0) {
                System.out.println("Not Supported");
                negFlag = true;
                break;

            }
                if (!heightSet.contains(arr[i]))
                {
                    heightSet.add(arr[i]);
                }
            }
            if(!negFlag)
                System.out.println(heightSet.size());
        }

    }

    static void printUniqueHeightMethod2(int arr[])
    {
        if (arr.length > 50)
        {
            System.out.println("Not Supported");
        }
        else
        {
            Arrays.sort(arr);
            boolean negFlag = false;
            int count = 0;
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i] <=0) {
                    System.out.println("Not Supported");
                    negFlag = true;
                    break;

                }
                count ++;
                while (i < arr.length - 1 && arr[i] == arr[i + 1])
                    i++;
            }
            if(!negFlag)
                System.out.println(count);
        }

    }

    public static void main (String[] args)
    {
        //Solution by two method one by sorting & second one by hashset
        int arr[] = {8,7,7,5,3,8,8,3,5,3,7};
        //8,7,5,3
        printUniqueHeightMethod1(arr);
        printUniqueHeightMethod2(arr);
        int arr1[] = {10,13,15,18,15,16};
        //10,13,15,18,16
        printUniqueHeightMethod1(arr1);
        printUniqueHeightMethod2(arr1);
    }
}
