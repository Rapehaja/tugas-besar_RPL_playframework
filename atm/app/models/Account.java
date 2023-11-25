package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Account extends Model {
	public int _number;
	public int _balance;
	public int _withdraw;
	private String _unnamed_Customer_;
	private String _unnamed_Bank_;
	private String _unnamed_ATM_Transactions_;
}