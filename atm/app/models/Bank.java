package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Bank extends Model {
	public int _code;
	public String _address;
	private String _unnamed_ATM_;
	private String _unnamed_Account_;
}