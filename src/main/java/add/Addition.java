package add;

import org.springframework.web.bind.annotation.RestController;

public class Addition {

    public int add(String numbers){
        
        String delimiter = "[,\\n]";
        int sum = 0;
        for(String n : numbers.split(delimiter)){
            sum+=Integer.parseInt(n);
        }

        return sum;
    }
}
