package bookingApp;

class BookTheatreSeat{
	static int totalSeats=20;
	synchronized static void book_seats(int seat) {
		if(totalSeats>=seat) {
			if(seat<totalSeats) {
				System.out.println("seats booked successfully");
				totalSeats -= seat;
				System.out.println("total seats left: "+totalSeats);
			}
		}
		else {
			System.out.println("no more seats available");
			System.out.println("total seats left: "+totalSeats);
		}
	}
}

class Thread1 extends Thread{
	BookTheatreSeat bts;
	int seats;
	public Thread1(BookTheatreSeat bts, int seats) {
		super();
		this.bts = bts;
		this.seats = seats;
	}
	
	@Override
	public void run() {
		bts.book_seats(seats);
	}
}

class Thread2 extends Thread{
	BookTheatreSeat bts;
	int seats;
	public Thread2(BookTheatreSeat bts, int seats) {
		super();
		this.bts = bts;
		this.seats = seats;
	}
	
	@Override
	public void run() {
		bts.book_seats(seats);
	}
}

public class MovieBookingApp {
	public static void main(String[] args) {
		BookTheatreSeat bts = new BookTheatreSeat();
		Thread1 th1 = new Thread1(bts, 7);
		th1.start();
		Thread2 th2 = new Thread2(bts, 8);
		th2.start();
		// Thread2 th3 = new Thread2(bts, 6);
		// th3.start();

		BookTheatreSeat bts1 = new BookTheatreSeat();
		Thread1 th3 = new Thread1(bts1, 5);
		th3.start();
		Thread2 th4 = new Thread2(bts1, 1);
		th4.start();
	}
}
