import java.util.HashSet;
import java.util.Set;

public class Contain_duplicate {

    public static boolean containsDuplicate(int[] arr) {

        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (s.contains(arr[i])) {
                return true;
            }

            s.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 2, 6};

        if (containsDuplicate(arr)) {
            System.out.println("Duplicate Present");
        } else {
            System.out.println("No Duplicate");
        }
    }
}