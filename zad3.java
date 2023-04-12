package JAVAHW5;

public class zad3 {
    
    public static int[] sort(int[] arr) {
        int n = arr.length;
        // Строим кучу, поднимаем след.эл.за базой вверх
        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(arr, n, i);
            //System.out.printf((arr[i] + " "));
        }
        //System.out.println();
        // Перемещаем базу в конец
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //System.out.println(arr[i]);
            // Повторяем на уменьшеном массиве
            heap(arr, i, 0);
            //System.out.println("после рекурсии");
            //System.out.println(arr[i]);
        }
        return arr;
    }

    //  Создание кучи поддерева с корнем в узле i
    public static int [] heap(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int exch = arr[i];
            arr[i] = arr[largest];
            arr[largest] = exch;

            heap(arr, n, largest);
        }
        return arr;
    }
        public static void main(String[] args) {
            int[] lst = new int[]{3, 4, 2, 1};
            for (int s: lst) {
                System.out.printf(s + "  ");
            }
            System.out.println();
            for (int m: sort(lst)) {
                System.out.printf(m + "  ");
            }
        }
    }
