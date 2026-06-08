package BinarySearch;
/*
You are given:
books = [12, 34, 67, 90]
students = 2
Each number represents pages in a book.
Rules:
Every book must be allocated.
Each book is allocated to only one student.
Allocation must be contiguous.
Minimize the maximum pages assigned to any student.
Return the minimum possible value.
*/

public class lAllocateBooks {

    public static boolean canAllocate(int[] books,
                                      int students,
                                      int maxPages) {

        int studentCount = 1;
        int pages = 0;

        for (int book : books) {

            if (pages + book <= maxPages) {

                pages += book;

            } else {

                studentCount++;
                pages = book;

                if (studentCount > students) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int allocateBooks(int[] books,
                                    int students) {

        if (students > books.length) {
            return -1;
        }

        int low = 0;
        int high = 0;

        for (int book : books) {

            low = Math.max(low, book);
            high += book;
        }

        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canAllocate(books, students, mid)) {

                answer = mid;

                // Try smaller answer
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] books = {12, 34, 67, 90};
        int students = 2;

        System.out.println(
                allocateBooks(books, students));
    }
}

/*
Understanding the Problem

Books:

[12, 34, 67, 90]

Students:

2
Allocation 1

Student 1:

12 + 34 = 46

Student 2:

67 + 90 = 157

Maximum pages assigned:

max(46,157) = 157
Allocation 2

Student 1:

12 + 34 + 67 = 113

Student 2:

90

Maximum pages assigned:

max(113,90) = 113
Allocation 3

Student 1:

12

Student 2:

34 + 67 + 90 = 191

Maximum pages assigned:

191

Among all allocations:

157
113
191

Minimum is:

113

Answer:

113
*/