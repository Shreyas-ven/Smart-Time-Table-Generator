import java.util.*;

class Subject {
    String name;
    String teacher;
    String room;

    Subject(String name, String teacher, String room) {
        this.name = name;
        this.teacher = teacher;
        this.room = room;
    }
}

class Slot {
    String day;
    String time;

    Slot(String day, String time) {
        this.day = day;
        this.time = time;
    }
}

public class Main {

    static Subject[] subjects = {
            new Subject("Math", "Shreyas", "R1"),
            new Subject("Physics", "Tanu", "R2"),
            new Subject("Chemistry", "Shreyas", "R1"),
            new Subject("English", "Rachana", "R3")
    };

    static Slot[] slots = {
            new Slot("Monday", "9 AM"),
            new Slot("Monday", "10 AM"),
            new Slot("Tuesday", "9 AM"),
            new Slot("Tuesday", "10 AM")
    };

    static int[] assign = new int[subjects.length];

    public static void main(String[] args) {

        for (int i = 0; i < assign.length; i++) {
            assign[i] = -1;
        }

        boolean result = generateTimetable(0);

        if (!result) {
            System.out.println("No valid timetable found.");
        }
    }

    static boolean generateTimetable(int index) {

        if (index == subjects.length) {
            printTimetable();
            return true;
        }

        for (int i = 0; i < slots.length; i++) {

            if (isSafe(index, i)) {

                assign[index] = i;

                if (generateTimetable(index + 1)) {
                    return true;
                }

                assign[index] = -1;
            }
        }

        return false;
    }

    static boolean isSafe(int subjectIndex, int slotIndex) {

        for (int i = 0; i < subjectIndex; i++) {

            if (assign[i] == slotIndex) {

                if (subjects[i].teacher.equals(subjects[subjectIndex].teacher)) {
                    return false;
                }

                if (subjects[i].room.equals(subjects[subjectIndex].room)) {
                    return false;
                }
            }
        }

        return true;
    }

    static void printTimetable() {

        System.out.println("Generated Timetable:");
        System.out.println("----------------------");

        for (int i = 0; i < subjects.length; i++) {

            int s = assign[i];

            System.out.println(
                    subjects[i].name + " -> " +
                            slots[s].day + " " +
                            slots[s].time +
                            " | Teacher: " + subjects[i].teacher +
                            " | Room: " + subjects[i].room
            );
        }
    }
}