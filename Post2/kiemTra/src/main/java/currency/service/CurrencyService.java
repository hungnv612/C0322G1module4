package currency.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService implements ICurrencyService {

    @Override
    public Double change(double usd, double rate) {
        return usd * rate;
    }
}
