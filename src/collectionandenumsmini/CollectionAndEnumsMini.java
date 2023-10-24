/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionandenumsmini;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author 2022299
 */
public class CollectionAndEnumsMini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Create a list to store instances of the 'Person' class
        List<Person> people = new ArrayList<>();
        // Create a list to store instances of the 'Team' class
        List<Team> teams = new ArrayList<>();
        // Create a random number generator
        Random random = new Random();

        // Attempt to read data from a CSV file using a BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("MOCK_DATA.csv"))) {
            String line;
            // Read each line from the CSV file
            while ((line = reader.readLine()) != null) {
                // Split the line into parts using a comma as the delimiter
                String[] parts = line.split(",");
                // Extract data from parts and create a 'Person' object, then add it to the 'people' list
                int id = Integer.parseInt(parts[0]);
                String firstName = parts[1];
                String lastName = parts[2];
                String email = parts[3];
                people.add(new Person(id, firstName, lastName, email));
            }
        } catch (Exception e) {
            // Handle and display an error message if there's an issue reading the file
            System.err.println("Error reading the file.");
            return;
        }

        // Create 20 'Team' objects, each with a unique name, and populate them with up to 5 members
        for (int i = 1; i <= 20; i++) {
            Team team = new Team("Team " + i);
            // Add up to 5 random 'Person' objects to the team, removing them from the 'people' list
            while (team.members.size() < 5 && !people.isEmpty()) {
                int randomIndex = random.nextInt(people.size());
                Person person = people.remove(randomIndex);
                team.addMember(person);
            }
            // Add the team to the 'teams' list
            teams.add(team);
        }

        // Iterate through the 'teams' list and print information about each team
        for (Team team : teams) {
            team.printTeam();
        }
    }
    
}
