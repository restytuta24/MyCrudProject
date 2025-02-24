package simplecrud.mycrud.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
    private int id; // Unique identifier for the customer
    private String username;
    private String email;
    private String placeOfResidence;
    
    public Customer() {
		
	}


	// Constructor to initialize the Customer object with id, username, email, and placeOfResidence
    public Customer(int id, String username, String email, String placeOfResidence) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.placeOfResidence = placeOfResidence;
    }
    

	// Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for placeOfResidence
    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    // Setter for placeOfResidence
    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", placeOfResidence='" + placeOfResidence + '\'' +
                '}';
    }
}
