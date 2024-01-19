package com.hotel.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "guest")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guest_id")
    private int guestId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "checkin_date")
    private LocalDate checkinDate;

    @Column(name = "checkout_date")
    private LocalDate checkoutDate;

    @ManyToOne
    @JoinColumn(name = "room_no")
    private Room room;

    @OneToMany(mappedBy = "guest", cascade = CascadeType.ALL)
    private List<Service> services;

     
    
    public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}

    

     

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(LocalDate checkinDate) {
		this.checkinDate = checkinDate;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public Guest(int guestId, String name, String email, LocalDate checkinDate, LocalDate checkoutDate, Room room,
			List<Service> services) {
		super();
		this.guestId = guestId;
		this.name = name;
		this.email = email;
		this.checkinDate = checkinDate;
		this.checkoutDate = checkoutDate;
		this.room = room;
		this.services = services;
	}

	 
	@Override
    public String toString() {
        return "Guest [guestId=" + guestId + ", name=" + name + ", email=" + email + ", checkinDate=" + checkinDate
                + ", checkoutDate=" + checkoutDate + ", room=" + room + ", services=" + services + "]";
    }
     
}
