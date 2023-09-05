package com.finzly.reservations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EndUser {
	
	private List<Room> availableRooms;
	private List<Reservation> reservations;
	private Map<Guest, List<String>> guestReservationTypes;
	
	public EndUser() {
		availableRooms=new ArrayList<>();
		reservations=new ArrayList<>();
		guestReservationTypes=new HashMap<>();
	}

	public void addRoom(Room room) {
		availableRooms.add(room);
	}
	
	public boolean isRoomAvailable(Room room, String date) {
		for(Reservation reservation:reservations) {
			if(((RoomReservation) reservation).getRoom()==room && reservation.getReservationDate().equals(date)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean bookRoom(Guest guest, Room room,String date) throws RoomNotFoundException,InvalidReservationException{
		
		if(!availableRooms.contains(room)) {
			throw new RoomNotFoundException("Room does not exist");
		}
		if(!isRoomAvailable(room, date)) {
			throw new InvalidReservationException("Room is not available for the given date");
		}
		
			
	    RoomReservation reservation = new RoomReservation(guest, date, room);
		reservations.add(reservation);
			
		guestReservationTypes.computeIfAbsent(guest, k-> new ArrayList<>()).add("Room");
		return true;
		
	}
	
	public List<String> getReservationTypesForGuest(Guest guest){
		return guestReservationTypes.getOrDefault(guest, new ArrayList<>());
	}
	
	
	public List<Room> getAvailableRooms(){
		return availableRooms;
	}
	
	public static void main(String[] args) {
		
		
		EndUser enduser=new EndUser();
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		Room standardRoom=new Room(1,5,100);
		Room deluxeRoom=new Room(2,6,200);
		
		enduser.addRoom(standardRoom);
		enduser.addRoom(deluxeRoom);
		
		while(true) {
			
			System.out.println("1. Make reservation");
			System.out.println("2. Inquire about room availability");
			System.out.println("3. Book");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice");
			int choice= sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1: System.out.println("Enter Guest name:");
					String guestName=sc.nextLine();
					System.out.println("Enter Guest phone number:");
					String phoneNumber=sc.nextLine();
					Guest guest = new Guest(guestName,phoneNumber);
					
					System.out.println("Enter room number");
					int roomNumber =sc.nextInt();
					sc.nextLine();
					
					System.out.println("Enter reservation date (yyyy-mm-dd): ");
					String reservationDate=sc.nextLine();
					
					
					Room selectedRoom= null;
					for(Room room:enduser.getAvailableRooms()) {
						if(room.getRoomNumber()==roomNumber) {
							selectedRoom=room;
							break;
						}
					}
					try {
					if(selectedRoom!=null) {
						
						boolean roomBooked=enduser.bookRoom(guest, selectedRoom, reservationDate);
						if(roomBooked) {
							System.out.println("Room reserved successfully");
						}
						else {
							System.out.println("Room is not available for the given date");
						}
					}
					}catch(RoomNotFoundException e) {
						System.out.println(e.getMessage());
					}
					catch(InvalidReservationException e) {
						System.out.println(e.getMessage());
					}
					
					break;
					
			 case 2:  System.out.print("Enter room number: ");
             		int roomNumberToInquire = sc.nextInt();
             		sc.nextLine(); 

             		System.out.print("Enter reservation date (YYYY-MM-DD): ");
             		String dateToInquire = sc.nextLine();

             		Room roomToInquire = null;
             		for (Room room : enduser.getAvailableRooms()) {
             			if (room.getRoomNumber() == roomNumberToInquire) {
             				roomToInquire = room;
             				break;
             			}
             		}

             		if (roomToInquire != null) {
             			boolean isAvailable = enduser.isRoomAvailable(roomToInquire, dateToInquire);
             			if (isAvailable) {
             				System.out.println("Room " + roomToInquire.getRoomNumber() + " is available for " + dateToInquire);
             			} else {
             				System.out.println("Room " + roomToInquire.getRoomNumber() + " is not available for " + dateToInquire);
             			}
             		} else {
             			System.out.println("Invalid room number. Please enter a valid room number.");
             		}
             		break;
             		
			 case 3:
             
				 	System.out.print("Enter guest name: ");
				 	String guestNameToBook = sc.nextLine();
				 	System.out.print("Enter guest phone number: ");
				 	String phoneNumberToBook = sc.nextLine();
				 	Guest guestToBook = new Guest(guestNameToBook, phoneNumberToBook);

				 	System.out.print("Enter room number: ");
				 	int roomNumberToBook = sc.nextInt();
				 	sc.nextLine(); 

				 	System.out.print("Enter reservation date (YYYY-MM-DD): ");
				 	String reservationDateToBook = sc.nextLine();

				 	Room selectedRoomToBook = null;
				 	for (Room room : enduser.getAvailableRooms()) {
				 		if (room.getRoomNumber() == roomNumberToBook) {
				 			selectedRoomToBook = room;
				 			break;
				 		}
				 	}
				 	try {
				 	if (selectedRoomToBook != null) {
				 		boolean roomBooked = enduser.bookRoom(guestToBook, selectedRoomToBook, reservationDateToBook);
				 		if (roomBooked) {
				 			System.out.println("Room booked successfully!");
				 		} else {
				 			System.out.println("Room is not available for the given date. Please choose another date.");
				 		}
				 	}
				 	}catch(RoomNotFoundException e) {
				 		System.out.println(e.getMessage());
				 	}catch(InvalidReservationException e) {
				 		System.out.println(e.getMessage());
				 	}
				 	break;
			 case 4:
           
				 System.out.println("Exiting...");
				 System.exit(0);
			 default:
				 System.out.println("Invalid choice. Please select a valid option.");
				 break;
     }
			
			}
		}
	}

