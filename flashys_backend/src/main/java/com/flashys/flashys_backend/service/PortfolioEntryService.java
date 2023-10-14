package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.Flash;
import com.flashys.flashys_backend.model.PortfolioEntry;

import java.util.List;

public interface PortfolioEntryService {
    PortfolioEntry createPortfolioEntry(PortfolioEntry portfolioEntry);
    PortfolioEntry getPortfolioEntryById(String portfolioEntryId);
    List<PortfolioEntry> getAllPortfolioEntries();
    void deletePortfolioEntry(String portfolioEntryId);
}
