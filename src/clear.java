import java.util.*;
import java.util.Scanner;
public class clear {
    public static void main(String[] args) {
        String[] arr={"10","4","6","7","8","6","0","0","0","0"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number : ");
        String number = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(number)){
                System.out.println("Position of the number in the list : " +number+ " is "+(i+1));
                System.out.println("Array :\n"+Arrays.toString(arr));
                List<String> testList = new ArrayList<>(Arrays.asList(arr));
                testList.remove(number);
                testList.add(arr.length-1,"0");
                System.out.println("Clear number for ArrayList:\n"+ testList);
                arr = testList.toArray(new String[0]);
                System.out.println("Result :\n"+Arrays.toString(arr));
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Not found "+number+" in the list");
        }
    }
}


