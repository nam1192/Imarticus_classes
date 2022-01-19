package com.javatpoint.mypackage;  
  
import javax.persistence.*;  
  
@Entity  
@DiscriminatorValue("currentaccount")  
public class CurrentAccount extends Account{  
      
@Column(name="overDraftAmount")    
private Double overdraftAmount;  
  


public double getoverDraftAmount() {
	return overdraftAmount;
}

public void setoverDraftamount(Double overdraftamount) {
	this.overdraftAmount = overdraftamount;
}


}