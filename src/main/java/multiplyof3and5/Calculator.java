package multiplyof3and5;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int calculate(int limit){
        int result = 0;
        for (int i = 0; i < limit; i++) {
            if (i%3 == 0) {
                result += + i;
            } else if (i%5 == 0){
                result += i;
            }

        }

        return result;
    }
}
