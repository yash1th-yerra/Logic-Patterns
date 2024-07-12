import java.io.*;

class Pattern {
    void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

    void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    void pattern10(int n) {
        pattern8(n);
        pattern9(n);
    }

    void pattern11(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    void pattern12(int n) {
        for (int i = 0; i <= 2 * n - 1; i++) {
            int star = i;
            if (i > n) {
                star = 2 * n - i;
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            int num;
            if (i % 2 == 0) {
                num = 0;
            } else {
                num = 1;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(num);
                num = 1 - num;
            }
            System.out.println();
        }
    }

    void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    void pattern15(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j < 'A' + n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern18(int n) {
        for (char i = 'A'; i < 'A' + n; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int bp = (2 * i + 1) / 2;
            for (char j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= bp) {

                    ch++;
                } else {

                    ch--;
                }

            }

            System.out.println();
        }
    }

    void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = (char) ('E' - i); j <= 'E'; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    void pattern22(int n) {
        int inis = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            inis += 2;
            System.out.println();
        }
        inis = 2 * n - 2;
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < inis; j++) {

                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            inis -= 2;
            System.out.println();

        }

    }

    void pattern23(int n) {
        int inis = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= inis; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i < n) {
                inis -= 2;
            } else {
                inis += 2;
            }
            System.out.println();
        }

    }

    void pattern24(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {

                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            /*
             * else{
             * System.out.print("*");
             * for(int j=1;j<=n-2;j++){
             * System.out.print(" ");
             * }
             * System.out.print("*");
             * }
             */
            System.out.println();
        }
    }

    void pattern25(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int distance, num;
            for (int j = 1; j <= 2 * n - 1; j++) {
                distance = Math.max(Math.abs(n - i), Math.abs(n - j));
                num = n - distance;
                System.out.print(num);
            }
            System.out.println();
        }
    }

    void pattern26(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = 2 * n - 2 - j;
                int down = 2 * n - 2 - i;
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));

            }
            System.out.println();
        }
    }
}

public class Patterns {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Pattern pt = new Pattern();
            pt.pattern1(n);
            pt.pattern2(n);
            pt.pattern3(n);
            pt.pattern4(n);
            pt.pattern5(n);
            pt.pattern6(n);
            pt.pattern7(n);
            pt.pattern8(n);
            pt.pattern9(n);
            pt.pattern10(n);
            pt.pattern11(n);
            pt.pattern12(n);
            pt.pattern13(n);
            pt.pattern14(n);
            pt.pattern15(n);
            pt.pattern16(n);
            pt.pattern17(n);
            pt.pattern18(n);
            pt.pattern19(n);
            pt.pattern20(n);
            pt.pattern21(n);
            pt.pattern22(n);
            pt.pattern23(n);
            pt.pattern24(n);
            pt.pattern25(n);
            pt.pattern26(n);
        }
    }
}