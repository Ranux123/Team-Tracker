package org.example.crudbackend.model;

import jakarta.persistence.*;

@Entity
@Table( name = "Employees" )
public class Employee
{
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private long id;

  @Column( name = "First_Name" )
  private String firstName;

  @Column( name = "Last_Name" )
  private String lastName;

  @Column( name = "Email_Id" )
  private String emailId;

  public Employee()
  {

  }

  public Employee( String firstname, String lastName, String emailId )
  {
    this.firstName = firstname;
    this.lastName = lastName;
    this.emailId = emailId;
  }

  public String getEmailId()
  {
    return emailId;
  }

  public void setEmailId( String emailId )
  {
    this.emailId = emailId;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName( String lastName )
  {
    this.lastName = lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName( String firstname )
  {
    this.firstName = firstname;
  }

  public long getId()
  {
    return id;
  }

  public void setId( long id )
  {
    this.id = id;
  }
}
