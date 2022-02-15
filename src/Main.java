import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    int time;
    char c;

    Lecture(int time, char c) {
        this.time = time;
        this.c = c;
    }

    @Override
    public int compareTo(Lecture L) {
        if (this.time == L.time) {
            return this.c - L.c;
        } else {
            return this.time - L.time;
        }
    }
}

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();

            arr.add(new Lecture(a, 's'));
            arr.add(new Lecture(b, 'e'));
        }

        Collections.sort(arr);
        int answer = 0;
        int tmp = 0;

        for (Lecture ob : arr) {
            if (ob.c == 's') {
                tmp++;
            } else {
                tmp--;
            }

            answer = Math.max(answer, tmp);
        }

        System.out.println(answer);

    }
}
