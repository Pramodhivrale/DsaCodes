package in.codes;

public class TowerOfHanoi {

    // Recursive method to solve the Tower of Hanoi problem
    public static void solve(int n, char fromRod, char toRod, char auxRod) {
        // Base case: if there's only one disk, move it from the fromRod to the toRod
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        
        // Recursive case: move n-1 disks from the fromRod to the auxRod
        solve(n - 1, fromRod, auxRod, toRod);
        
        // Move the nth disk from the fromRod to the toRod
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        
        // Move the n-1 disks from the auxRod to the toRod
        solve(n - 1, auxRod, toRod, fromRod);
    }

    // Main method
    public static void main(String[] args) {
        int n = 3; // Number of disks
        solve(n, 'A', 'C', 'B'); // A, B and C are the names of the rods
    }
}

