package com.ArrayList;
import java.util.ArrayList;

public class arrayListExercise {
	
	//print list of items in ArrayList
	public static void printArrayList(ArrayList<String> grlist)
	{
		for(int i=0;i<grlist.size();i++)
		{
			System.out.println(grlist.get(i));
			
		}
	}
	
	// Modify list of items in ArrayList
	
	public static void modfiyListItem(int pos, String newItem, ArrayList<String> grlist)
	{
		grlist.set(pos, newItem);
		//return grlist;
	}
	
	// Remove list of items in ArrayList
	
	 
	public static void removeListItem(int pos,  ArrayList<String> grlist)
	{
		grlist.remove(pos);
		// return grlist;
	}
	
	// Query List Item to get the Index
	
	public static int scanListItem(String str, ArrayList<String> grlist)
	{
		boolean exists=grlist.contains(str);
		int position=grlist.indexOf(str);
		return position;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> groceries = new ArrayList();
		//ArrayList<int> i = new ArrayList();
		groceries.add("Carrot");
		groceries.add("Beans");
		groceries.add("Peas");
		System.out.println("List of items in the ArrayList");
		printArrayList(groceries);
		System.out.println("List of items in the Modified ArrayList");
		modfiyListItem(1,"Samosa", groceries);
		printArrayList(groceries);
		System.out.println("List of items after removing item in the ArrayList");
		removeListItem(1,groceries);
		printArrayList(groceries);
		int Index= scanListItem("Carrot",groceries);
		System.out.println("Index for Carrot is " +Index);
	}

}
