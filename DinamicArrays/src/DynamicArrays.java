public class DynamicArrays {
    public static void main(String[] args) {
        AdvancedArrays advancedArrays = new AdvancedArrays();
        advancedArrays.setArray(advancedArrays.array);
        advancedArrays.createArray(0);
        advancedArrays.add(1);
        advancedArrays.add(2);
        advancedArrays.add(1);
        advancedArrays.add(3);
        advancedArrays.add(1);
        advancedArrays.printArray();
        System.out.println("\nItems of intArray:");
        for (int i = 0; i < advancedArrays.size;) {
            System.out.print(advancedArrays.array.length + " ");
            System.out.println("\nSize of the intArray: " + advancedArrays.size);
            break;
        }
        advancedArrays.remove(1);

        System.out.println("\nItems after removing the element");

        for (int i = 0; i < advancedArrays.array.length; i++) {
            System.out.print(advancedArrays.array[i] + " ");
        }
        System.out.println("\nSize of the intArray: " + advancedArrays.size);
        System.out.println();




    }

}
