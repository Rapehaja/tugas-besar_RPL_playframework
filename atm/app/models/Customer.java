package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Customer extends ATM {
	public float _name;
	public String _address;
	public int _card_number;
	public int _pin;
	private String _unnamed_Account_;
}