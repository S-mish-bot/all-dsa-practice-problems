/*
 * You are given two integer arrays students and sandwiches where sandwiches[i]
 * is the type of the i-th sandwich in the stack (i = 0 is the top of the stack)
 * and students[j] is the preference of the j-th student in the initial queue (j
 * = 0 is the front of the queue). Return the number of students that are unable
 * to eat.
 * 
 * Example 1:
 * 
 * Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
 * 
 * Output: 0
 */

package Queue;

public class CountStudentsUnableToEatLunch {

    public static int countStudents(int[] students, int[] sandwiches) {
        int result = students.length;
        //Frequency Array
        int[] counts = new int[2];
        for (int s : students) {
            counts[s]++;
        }

        for (int s : sandwiches) {
            if (counts[s] > 0) {
                result--;
                counts[s]--;
            }
            else break;
        }
        return result;
    }

    public static void main(String args[]) {
        // int[] students = {1, 1, 0, 0};
        // int[] sandwiches = {0, 1, 0, 1};

        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        System.out.println("Number of students can't eat lunch :: "+countStudents(students, sandwiches));
    }

}