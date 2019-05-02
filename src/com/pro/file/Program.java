package src.com.pro.file;

import src.com.pro.file.util.ArrayHelper;
import src.com.pro.file.util.DataList;
import src.com.pro.file.entity.Student;

public class Program{
    public static void main(String[] args){
        
        ArrayHelper arr=new ArrayHelper();
        arr.add(23);
        arr.add(45);
        arr.add(21);
        arr.add(32);
        arr.add(78);
        arr.add(89);

        arr.bubbleSort();
        int find=100;
        int low=0;
        int high=arr.size()-1;
        boolean found=false;

        System.out.println(arr.binarySearch(find));
        
    }
}
