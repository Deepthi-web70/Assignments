package Assignment3;

public class BinarySearchRecursive {
    static int search(int arr[], int low, int high, int key){

        if(low <= high){

            int mid = (low+high)/2;

            if(arr[mid] == key)
                return mid;

            if(arr[mid] < key)
                return search(arr, mid+1, high, key);

            return search(arr, low, mid-1, key);
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,3,5,7,9};

        int result = search(arr,0,arr.length-1,7);

        System.out.println("Index = " + result);
    }
}
