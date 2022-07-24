package currency.service;


import org.springframework.stereotype.Service;

@Service
public class CaculatorService implements ICaculatorService {
    @Override
    public float result(float number1, float number2, String sign) {
        float result;
        switch (sign) {
            case "+":
                result= number1 + number2;
                break;
            case "-":
                result= number1 - number2;
                break;
            case "*":
                result= number1 * number2;
                break;
            case "/":
                result= number1 / number2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sign);
        }
        return result;
    }
}
