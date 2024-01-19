package com.hotel.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_no")
    private int roomNo;

    @Column(name = "type")
    private String type;

    @Column(name = "status")
    private String status;

    @Column(name = "rate")
    private double rate;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Guest> guests;

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(int roomNo, String type, String status, double rate, List<Guest> guests) {
		super();
		this.roomNo = roomNo;
		this.type = type;
		this.status = status;
		this.rate = rate;
		this.guests = guests;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}

	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", type=" + type + ", status=" + status + ", rate=" + rate + ", guests="
				+ guests + "]";
	}

     
}