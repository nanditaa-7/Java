package runner;

import things.Bookinformation;

public class BookInformationRunner {
    public static void main(String[]args){
       Bookinformation bookinformation= new Bookinformation();
       System.out.println(bookinformation);
       bookinformation.bookName="Core Java";
       bookinformation.author="Robin Hood";
       bookinformation.price= 250.24;
       bookinformation.noOfPages=550;

       System.out.println("Book Name:"+bookinformation.bookName);
       System.out.println("Author:"+bookinformation.author);
       System.out.println("Price:"+bookinformation.price);
       System.out.println("No Of Pages:"+bookinformation.noOfPages);

    }
}
