import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("How much people are in the room?");
	int inRoom = sc.nextInt();
	System.out.println("How much people are waiting in the queue?");
	int inQueue = sc.nextInt();
	
	int freeSpace = 100-inRoom;
	int cant = inQueue-freeSpace;
	String postfix = cant ==1 ? "quest" : "guests";
	
	if (inQueue <= freeSpace){
	System.out.println("All waiting quests can fit in the room.");
	} else System.out.println("Can`t fit "+ cant + " " + postfix);
	
	}
 }