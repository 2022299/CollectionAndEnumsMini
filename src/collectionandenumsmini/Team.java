/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionandenumsmini;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2022299
 */
class Team {
     // Declare an instance variable to store the team's name.
    String name;
    // Declare a list of 'Person' objects to store team members using an ArrayList.
    List<Person> members = new ArrayList<>();

    // A constructor that initializes a 'Team' object with a provided name.
    public Team(String name) {
        this.name = name;
    }
    // A method to add a 'Person' object to the team's list of members.
    public void addMember(Person person) {
        members.add(person);
    }
    // A method to print information about the team, including its name and members.
    public void printTeam() {
        System.out.println("Team Name: " + name);
        System.out.println("Members:");
        for (Person person : members) {
            System.out.println(person);
        }
        System.out.println();
    }
    
}
