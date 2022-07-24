package sandwich.service;

import org.springframework.stereotype.Service;

@Service
public class SandwichServive implements ISandwichServive {
    @Override
    public String returnChose(String[] s) {
        String mess = "";
        if (s.length == 0) {
            return "you didn't choose!";
        } else {
            mess = "you chose: ";
            for (int i = 0; i < s.length; i++) {
                mess += s[i];
                if (i != (s.length - 1)) {
                    mess += ", ";
                }
            }
            return mess;
        }
    }
}
