package currency_exchange.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CurrencyRepository implements ICurrencyRepository{


    @Override
    public float Currency(float rate, float usd) {
        float vnd = rate * usd;
        return vnd;
    }
}
