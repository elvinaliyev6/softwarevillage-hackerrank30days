package az.softwarevillage.hackerrank.task;

import java.util.*;

public class CommonElementsFinder {

    public static void main(String[] args) {
        // 2 List'in ortaq elementlerinin tapilmasi
        Scanner scan = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        //List 1'in olcusu teyin edilir
        System.out.println("Enter the size of the first List:");
        int list1Size = scan.nextInt();
        //List 1'e elementler elave edilir
        System.out.println("Add the elements of the first List:");
        for (int i = 0; i < list1Size; i++) {
            list1.add(scan.nextInt());
        }

        List<Integer> list2 = new ArrayList<>();
        //List 2'nin olcusu teyin edilir
        System.out.println("Enter the size of the second List:");
        int list2Size = scan.nextInt();
        //List 2'ye elementler daxil edilir
        System.out.println("Add the elements of the second List:");
        for (int i = 0; i < list2Size; i++) {
            list2.add(scan.nextInt());
        }

        //list1'i Set'e ceviririk. Bu, her bir elementin yalnız bir defe saxlanmasini temin edir
        Set<Integer> set1 = new HashSet<>(list1);
        //Set istifade ederek yalniz unikal ortaq elementler saxlanilir
        Set<Integer> set = new HashSet<>();

        //set1'in (yeni list1'in) elementi list2'deki elementle eyni olarsa Set'e elave edilir
        for (Integer list : list2) {
            if (set1.contains(list)) {
                set.add(list);
            }
        }

        //eger hec bir element eyni deyilse uygun mesaj cap edilir
        // eks halda ortaq elementler cap edilir
        if (set.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Same elements in List 1 and List 2: " + set);
        }

    }

}
