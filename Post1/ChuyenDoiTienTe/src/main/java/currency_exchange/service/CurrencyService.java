package currency_exchange.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService implements ICurrencyService {

    @Override
    public float currency(float rate, float usd) {
        float vnd = rate * usd;
        return vnd;
    }
}
