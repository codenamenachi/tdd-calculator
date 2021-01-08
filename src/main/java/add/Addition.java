package add;

import org.springframework.web.bind.annotation.RestController;

public class Addition {

    public int add(String numbers){

        String delimiter = numbers.split("\\n")[0] != null ? numbers.split("\\n")[0] : ",";
        int sum = 0;
        String negetives = "";
        for(String n : numbers.split(delimiter)){
            int x = Integer.parseInt(n);
            if (x >= 0) {
                if(x <= 1000) sum += Integer.parseInt(n);
            } else
                negetives+=" "+x;
        }
        if(!negetives.isEmpty())
            throw new Exception("negatives not allowed - "+negetives);

        return sum;
    }
}
