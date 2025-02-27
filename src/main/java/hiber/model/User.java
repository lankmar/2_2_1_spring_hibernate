package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String firstName;

   private String lastName;

   private String email;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "car")
   private Car car;

   public User() {}

   public User(String firstName, String lastName, String email, Car car) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.car = car;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Car getCar() {
      return car;
   }

   public void setCar(Car carId) {
      this.car = carId;
   }

   @Override
   public String toString() {
      return "\nFirst Name = " + firstName + '\'' +
              "\nLast Name = " + lastName + '\'' +
              "\nEmail = " + email + '\'';
   }
}