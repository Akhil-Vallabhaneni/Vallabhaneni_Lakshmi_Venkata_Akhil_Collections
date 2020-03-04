package com.epaam.collections;

public class Main 
{
    public static void main( String[] args )
    {
    	DataList<Integer> list = new DataList<>();
    	 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println("intial list is "+list);
         
        //Remove elements from index
        list.remove(2);
        System.out.println("list after removing index 2 is "+list);
         
        //Get element with index
        System.out.println( "element at index zero is "+ list.get(0) );
        System.out.println( "element at index one is "+ list.get(1) );
 
        //List Size
        System.out.println("length of list after removing an element is "+list.size());

    }
}
