public class ArrayRecovery {

    public static int[] decodeArray(int[] modifiedA, int[] originalA) {
        int n = modifiedA.length;
        int[] originalB = new int[n];
        

        for (int i = 0; i < n; i++) {
            int encodedValue = modifiedA[i];
            int encodedN = originalA[i] << (1 << (1 << (1 << 1)));

            originalB[i] = encodedValue & (~encodedN);
        }

        return originalB;
    }

    public static void main(String[] args) {
        int n = 5; 
        int[] modifiedA = {20705, 16642, 24995, 22604, 28918};
        int[] originalA = {8192, 8192, 16384, 24576, 32768};

        int[] recoveredB = decodeArray(modifiedA, originalA);

        // Display the recovered arrays
        System.out.print("Original Array A: ");
        for (int i = 0; i < originalA.length; i++) {
            System.out.print(originalA[i] + " ");
        }
        System.out.println();

        System.out.print("Recovered Array B: ");
        for (int i = 0; i < recoveredB.length; i++) {
            System.out.print(recoveredB[i] + " ");
        }
        System.out.println();
    }
}
