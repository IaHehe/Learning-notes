package Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by 1 on 2017/4/23.
 */
public class HashMap_demo {
    public HashMap_demo(){
        //创建一个电话簿对象
        HashMap<String,String> phonebook = new HashMap<String,String>();

        Scanner scan = new Scanner(System.in);

        String keyword = new String();

        phonebook = initPhoneBook(phonebook);

        System.out.println("Please input a name that you want to search:");

        keyword = scan.nextLine();

        System.out.println("The result is : "+queryPhone(phonebook,keyword));

        scan.close();
    }

    private static HashMap<String, String> initPhoneBook(HashMap<String, String> phoneBook){

        phoneBook.put("William","13750429765");
        phoneBook.put("Gina","18025693225");
        return phoneBook;
    }

    private static String queryPhone(HashMap<String, String> phoneBook, String keyword){
        String result = new String();
         result = phoneBook.get(keyword);

         if (result==null)
             return "Can't find";
         return result;
    }
}
