package onboarding;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class customApplicationTest
{
    @Nested
    class Problem1Test {
        @Test
        void sum()
        {
            List<Integer> human = List.of(123,124);
            List<Integer> results = Arrays.asList(6,7);
            assertThat(Problem1.sum(human)).isEqualTo(results);
        }

        @Test
        void mul()
        {
            List<Integer> human = List.of(123,124);
            List<Integer> results = Arrays.asList(6,8);
            assertThat(Problem1.mul(human)).isEqualTo(results);
        }

        @Test
        void max()
        {
            List<Integer> human = List.of(123,124);
            int result = 8;
            assertThat(Problem1.max(Problem1.sum(human),Problem1.mul(human))).isEqualTo(result);
        }
        @Test
        void compare1()
        {
            int pobi = 1;
            int crong = 2;
            int result = 2;
            assertThat(Problem1.compare(pobi,crong)).isEqualTo(result);
        }
        @Test
        void compare2()
        {
            int pobi = 2;
            int crong = 1;
            int result = 1;
            assertThat(Problem1.compare(pobi,crong)).isEqualTo(result);
        }
        @Test
        void compare3() {
            int pobi = 1;
            int crong = 1;
            int result = 0;
            assertThat(Problem1.compare(pobi, crong)).isEqualTo(result);
        }
    }

    @Nested
    class Problem2Test {
        @Test
        void isUpperCaseException() {
            String cryptogram = "BBB";
            String result = "answer";
            assertThat(Problem2.solution(cryptogram)).isEqualTo(result);
        }

        @Test
        void rangeCaseException() {
            String cryptogram = "";
            String result = "answer";
            assertThat(Problem2.solution(cryptogram)).isEqualTo(result);
        }
    }

    @Nested
    class Problem3Test {
        @Test
        void case1() {
            int number = 0;
            int result = 0;
            assertThat(Problem3.solution(number)).isEqualTo(result);
        }

        @Test
        void case2() {
            int number = 10001;
            int result = 0;
            assertThat(Problem3.solution(number)).isEqualTo(result);
        }
    }

    @Nested
    class Problem4Test {
        @Test
        void case1() {
            char alphabet = '0';
            char result = '0';
            assertThat(Problem4.mixer(alphabet,false)).isEqualTo(result);
        }
        @Test
        void case2() {
            char alphabet = 'A';
            char result = 'Z';
            assertThat(Problem4.mixer(alphabet,true)).isEqualTo(result);
        }
        @Test
        void case3() {
            char alphabet = 'a';
            char result = 'z';
            assertThat(Problem4.mixer(alphabet,false)).isEqualTo(result);
        }
        @Test
        void case4() {
            String word = "Svool, Dliow! 123";
            String result = "Hello, World! 123";
            assertThat(Problem4.solution(word)).isEqualTo(result);
        }
    }

    @Nested
    class Problem5Test {
        @Test
        void case1() {
            int money = 50_237;
            int result = 1;
            assertThat(Problem5.moneyCount(money,50000)).isEqualTo(result);
        }
    }

    @Nested
    class Problem6Test {
        @Test
        void case1() {
            List<List<String>> forms = List.of(
                    List.of("jm@email.com", "제이엠"),
                    List.of("jason@email.com", "제이슨"),
                    List.of("woniee@email.com", "워니"),
                    List.of("mj@email.com", "엠제이"),
                    List.of("nowm@email.com", "이제엠")
            );
            List<String> result = List.of("jason@email.com", "jm@email.com", "mj@email.com");
            assertThat(Problem6.solution(forms)).isEqualTo(result);
        }
    }

    @Nested
    class Problem7Test {
        @Test
        void case1() {
            String user = "mrko";
            List<List<String>> friends = List.of(
                    List.of("donut", "andole"),
                    List.of("donut", "jun"),
                    List.of("donut", "mrko"),
                    List.of("shakevan", "andole"),
                    List.of("shakevan", "jun"),
                    List.of("shakevan", "mrko")
            );
            List<String> visitors = List.of("bedi", "bedi", "donut", "bedi", "shakevan");
            List<String> result = List.of("andole", "jun", "bedi");
            assertThat(Problem7.solution(user, friends, visitors)).isEqualTo(result);
        }
    }

}
