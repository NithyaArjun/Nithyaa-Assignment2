package com.coderscampus;

import java.util.Scanner;

public class GameTest {
	
	
	
	public void game(int randomnumber,int guessnumber ,int i) {
			if(i<=4) {
				if(randomnumber == guessnumber)
				{
					System.out.println("You win");
					return;
				}
				else if(guessnumber > randomnumber) {
					System.out.println("Please pick a lower number"); 
				}
				else if(guessnumber < randomnumber) {
					System.out.println("Please pick a higher number");
				}
			}
			 if((i==4) && (randomnumber != guessnumber)) {
				System.out.println("You lose the number to guess was  " +randomnumber +" the  actual number");
				}
	}
}
