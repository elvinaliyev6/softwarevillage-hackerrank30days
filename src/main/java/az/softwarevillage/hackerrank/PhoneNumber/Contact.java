package az.softwarevillage.hackerrank.PhoneNumber;

import java.util.HashMap;
import java.util.Scanner;

public class Contact {
    public static void main(String []argh)
    {

        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phoneBook=new HashMap<>();
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name,phone);
        }
        while(in.hasNext())
        {
            String query=in.nextLine();

            if (phoneBook.containsKey(query)) {
                System.out.println(query + " " + phoneBook.get(query));
            }else {
                System.out.println("Tapilmadi");

            }
        }
    }
}




