package com.aug.oop.exceptions;

/**
 * Created by amanurat on 11/14/14 AD.
 */
public class ExceptionDemo {


    public static void main(String[] args) {

        Long l1;
        try {
//            l1 = new Long("sss");
//            System.out.println(l1);

            Long longResult = createNumber("");
            System.out.println("longResult is : "+ longResult);

        } catch (NumberFormatException e) {
            System.out.println("Cannot create long number!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("OOP!, Cannot parse the number");
            //when has exception will assign l1 to 2
            l1 = 2l;

            System.out.println("l1 is : " + l1);
        } finally {
            System.out.println("Good bye...");
        }
    }

    private static Long createNumber(String str) {

        if (str.equals("")) {
            throw new IllegalArgumentException("parameter should not be empty or null");
        }

        return Long.parseLong(str);
    }

}
