package com.mycompany.mavenproject3;

public class File1 {

    public static void main(String[] args) {
        String[] names = {
            "Tristan", "Yasmine", "Kevin", "Owen", "Patrick", "Diana", "Victor", "Isabella", "Alexander",
            "Noah", "Abigail", "Rachel", "Samuel", "Zoe", "Charlotte", "Emma", "Matthew", "Alice", "Jasmine",
            "Caleb", "Jacob", "Nathan", "Benjamin", "Thomas", "Madison", "Liam", "Penelope", "Lucas", "Mia",
            "Grace", "Uriel", "Katherine", "Daniel", "Elijah", "Steven", "Xander", "Vanessa", "William",
            "Gabriel", "Hannah", "Quentin", "Sarah", "Sophia", "Isaac"
        };

        BubbleSorting(names);
        Selection(names);
        insertion(names);
    }

    public static void BubbleSorting(String[] names) {

        int n = names.length; //checks the length inside of the array

        boolean swapped; //we put an flag that tells us that if it the condition is true

        for (int i = 0; i < n - 1; i++) {   //this checks each alphabets to correct its position
            swapped = false;    //the condition returns false at the begginer of eaach iteration that checks every iterates.
            for (int j = 0; j < n - 1; j++) {  //this is inside of the loop that checks and reduces each iteration.
                if (names[j].compareTo(names[j + 1]) > 0) {  //we use this to
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                    swapped = true;

                }
            }

            if (!swapped) {
                break;
            }
        }
         System.out.println("-------------------------------");
        System.out.println("Bubble sorted:");
        System.out.println("");
        for (String names1 : names) {

            System.out.println(names1);
        }

    }

    public static void Selection(String[] names) {
        int n = names.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (names[j].compareTo(names[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = names[minIndex];
            names[minIndex] = names[i];
            names[i] = temp;

        }
        System.out.println("-------------------------------");
        System.out.println("Selection sorted:");
        System.out.println("");
        for (String names2 : names) {
            System.out.println(names2);
        }

    }
    
    public static void insertion(String[] names){
        int n = names.length;

        for (int i = 1; i < n; i++) { // Start from the second element
            String key = names[i]; // Store the current element
            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && names[j].compareTo(key) > 0) {
                names[j + 1] = names[j];
                j--;
            }

            // Insert the key into its correct position
            names[j + 1] = key;
        }
         System.out.println("-------------------------------");
        System.out.println("Insertion sorted:  ");
        System.out.println(" ");
        for(String names3 : names){
            System.out.println(names3);
        }
    }

}
