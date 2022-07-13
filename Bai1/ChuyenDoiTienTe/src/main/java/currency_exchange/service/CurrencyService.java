package currency_exchange.service;

import currency_exchange.repository.ICurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService implements ICurrencyService {
    @Autowired
    private ICurrencyRepository iCurrencyRepository;

    @Override
    public float currency(float rate, float usd) {
        return iCurrencyRepository.Currency(rate, usd);
    }
}
