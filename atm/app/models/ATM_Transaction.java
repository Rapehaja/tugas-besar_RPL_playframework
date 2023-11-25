package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class ATM_Transaction extends Model {
	public int _transaction_id;
	public int _date;
	public String _type;
	public int _amount;
	public int _post_balance;
	private String _unnamed_Account_;
}