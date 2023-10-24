/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionandenumsmini;

/**
 *
 * @author 2022299
 */
class Person {
    // Declare instance variables to store information about a person
    int id;
    String firstName;
    String lastName;
    String email;

    // A constructor that initializes a 'Person' object with provided values.
    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    // Override the 'toString' method to provide a custom string representation of the 'Person' object.
    @Override
    public String toString() {
        return id + ": " + firstName + " " + lastName + " (" + email + ")";
        }
    
}
