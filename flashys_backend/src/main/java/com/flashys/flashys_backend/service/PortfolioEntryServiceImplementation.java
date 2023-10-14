package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.PortfolioEntry;
import com.flashys.flashys_backend.repository.PortfolioEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PortfolioEntryServiceImplementation implements PortfolioEntryService {

    @Autowired
    PortfolioEntryRepository portfolioEntryRepository;

    @Override
    public PortfolioEntry createPortfolioEntry(PortfolioEntry portfolioEntry) {
        return portfolioEntryRepository.save(portfolioEntry);
    }

    @Override
    public PortfolioEntry getPortfolioEntryById(String portfolioEntryId) {
        return portfolioEntryRepository.findById(portfolioEntryId).orElse(null);
    }

    @Override
    public List<PortfolioEntry> getAllPortfolioEntries() {
        return portfolioEntryRepository.findAll();
    }

    @Override
    public void deletePortfolioEntry(String portfolioEntryId) {
        portfolioEntryRepository.deleteById(portfolioEntryId);
    }
}
