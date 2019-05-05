package com.company;

public class Main {

    public static void bubbleSort(int arrnum[]) {

        int n = arrnum.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrnum[j] > arrnum[j + 1]) {

                    int temp = arrnum[j];
                    arrnum[j] = arrnum[j + 1];
                    arrnum[j + 1] = temp;

                }
            }
        }
    }
        public static void main(String[] args) {

        int arrnum[]={4,34,56,7,6};

        int n = arrnum.length;
            System.out.println("Before sort");
            for (int i = 0; i < n ; i++) {
                System.out.println(arrnum[i]+" ");

            }
            System.out.println();

            System.out.println("After sort");
            bubbleSort(arrnum);


            for (int i = 0; i < n ; i++) {
                System.out.println(arrnum[i]+" ");

             }
            }

    }
