public class CountNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        countEven(array);
        countOdd(array);
        int[] primeArray = {1, 2, 3, 101, 171, 73, 87};
        countPrime(primeArray);
        int[] myArray = changeEven(primeArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
    }

    public static void countEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) { //num is even
                count++;
            }
        }
        System.out.println(count);
    }

    public static void countOdd(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
            } else {
                count++;
            }


        }
        System.out.println(count);
    }

    public static void countPrime(int[] arr) {
        int count = 0;
        for (int num : arr) {
            int n = num / 2;
            int noOfFactors = 0;
            for (int i = 1; i < n; i++)
                if (n % i == 0) {
                    noOfFactors++;
                }
            if (noOfFactors > 2) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static int[] changeEven(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        return arr;
    }
}

