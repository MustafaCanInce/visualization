import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class person {
    static person ov = new person();
    public static void main(String []args){

        int arr[] = { 9, 8, 7, 6, 5, 1, 10, 4, 2, 3};
        ov.bubbleSort(arr,true);
        //ov.Print(arr);
        try{
            File myObj = new File("output.txt");
            FileWriter myWriter = new FileWriter("output.txt");

        }catch (IOException e){
            System.out.println("an error occurred.");
            e.printStackTrace();
        }
        for(int i = 0;i < arr.length;i++)
            System.out.println("arr[i] "+arr[i]);
    }
    void Print(int []arr){
        for (int i = 0;i < arr.length;i++){
            int x = 0;
            while (x != arr[i]){
                x++;
            }
            if (x == arr[i]){
                System.out.print(arr[i] +"|");
                while(x > 0){

                    System.out.print("*");
                    x--;
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    void bubbleSort(int arr[],boolean traverse) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                BubbleSort ob = new BubbleSort();
                //ob.printArray( arr);

                /*int nh = 0;
                while (arr[nh + 1] < arr[nh]){
                    if (nh + 1 == arr.length){
                        break;
                    }
                    nh++;
                }
                while (arr[nh + 1] > arr[nh]){
                    if (nh + 1 == arr.length){
                        break;
                    }
                    nh++;
                }*/
                if (!traverse){

                    ov.Print(arr);
                    if (arr[j] > arr[j + 1]) {
                        // swap arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                if (traverse){


                    ov.Print(arr);
                    if (arr[j] < arr[j + 1]) {
                        // swap arr[j+1] and arr[j]
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

}




