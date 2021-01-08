package add;

import org.springframework.web.bind.annotation.RestController;

public class Addition {

    public int add(String numbers){

        int sum = 0;
        for(String n : numbers.split(",")){
            sum+=Integer.parseInt(n);
        }

        return sum;
    }
}
