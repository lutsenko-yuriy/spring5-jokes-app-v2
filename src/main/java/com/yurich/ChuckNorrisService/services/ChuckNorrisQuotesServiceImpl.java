package com.yurich.ChuckNorrisService.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesServiceImpl implements ChuckNorrisQuotesService {

    private final ChuckNorrisQuotes quotes;

    public ChuckNorrisQuotesServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getRandomQuote() {
        return quotes.getRandomQuote();
    }
}
