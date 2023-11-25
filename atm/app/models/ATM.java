package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class ATM extends Model {
	public String _location;
	public String _managed_by;
	private String _unnamed_Bank_;
}